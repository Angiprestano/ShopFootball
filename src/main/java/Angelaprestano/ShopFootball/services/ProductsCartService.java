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

    public ProductsCart save(UUID idProdotto,UUID idOrdine, ProductsCartDTO body) {
        ProductsCart newProdottoCarello = new ProductsCart();
        List<Products> prodottoList= new ArrayList<>();
        prodottoList.add(productsDAO.findById(idProdotto).orElseThrow(() -> new NotFoundException(idProdotto)));
        newProdottoCarello.setProducts(prodottoList);
        newProdottoCarello.setOrder(orderDAO.findById(idOrdine).orElseThrow(() -> new NotFoundException(idOrdine)));
        newProdottoCarello.setCreationDate(body.creationDate());
        newProdottoCarello.setTotalCart(body.totalCart());
        return productsCartDAO.save(newProdottoCarello);
    }
    public ProductsCart findByIdAndUpdate(UUID id, ProductsCartDTO body) {
        ProductsCart found = this.findById(id);
        found.setCreationDate(body.creationDate());
        found.setTotalCart(body.totalCart());
        return productsCartDAO.save(found);
    }

    public void findByIdAndDelete(UUID id) {
        ProductsCart found = this.findById(id);
        productsCartDAO.delete(found);
    }
}
