package Angelaprestano.ShopFootball.services;

import Angelaprestano.ShopFootball.entities.Enum.Categories;
import Angelaprestano.ShopFootball.entities.Enum.TypeofProduct;
import Angelaprestano.ShopFootball.entities.Products;
import Angelaprestano.ShopFootball.exceptions.NotFoundException;
import Angelaprestano.ShopFootball.payloads.ProductsDTO;
import Angelaprestano.ShopFootball.repositories.ProductsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductsService {
    @Autowired
    private ProductsDAO productsDAO;


    public Page<Products> getProducts(int page, int size, String orderBy) {
        if (size >= 100) size = 100;
        Pageable pageable = PageRequest.of(page, size, Sort.by(orderBy));
        return productsDAO.findAll(pageable);
    }

    public Products findById(UUID id) {
        return productsDAO.findById(id).orElseThrow(() -> new NotFoundException(id));
    }

    public Products save(ProductsDTO body, UUID id) {
        Products newproducts = new Products();
        newproducts.setImage(body.image());
        newproducts.setTitle(body.title());
        newproducts.setDescription(body.description());
        newproducts.setPrice(body.price());
        newproducts.setCategories(body.categories());
        newproducts.setTypeofProduct(body.typeofProduct());
        newproducts.setSize(body.size());
        return productsDAO.save(newproducts);
    }

    public ProductsDTO getProductsById(UUID id) {
        Products products = productsDAO.findById(id)
                .orElseThrow(() -> new NotFoundException("Prodotto non trovato con ID: " + id));
        return new ProductsDTO(
                products.getId(),
                products.getImage(),
                products.getTitle(),
                products.getDescription(),
                products.getColor(),
                products.getPrice(),
                products.getSize(),
                products.getCategories(),
                products.getTypeofProduct()
        );
    }

    public Products findByIdAndUpdate(UUID id, ProductsDTO body) {
        Products found = this.findById(id);
        found.setImage(body.image());
        found.setTitle(body.title());
        found.setDescription(body.description());
        found.setPrice(body.price());
        found.setCategories(body.categories());
        found.setTypeofProduct(body.typeofProduct());
        found.setSize(body.size());
        return productsDAO.save(found);
    }

    public void findByIdAndDelete(UUID id) {
        Products found = this.findById(id);
        productsDAO.delete(found);
    }

    public List<Products> getAllAccessories() {
        return productsDAO.findByTypeofProduct(TypeofProduct.ACCESSORIES);
    }

    public List<Products> getSalesTshirt() {
        return productsDAO.findByTypeofProductAndCategories(TypeofProduct.SALES, Categories.UNISEX);
    }
    public List<Products> getPantsMan() {
        return productsDAO.findByTypeofProductAndCategories(TypeofProduct.PANTS, Categories.MAN);
    }


    public List<Products> getCalcioWomen() {
        return productsDAO.findByTypeofProductAndCategories(TypeofProduct.SETFOOTBALL, Categories.WOMEN);
    }
    public List<Products> getCalcioMan() {
        return productsDAO.findByTypeofProductAndCategories(TypeofProduct.SETFOOTBALL, Categories.MAN);
    }
    public List<Products> getTshirtForKids() {
        return productsDAO.findByTypeofProductAndCategories(TypeofProduct.TSHIRT, Categories.KIDS);
    }
    public List<Products> getCalcioKids() {
        return productsDAO.findByTypeofProductAndCategories(TypeofProduct.SETFOOTBALL, Categories.KIDS);
    }
    public List<Products> getSuitForKids() {
        return productsDAO.findByTypeofProductAndCategories(TypeofProduct.SUIT, Categories.KIDS);
    }
    public List<Products> getFelpaForKids() {
        return productsDAO.findByTypeofProductAndCategories(TypeofProduct.SWEATSHIRT, Categories.KIDS);
    }
    public List<Products> getPajamasForKids() {
        return productsDAO.findByTypeofProductAndCategories(TypeofProduct.PAJAMAS, Categories.KIDS);
    }
    public List<Products> getSuitForWomen() {
        return productsDAO.findByTypeofProductAndCategories(TypeofProduct.SUIT, Categories.WOMEN);
    }
    public List<Products> getSuitForMan() {
        return productsDAO.findByTypeofProductAndCategories(TypeofProduct.SUIT, Categories.MAN);
    }
    public List<Products> getPajamasForMan() {
        return productsDAO.findByTypeofProductAndCategories(TypeofProduct.PAJAMAS, Categories.MAN);
    }
    public List<Products> getPajamasForWomen() {
        return productsDAO.findByTypeofProductAndCategories(TypeofProduct.PAJAMAS, Categories.WOMEN);
    }
    public List<Products> getSweatshirtForWomen() {
        return productsDAO.findByTypeofProductAndCategories(TypeofProduct.SWEATSHIRT, Categories.WOMEN);
    }
    public List<Products> getSweatshirtForMan() {
        return productsDAO.findByTypeofProductAndCategories(TypeofProduct.SWEATSHIRT, Categories.MAN);
    }
    public List<Products> getTshirtsForMan() {
        return productsDAO.findByTypeofProductAndCategories(TypeofProduct.TSHIRT, Categories.MAN);
    }
    public List<Products> getTshirtsForWomen() {
        return productsDAO.findByTypeofProductAndCategories(TypeofProduct.TSHIRT, Categories.WOMEN);
    }

    public List<Products> getProductsFilteredByPrice(double minPrice, double maxPrice) {
        return productsDAO.findByPriceBetween(minPrice, maxPrice);
    }

    public List<Products> getProductsFilteredByTitle(String title) {
        return productsDAO.findByTitle(title);
    }
    public List<Products> getProductsFilteredByTitleContaining(String partOfTitle) {
        return productsDAO.findByTitleContaining(partOfTitle);
    }

}
