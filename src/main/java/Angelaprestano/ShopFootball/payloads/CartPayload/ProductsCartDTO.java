package Angelaprestano.ShopFootball.payloads.CartPayload;

import Angelaprestano.ShopFootball.entities.Products;

import java.time.LocalDateTime;
import java.util.List;

public record ProductsCartDTO(
        LocalDateTime creationDate,
        double totalCart
) {
}
