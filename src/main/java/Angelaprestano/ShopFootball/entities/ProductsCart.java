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
    @OneToMany
    @JoinColumn(name = "cart_id")
    private List<Products> products = new ArrayList<>();
    private LocalDateTime creationDate;
    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

}