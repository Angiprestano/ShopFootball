package Angelaprestano.ShopFootball;

import Angelaprestano.ShopFootball.entities.Enum.Categories;
import Angelaprestano.ShopFootball.entities.Enum.Size;
import Angelaprestano.ShopFootball.entities.Enum.TypeofProduct;
import Angelaprestano.ShopFootball.entities.Products;
import Angelaprestano.ShopFootball.repositories.ProductsDAO;
import Angelaprestano.ShopFootball.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@Order(1)
public class ProductsRunner implements CommandLineRunner {

    @Autowired
   private ProductsService productsService;
    @Autowired
    private ProductsDAO productsDAO;

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean errors = false;
        do {
            System.out.println("Do you want to proceed with the creation of the products? (y/n)");
            String choice = scanner.nextLine();
            switch (choice.toLowerCase()) {
                case "y" -> {
                    createProducts();
                    errors = false;
                }
                case "n" -> errors = false;
                default -> {
                    System.out.println("Input not valid. Repeat again.");
                    errors = true;
                }
            }
        } while (errors);
    }
    public void createProducts(){
        Products tshirtGrey = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw371047f3/images/large/23I002W7511_01.jpg?sw=1400&q=80", "Tshirt Inter Grey", "La maglietta presenza un serpente al centro", 19.99, "Grey", Size.M, Categories.WOMEN, TypeofProduct.TSHIRT);

        productsDAO.save(tshirtGrey);
    }
}
