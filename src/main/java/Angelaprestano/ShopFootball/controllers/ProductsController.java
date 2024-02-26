package Angelaprestano.ShopFootball.controllers;

import Angelaprestano.ShopFootball.entities.Products;
import Angelaprestano.ShopFootball.payloads.ProductsDTO;
import Angelaprestano.ShopFootball.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductsController {
    @Autowired
    private ProductsService productsService;

    @GetMapping
    public Page<Products> getProducts(@RequestParam(defaultValue = "1") int page,
                                      @RequestParam(defaultValue = "10")int size,
                                      @RequestParam(defaultValue = "nome")String orderBy)
    {
        return productsService.getProducts(page,size,orderBy);
    }

    @GetMapping("/accessories")
    public List<Products> getAllAccessories() {
        return productsService.getAllAccessories();
    }
    @GetMapping("/calcio/women")
    public List<Products> getCalcioWomen() {
        return productsService.getCalcioWomen();
    }
    @GetMapping("/calcio/man")
    public List<Products> getCalcioMan() {
        return productsService.getCalcioMan();
    }

    @GetMapping("/sale/tshirt")
    public List<Products> getSalesTshirt() {
        return productsService.getSalesTshirt();
    }
    @GetMapping("/pants/man")
    public List<Products> getPantsMan() {
        return productsService.getPantsMan();
    }

    @GetMapping("/suit/man")
    public List<Products> getSuitForMan() {
        return productsService.getSuitForMan();
    }
    @GetMapping("/suit/women")
    public List<Products> getSuitForWomen() {
        return productsService.getSuitForWomen();
    }

    @GetMapping("/calcio/kids")
    public List<Products> getCalcioKids() {
        return productsService.getCalcioKids();
    }
    @GetMapping("/tshirt/kids")
    public List<Products> getTshirtForKids() {
        return productsService.getTshirtForKids();
    }
    @GetMapping("/suit/kids")
    public List<Products> getSuitForKids() {
        return productsService.getSuitForKids();
    }
    @GetMapping("/felpa/kids")
    public List<Products> getFelpaForKids() {
        return productsService.getFelpaForKids();
    }
    @GetMapping("/pajamas/kids")
    public List<Products> getPajamasForKids() {
        return productsService.getPajamasForKids();
    }
    @GetMapping("/pajamas/man")
    public List<Products> getPajamasForMan() {
        return productsService.getPajamasForMan();
    }
    @GetMapping("/pajamas/women")
    public List<Products> getPajamasForWomen() {
        return productsService.getPajamasForWomen();
    }
    @GetMapping("/sweatshirts/women")
    public List<Products> getSweatshirtsForWomen() {
        return productsService.getSweatshirtForWomen();
    }
    @GetMapping("/sweatshirts/man")
    public List<Products> getSweatshirtsForMan() {
        return productsService.getSweatshirtForMan();
    }
    @GetMapping("/tshirts/man")
    public List<Products> getTshirtsForMan() {
        return productsService.getTshirtsForMan();
    }
    @GetMapping("/tshirts/women")
    public List<Products> getTshirtsForWomen() {
        return productsService.getTshirtsForWomen();
    }

    @GetMapping("/filtered")
    public List<Products> getFilteredProducts() {
        double minPrice = 20.00;
        double maxPrice = 40.00;
        return productsService.getProductsFilteredByPrice(minPrice, maxPrice);
    }

    @GetMapping("/product_title")
    public List<Products> getFindByTitle(@RequestParam String title) {
        return productsService.getProductsFilteredByTitle(title);
    }

    @GetMapping("/part_title")
    public List<Products> getProductsFilteredByTitleContaining(@RequestParam String partOfTitle) {
        return productsService.getProductsFilteredByTitleContaining(partOfTitle);
    }
    @GetMapping("/{id}")
    public ProductsDTO getProductById(@PathVariable UUID id) {
        return productsService.getProductsById(id);
    }
    }

