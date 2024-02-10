package Angelaprestano.ShopFootball.controllers;

import Angelaprestano.ShopFootball.entities.Order;
import Angelaprestano.ShopFootball.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/createOrder")
    public Order createOrder(@RequestParam UUID idUser, @RequestParam UUID idCart) {
        return orderService.createOrder(idUser, idCart);
    }
}
