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

 //   List<Products> tshirtsForWomen = productsDAO.findByTypeofProductAndCategories(TypeofProduct.TSHIRT, Categories.WOMEN);

 //   public List<Products> getTshirtsForWomen() {
 //       return productsDAO.findByTypeofProductAndCategories(TypeofProduct.TSHIRT, Categories.WOMEN);
//    }
}
