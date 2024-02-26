package Angelaprestano.ShopFootball.payloads.OrderPayload;

import Angelaprestano.ShopFootball.payloads.OrderDetailDTO;

import java.util.List;
import java.util.UUID;

public record OrderDTO(
      List<UUID> listProduct
) {

}
