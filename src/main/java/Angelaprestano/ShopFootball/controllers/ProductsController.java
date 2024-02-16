package Angelaprestano.ShopFootball.controllers;

import Angelaprestano.ShopFootball.entities.Products;
import Angelaprestano.ShopFootball.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {
    @Autowired
    private ProductsService productsService;

    @GetMapping
    public Page<Products> getProducts(@RequestParam(defaultValue = "1") int page,
                                      @RequestParam(defaultValue = "10")int size,
                                      @RequestParam(defaultValue = "nome")String orderBy)
    {
        return productsService.getProducts(page,size,orderBy);
    }

    @GetMapping("/tshirts/man")
    public List<Products> getTshirtsForMan() {
        return productsService.getTshirtsForMan();
    }
    @GetMapping("/tshirts/women")
    public List<Products> getTshirtsForWomen() {
        return productsService.getTshirtsForWomen();
    }

    @GetMapping("/filtered")
    public List<Products> getFilteredProducts() {
        double minPrice = 20.00;
        double maxPrice = 40.00;
        return productsService.getProductsFilteredByPrice(minPrice, maxPrice);
    }

    @GetMapping("/product_title")
    public List<Products> getFindByTitle(@RequestParam String title) {
        return productsService.getProductsFilteredByTitle(title);
    }

    @GetMapping("/part_title")
    public List<Products> getProductsFilteredByTitleContaining(@RequestParam String partOfTitle) {
        return productsService.getProductsFilteredByTitleContaining(partOfTitle);
    }
    }

