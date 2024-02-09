package Angelaprestano.ShopFootball.repositories;

import Angelaprestano.ShopFootball.entities.Enum.Categories;
import Angelaprestano.ShopFootball.entities.Enum.Size;
import Angelaprestano.ShopFootball.entities.Enum.TypeofProduct;
import Angelaprestano.ShopFootball.entities.Products;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Repository
public interface ProductsDAO extends JpaRepository<Products, UUID> {
   @Query("SELECT m FROM Products m WHERE m.typeofProduct =: typeofProduct")
   Page<Products> findByTypeofProduct(Pageable pageable, @Param("typeofproduct") TypeofProduct TypeofProduct);

    @Query("SELECT m FROM Products m WHERE m.categories =: categories")
    Page<Products> findByCategories(Pageable pageable, @Param("categories") Categories categories);

    @Query("SELECT m FROM Products m WHERE m.typeofProduct =: typeofProduct AND m.categories =: categories")
    Page<Products> findBySize(Pageable pageable, @Param("size")Size size);

    List<Products> findByTypeofProductAndCategories(TypeofProduct typeofProduct, Categories categories);
    List<Products> findByTitle(String title);
    List<Products> findByPriceBetween(double minPrice, double maxPrice);
    List<Products> findByTitleContaining(String partOfTitle);
}
