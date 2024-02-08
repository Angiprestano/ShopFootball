package Angelaprestano.ShopFootball.repositories;

import Angelaprestano.ShopFootball.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ProductsDAO extends JpaRepository<Products, UUID> {
    Optional<Products> findByTitle(String title);
    Optional<Products> findByPrice(double price);
}
