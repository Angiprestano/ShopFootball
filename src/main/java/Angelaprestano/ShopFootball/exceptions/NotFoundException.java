package Angelaprestano.ShopFootball.exceptions;

import java.util.UUID;

public class NotFoundException extends RuntimeException {
    public NotFoundException(UUID id) {
        super("Cart with id: " + id + " not found");
    }

    public NotFoundException(long id) {
        super("Cart with id: " + id + " not found");
    }

    public NotFoundException(String message) {
        super(message);
    }
}
