package Angelaprestano.ShopFootball.entities;

import Angelaprestano.ShopFootball.entities.Enum.Categories;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Accessories{
    private String image;
    private String title;
    private double price;
    private String color;
    private Categories genres;
}
