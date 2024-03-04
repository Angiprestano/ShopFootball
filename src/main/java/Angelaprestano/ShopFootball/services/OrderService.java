package Angelaprestano.ShopFootball.services;

import Angelaprestano.ShopFootball.entities.Order;
import Angelaprestano.ShopFootball.entities.Products;
import Angelaprestano.ShopFootball.entities.User;
import Angelaprestano.ShopFootball.payloads.OrderDetailDTO;
import Angelaprestano.ShopFootball.payloads.OrderPayload.OrderDTO;
import Angelaprestano.ShopFootball.payloads.OrderPayload.OrderResponseDTO;
import Angelaprestano.ShopFootball.payloads.ProductsDTO;
import Angelaprestano.ShopFootball.repositories.OrderDAO;
import Angelaprestano.ShopFootball.repositories.ProductsDAO;
import Angelaprestano.ShopFootball.repositories.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class OrderService {
    @Autowired
    private OrderDAO orderDAO;

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private ProductsDAO productsDAO;

    public Order createOrder(OrderDTO orderDTO, User user) {

        List<Products> productList=new ArrayList<>();
        double total=0.0;
        User founds= userDAO.findById(user.getId())
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + user.getId()));
        for(UUID idProducts: orderDTO.listProduct()){
            Products found= productsDAO.findById(idProducts)
                    .orElseThrow(() -> new RuntimeException("Utente non trovato con ID: " + idProducts));
            productList.add(found);
            total += found.getPrice();
        }
        Order order = new Order();
        order.setUser(founds);
        order.setToPay(total);
        order.setDetailsProduct(productList);
        return orderDAO.save(order);
    }

    public List<Order> getOrderUser(User user) {
        return orderDAO.findByUser(user);
    }

    public Order findById(UUID id){
        return orderDAO.findById(id).orElseThrow(() -> new RuntimeException("Utente non trovato con ID: " + id));
    }
}


