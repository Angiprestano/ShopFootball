package Angelaprestano.ShopFootball.payloads;

import java.util.List;

public record ErrorPayloadList(String message,
                               List<String> errorsList) {
}
