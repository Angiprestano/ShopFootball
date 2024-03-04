package Angelaprestano.ShopFootball.entities;


import Angelaprestano.ShopFootball.entities.Enum.Categories;
import Angelaprestano.ShopFootball.entities.Enum.Size;
import Angelaprestano.ShopFootball.entities.Enum.TypeofProduct;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties({"orderList"})
public class Products {
    @Id
    @GeneratedValue
    protected UUID id;
    protected String image;
    protected String title;
    protected String description;
    protected double price;
    protected String priceId;
    protected String color;
    @Enumerated(EnumType.STRING)
    protected Size size;
    @Enumerated(EnumType.STRING)
    protected Categories categories;
    @Enumerated(EnumType.STRING)
    protected TypeofProduct typeofProduct;
    @ManyToMany
    @JoinTable(name = "order_product", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "order_id"))
    private List<Order> orderList;

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

    public Products(String image, String title, String description, double price, String priceId, String color, Size size, Categories categories, TypeofProduct typeofProduct) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.price = price;
        this.priceId = priceId;
        this.color = color;
        this.size = size;
        this.categories = categories;
        this.typeofProduct = typeofProduct;
    }
}
