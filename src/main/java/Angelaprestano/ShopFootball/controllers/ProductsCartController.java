package Angelaprestano.ShopFootball.controllers;

import Angelaprestano.ShopFootball.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productsCart")
public class ProductsCartController {
    @Autowired
    private ProductsService productsService;

}
