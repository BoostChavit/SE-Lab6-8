package ku.cs.cafe.model;

import lombok.Data;

import java.util.UUID;

@Data
public class MenuRequest {
    private String name;
    private Double price;
    private UUID categoryId;
}
