package Angelaprestano.ShopFootball.entities;


import Angelaprestano.ShopFootball.entities.Enum.Genres;
import Angelaprestano.ShopFootball.entities.Enum.Size;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Products {
    protected String image;
    protected String title;
    protected double price;
    protected String color;
    protected Size size;
    protected Genres genres;
}
