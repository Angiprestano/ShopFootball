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

 //   @GetMapping("/tshirts/women")
  //  public List<Products> getTshirtsForWomen() {
  //      return productsService.getTshirtsForWomen();
    }

