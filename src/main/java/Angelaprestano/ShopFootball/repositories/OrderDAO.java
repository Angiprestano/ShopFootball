package Angelaprestano.ShopFootball.repositories;

import Angelaprestano.ShopFootball.entities.Order;
import Angelaprestano.ShopFootball.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface OrderDAO extends JpaRepository<Order, UUID> {
    Optional<Order> findById (UUID id);
    List<Order> findByUser(User user);
}
