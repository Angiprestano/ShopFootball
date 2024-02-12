package Angelaprestano.ShopFootball.payloads.OrderPayload;

import Angelaprestano.ShopFootball.payloads.OrderDetailDTO;

import java.util.List;
import java.util.UUID;

public record OrderDTO(
        UUID idUser,
        UUID idCart,
        String address,
        List<OrderDetailDTO> orderDetail

) {
    public OrderDTO withAddress(String address) {
        return new OrderDTO(idUser, idCart, address, orderDetail);
    }
}
