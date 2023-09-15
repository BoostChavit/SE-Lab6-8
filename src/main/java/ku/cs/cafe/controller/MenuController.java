package ku.cs.cafe.controller;

import ku.cs.cafe.entity.Menu;
import ku.cs.cafe.model.MenuRequest;
import ku.cs.cafe.service.CategoryService;
import ku.cs.cafe.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/menus")
public class MenuController {
    @Autowired
    private MenuService menuService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public String getAllMenu(Model model) {
        model.addAttribute("categories", categoryService.getAllCategories());
        return "menu-all";
    }

    @GetMapping("/add")
    public String getAddMenuPage(Model model) {
        model.addAttribute("categories", categoryService.getAllCategories());
        return "menu-add";
    }

    @PostMapping("/add")
    public String create(@ModelAttribute MenuRequest menuRequest, Model model) {
        menuService.create(menuRequest);
        model.addAttribute("menus", menuService.getAllMenu());
        return "redirect:/menus";
    }

    @GetMapping("/{id}")
    public String getOneMenu(@PathVariable UUID id, Model model) {
        Menu menu = menuService.getOneById(id);
        model.addAttribute("menu", menu);
        return "menu-view";
    }


}