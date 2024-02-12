package Angelaprestano.ShopFootball.payloads.OrderPayload;

import Angelaprestano.ShopFootball.payloads.ProductsDTO;

import java.util.List;
import java.util.UUID;

public record OrderResponseDTO(
        UUID idOrder,
        List<ProductsDTO> products,
        UUID idUser,
        String userName,
        String userSurname,
        String userEmail,
        String address,
        double totalToPay
) {
}
