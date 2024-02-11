package Angelaprestano.ShopFootball.controllers;

import Angelaprestano.ShopFootball.entities.Products;
import Angelaprestano.ShopFootball.entities.ProductsCart;
import Angelaprestano.ShopFootball.services.ProductsCartService;
import Angelaprestano.ShopFootball.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/productsCart")
public class ProductsCartController {
    @Autowired
    private ProductsCartService productsCartService;

    @PostMapping("/create")
    public ProductsCart productsCart() {
        return productsCartService.createProductCart();
    }

    @PostMapping("/{cartId}/addProducts")
    public ProductsCart addProduct(@PathVariable UUID cartId, @RequestBody List<UUID> ProductId) {
        return productsCartService.addProductAtCartVoid(cartId, ProductId );
    }
}
