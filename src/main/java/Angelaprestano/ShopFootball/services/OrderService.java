package Angelaprestano.ShopFootball.services;

import Angelaprestano.ShopFootball.entities.Order;
import Angelaprestano.ShopFootball.entities.Products;
import Angelaprestano.ShopFootball.entities.ProductsCart;
import Angelaprestano.ShopFootball.entities.User;
import Angelaprestano.ShopFootball.repositories.OrderDAO;
import Angelaprestano.ShopFootball.repositories.ProductsCartDAO;
import Angelaprestano.ShopFootball.repositories.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {
    @Autowired
    private OrderDAO orderDAO;

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private ProductsCartDAO productsCartDAO;

    public Order createOrder(UUID idUser, UUID idCart) {
        User user = userDAO.findById(idUser)
                .orElseThrow(() -> new RuntimeException("Utente not found con ID: " + idUser));

        ProductsCart cart = productsCartDAO.findById(idCart)
                .orElseThrow(() -> new RuntimeException("Carrello non trovato con ID: " + idCart));

        double total = calcolaTotale(cart);

        // Creo un nuovo oggetto Ordine e imposta i campi
        Order order = new Order();
        order.setUser(user);
        order.setProductsCart(cart);
        order.setToPay(total);
        order = orderDAO.save(order);
        cart.setOrder(order);
        productsCartDAO.save(cart);
        return order;
    }

    private double calcolaTotale(ProductsCart cart) {

        return cart.getProducts().stream()
                .mapToDouble(Products::getPrice)
                .sum();
    }
}
