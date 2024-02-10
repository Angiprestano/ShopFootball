package Angelaprestano.ShopFootball.services;
import Angelaprestano.ShopFootball.entities.Products;
import Angelaprestano.ShopFootball.entities.ProductsCart;
import Angelaprestano.ShopFootball.exceptions.NotFoundException;
import Angelaprestano.ShopFootball.payloads.CartPayload.ProductsCartDTO;
import Angelaprestano.ShopFootball.repositories.OrderDAO;
import Angelaprestano.ShopFootball.repositories.ProductsCartDAO;
import Angelaprestano.ShopFootball.repositories.ProductsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ProductsCartService {
    @Autowired
    ProductsCartDAO productsCartDAO;
    @Autowired
    ProductsDAO productsDAO;
    @Autowired
    OrderDAO orderDAO;

    public Page<ProductsCart> getProductCart(int page, int size, String orderBy) {
        if (size >= 100) size = 100;
        Pageable pageable = PageRequest.of(page, size, Sort.by(orderBy));
        return productsCartDAO.findAll(pageable);
    }

    public ProductsCart findById(UUID id) {
        return productsCartDAO.findById(id).orElseThrow(() -> new NotFoundException(id));
    }

    public ProductsCart save(UUID idProduct,UUID idOrder, ProductsCartDTO body) {
        ProductsCart newProductCart = new ProductsCart();
        List<Products> prodottoList= new ArrayList<>();
        prodottoList.add(productsDAO.findById(idProduct).orElseThrow(() -> new NotFoundException(idProduct)));
        newProductCart.setProducts(prodottoList);
        newProductCart.setOrder(orderDAO.findById(idOrder).orElseThrow(() -> new NotFoundException(idOrder)));
        newProductCart.setCreationDate(body.creationDate());
        return productsCartDAO.save(newProductCart);
    }
    public ProductsCart findByIdAndUpdate(UUID id, ProductsCartDTO body) {
        ProductsCart found = this.findById(id);
        found.setCreationDate(body.creationDate());
        return productsCartDAO.save(found);
    }

    public void findByIdAndDelete(UUID id) {
        ProductsCart found = this.findById(id);
        productsCartDAO.delete(found);
    }

    public ProductsCart createProductCart() {
        ProductsCart productsCart = new ProductsCart();
        productsCart.setCreationDate(LocalDateTime.now());
        return productsCartDAO.save(productsCart);
    }

    public ProductsCart addProductAtCartVoid(UUID cartId, List<UUID> ProductId) {

        ProductsCart cart = productsCartDAO.findById(cartId)
                .orElseThrow(() -> new RuntimeException("Carrello non trovato con ID: " + cartId));

        if (cart.getProducts() == null) {
            cart.setProducts(new ArrayList<>());
        }

        for (UUID idProduct : ProductId) {
            Products products = productsDAO.findById(idProduct)
                    .orElseThrow(() -> new RuntimeException("Product with id not found: " + idProduct));
            cart.getProducts().add(products);
        }
        productsCartDAO.save(createProductCart());
        return cart;
    }
}
