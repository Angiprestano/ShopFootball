package Angelaprestano.ShopFootball.entities;


import Angelaprestano.ShopFootball.entities.Enum.Categories;
import Angelaprestano.ShopFootball.entities.Enum.Size;
import Angelaprestano.ShopFootball.entities.Enum.TypeofProduct;
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
    protected String description;
    protected double price;
    protected String color;
    @Enumerated(EnumType.STRING)
    protected Size size;
    @Enumerated(EnumType.STRING)
    protected Categories categories;
    @Enumerated(EnumType.STRING)
    protected TypeofProduct typeofProduct;

    public Products(String image, String title, String description, double price, String color, Size size, Categories categories, TypeofProduct typeofProduct) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.price = price;
        this.color = color;
        this.size = size;
        this.categories = categories;
        this.typeofProduct = typeofProduct;
    }
}
