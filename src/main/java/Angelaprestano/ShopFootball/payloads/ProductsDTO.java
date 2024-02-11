package Angelaprestano.ShopFootball.payloads;

import Angelaprestano.ShopFootball.entities.Enum.Categories;
import Angelaprestano.ShopFootball.entities.Enum.Size;
import Angelaprestano.ShopFootball.entities.Enum.TypeofProduct;

import java.lang.reflect.Type;
import java.util.UUID;

public record ProductsDTO(
                          UUID id,
                           String image,
                          String title,
                          String description,
                          String color,
                          double price,
                          Size size,
                          Categories categories,
                          TypeofProduct typeofProduct
) {
}
