package Angelaprestano.ShopFootball.controllers;

import Angelaprestano.ShopFootball.entities.Order;
import Angelaprestano.ShopFootball.entities.User;
import Angelaprestano.ShopFootball.payloads.OrderPayload.OrderDTO;
import Angelaprestano.ShopFootball.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/creatOrder")
    public Order createOrdine(@RequestBody OrderDTO orderDTO, @AuthenticationPrincipal User user) {
        return orderService.createOrder(orderDTO,user);
    }

    @GetMapping("/user")
    public List<Order> getOrderUser(@AuthenticationPrincipal User user) {
        return orderService.getOrderUser(user);
    }

    @GetMapping("/{id}")
    public Order findById(@PathVariable UUID id ){
        return orderService.findById(id);
    }
}
