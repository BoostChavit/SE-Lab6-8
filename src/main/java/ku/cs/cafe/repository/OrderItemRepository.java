package ku.cs.cafe.repository;

import ku.cs.cafe.entity.OrderItem;
import ku.cs.cafe.entity.OrderItemKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemKey> {
}
