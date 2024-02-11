package Angelaprestano.ShopFootball.payloads;

import java.util.UUID;

public record OrderDetailDTO(
        UUID idProduct,
        int quantity
) {
}
