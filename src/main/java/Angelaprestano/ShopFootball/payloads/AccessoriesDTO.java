package Angelaprestano.ShopFootball.payloads;

import Angelaprestano.ShopFootball.entities.Enum.Categories;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record AccessoriesDTO(
        @NotEmpty
        String image,
        @NotEmpty
        String title,
        @NotNull
        double price,
        @NotEmpty
        String color,
        @NotEmpty
        Categories genres)
{
}
