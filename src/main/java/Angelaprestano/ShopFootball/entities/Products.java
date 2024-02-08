package Angelaprestano.ShopFootball.entities;


import Angelaprestano.ShopFootball.entities.Enum.Categories;
import Angelaprestano.ShopFootball.entities.Enum.Size;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Products {
    @Id
    @GeneratedValue
    protected UUID id;
    protected String image;
    protected String title;
    protected double price;
    protected String color;
    protected Size size;
    protected Categories categories;
}
