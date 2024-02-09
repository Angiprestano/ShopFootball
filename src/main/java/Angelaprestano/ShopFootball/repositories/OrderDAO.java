package Angelaprestano.ShopFootball.repositories;

import Angelaprestano.ShopFootball.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderDAO extends JpaRepository<Order, UUID> {
}
