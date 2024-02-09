package Angelaprestano.ShopFootball.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    @Id
    @GeneratedValue
    private UUID id;
    @OneToMany
    private ProductsCart productsCart;
    private double payment;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
