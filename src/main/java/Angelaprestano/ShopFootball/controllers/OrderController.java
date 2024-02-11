package Angelaprestano.ShopFootball.controllers;

import Angelaprestano.ShopFootball.entities.Order;
import Angelaprestano.ShopFootball.payloads.OrderPayload.OrderDTO;
import Angelaprestano.ShopFootball.payloads.OrderPayload.OrderResponseDTO;
import Angelaprestano.ShopFootball.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/creatOrder")
    public OrderResponseDTO createOrder(@RequestBody OrderDTO orderDTO) {
        return orderService.createOrder(orderDTO);
    }
}
