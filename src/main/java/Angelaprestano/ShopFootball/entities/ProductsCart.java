package Angelaprestano.ShopFootball.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductsCart {
    @Id
    @GeneratedValue
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private List<Products> products = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    private LocalDateTime creationDate;
    private double totalCart;
}