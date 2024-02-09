package Angelaprestano.ShopFootball;

import Angelaprestano.ShopFootball.repositories.ProductsCartDAO;
import Angelaprestano.ShopFootball.services.ProductsCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class ProductCartRunner {
    @Autowired
    private ProductsCartService productsCartService;
    @Autowired
    private ProductsCartDAO productsCartDAO;
}
