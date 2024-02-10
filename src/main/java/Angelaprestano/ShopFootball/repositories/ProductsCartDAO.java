package Angelaprestano.ShopFootball.repositories;

import Angelaprestano.ShopFootball.entities.ProductsCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ProductsCartDAO extends JpaRepository<ProductsCart, UUID> {
}