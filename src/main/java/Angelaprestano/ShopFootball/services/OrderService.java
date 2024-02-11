package Angelaprestano.ShopFootball.services;

import Angelaprestano.ShopFootball.entities.Order;
import Angelaprestano.ShopFootball.entities.Products;
import Angelaprestano.ShopFootball.entities.ProductsCart;
import Angelaprestano.ShopFootball.entities.User;
import Angelaprestano.ShopFootball.payloads.OrderDetailDTO;
import Angelaprestano.ShopFootball.payloads.OrderPayload.OrderDTO;
import Angelaprestano.ShopFootball.payloads.OrderPayload.OrderResponseDTO;
import Angelaprestano.ShopFootball.payloads.ProductsDTO;
import Angelaprestano.ShopFootball.repositories.OrderDAO;
import Angelaprestano.ShopFootball.repositories.ProductsCartDAO;
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

    @Autowired
    private ProductsCartDAO productsCartDAO;

    private List<ProductsDTO> recuperateDetailProduct(OrderDTO orderDTO) {
        List<ProductsDTO> detailProduct = new ArrayList<>();
        for (OrderDetailDTO detail : orderDTO.orderDetail()) {
            Products products = productsDAO.findById(detail.idProduct())
                    .orElseThrow(() -> new RuntimeException("Product not found with ID: " + detail.idProduct()));
            detailProduct.add(new ProductsDTO(
                    products.getId(),
                    products.getImage(),
                    products.getTitle(),
                    products.getDescription(),
                    products.getColor(),
                    products.getPrice(),
                    products.getSize(),
                    products.getCategories(),
                    products.getTypeofProduct()

            ));
        }
        return detailProduct;
    }

    private double recuperatePriceProduct(UUID idProduct) {
        Products product = productsDAO.findById(idProduct)
                .orElseThrow(() -> new RuntimeException("Product not found with ID: " + idProduct));
        // mi  Restituisce il prezzo di un prodotto recuperato dal DB
        return product.getPrice();
    }

    private double totalCalculation(List<OrderDetailDTO> orderDetail) {
        if (orderDetail == null) {
            return 0.0;
        }
        return orderDetail.stream()
                .mapToDouble(detail -> {

                    return detail.quantity() * recuperatePriceProduct(detail.idProduct());
                })
                .sum();
    }

    public OrderResponseDTO createOrder(OrderDTO orderDTO) {

        User user = userDAO.findById(orderDTO.idUser())
                .orElseThrow(() -> new RuntimeException("Utente non trovato con ID: " + orderDTO.idUser()));

        ProductsCart cart = productsCartDAO.findById(orderDTO.idCart())
                .orElseThrow(() -> new RuntimeException("Carrello non trovato con ID: " + orderDTO.idCart()));

        double totalToPay = totalCalculation(orderDTO.orderDetail());
        Order order = new Order();
        order.setUser(user);
        order.setProductsCart(cart);
        order.setToPay(totalToPay);
        order = orderDAO.save(order);
        List<ProductsDTO> detailProducts= recuperateDetailProduct(orderDTO);
        return new OrderResponseDTO(
                order.getId(),
                detailProducts,
                user.getId(),
                user.getName(),
                user.getSurname(),
                user.getEmail(),
                totalToPay
        );
    }

    private double totalCalculation(ProductsCart cart) {

        return cart.getProducts().stream()
                .mapToDouble(Products::getPrice)
                .sum();
    }
}
