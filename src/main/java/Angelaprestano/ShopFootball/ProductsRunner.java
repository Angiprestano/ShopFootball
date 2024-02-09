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
                    System.out.println("Creazione abbigliamento avvenuta correttamente");
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
//        Products tshirt1 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw371047f3/images/large/23I002W7511_01.jpg?sw=1400&q=80", "Tshirt rubber", "Tshirt grigia, realizzata in cotone. Presenta un serpente al centro legato alla squadra, tutto definito con uno stemma calcistico al centro, in colore rosa", 25.99, "Grey", Size.M, Categories.WOMEN, TypeofProduct.TSHIRT);
//        productsDAO.save(tshirt1);
//        Products tshirt2 = new Products("https://store.inter.it/on/demandware.static/-/Sites-inter-master-catalog/default/dwba20bbab/images/detail/22L002W11302_03.jpg", "Tshirt stretch  ", "Tshirt nera, realizzata in cotone, presenta la scritta INTER centrale, scritta realizzata in grigio", 20.00, "Black", Size.S, Categories.WOMEN, TypeofProduct.TSHIRT);
//        productsDAO.save(tshirt2);
//        Products tshirt3 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwc0c6c745/images/large/22I002W9101_01.jpg?sw=1400&q=80", "Tshirt college", "Tshirt bianca, realizzata in cotone, presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in rosa ", 23.99, "white", Size.S, Categories.WOMEN, TypeofProduct.TSHIRT);
//        productsDAO.save(tshirt3);
//        Products tshirtGrey = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw371047f3/images/large/23I002W7511_01.jpg?sw=1400&q=80", "Tshirt college ", "Tshirt bianca, realizzata in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in blu", 23.99, "white", Size.M, Categories.WOMEN, TypeofProduct.TSHIRT);
//        productsDAO.save(tshirtGrey);
//        Products tshirt4 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw371047f3/images/large/23I002W7511_01.jpg?sw=1400&q=80", "Tshirt college", "Tshirt bianca, realizzata in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in grigio ", 23.99, "white", Size.XS, Categories.WOMEN, TypeofProduct.TSHIRT);
//        productsDAO.save(tshirt4);
//        Products tshirt5 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw371047f3/images/large/23I002W7511_01.jpg?sw=1400&q=80", "Tshirt college", "Tshirt grigia, in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in nero ", 23.99, "Green", Size.L, Categories.WOMEN, TypeofProduct.TSHIRT);
//        productsDAO.save(tshirt5);
//        Products tshirt6 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw371047f3/images/large/23I002W7511_01.jpg?sw=1400&q=80", "Tshirt college", "Tshirt bianca, in cotone. Presenta scritta centrale: INTER MILANO, con stemma centrale, scritta e stemma realizzati in azzurro ", 30.00, "Black", Size.M, Categories.WOMEN, TypeofProduct.TSHIRT);
//        productsDAO.save(tshirt6);
//        Products tshirt7 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw371047f3/images/large/23I002W7511_01.jpg?sw=1400&q=80", "Tshirt college", "Tshirt bianca, realizzata in cotone. Presenta un serpente al centro legato alla squadra, tutto definito con uno stemma calcistico al centro, in colore verde", 25.99, "Grey", Size.M, Categories.WOMEN, TypeofProduct.TSHIRT);
//        productsDAO.save(tshirt7);
//        Products tshirt8 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw371047f3/images/large/23I002W7511_01.jpg?sw=1400&q=80", "Tshirt college", "Tshirt grigia, in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in nero ", 23.99, "Green", Size.L, Categories.WOMEN, TypeofProduct.TSHIRT);
//        productsDAO.save(tshirt8);
//        Products tshirt9 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw371047f3/images/large/23I002W7511_01.jpg?sw=1400&q=80", "Tshirt college", "Tshirt bianca, in cotone. Presenta scritta centrale: INTER MILANO, con stemma centrale, scritta e stemma realizzati in azzurro ", 30.00, "Black", Size.M, Categories.WOMEN, TypeofProduct.TSHIRT);
//        productsDAO.save(tshirt9);
//        Products tshirt10 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw371047f3/images/large/23I002W7511_01.jpg?sw=1400&q=80", "Tshirt college", "Tshirt bianca, realizzata in cotone. Presenta un serpente al centro legato alla squadra, tutto definito con uno stemma calcistico al centro, in colore verde", 25.99, "Grey", Size.M, Categories.WOMEN, TypeofProduct.TSHIRT);
//        productsDAO.save(tshirt10);


//        Products swittshirt1 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw1b571e25/images/large/23I002W6516_01.jpg?sw=1400&q=80", "Im nike felpa cappuccio donna", "Felpa rosa, realizzata in cotone. Presenta un serpente al centro legato alla squadra, tutto definito con uno stemma calcistico al centro, in colore rosa", 28.00, "Pink", Size.M, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
//        productsDAO.save(swittshirt1);
//        Products swittshirt2 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw76904242/images/large/23I002W6502_01.jpg?sw=1400&q=80", "Im nike felpa cappuccio donna", "Felpa nera, realizzata in cotone, presenta la scritta INTER centrale, scritta realizzata in grigio", 30.00, "Black", Size.S, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
//        productsDAO.save(swittshirt2);
//        Products swittshirt3 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwfb92c127/images/large/22I002W8802_01.jpg?sw=1400&q=80", "Im nike felpa cappuccio donna", "Felpa bianca, realizzata in cotone, presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in rosa ", 40.00, "white", Size.ONESIZE, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
//        productsDAO.save(swittshirt3);
//        Products swittshirt4 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwdacb1efa/images/detail/22I002W8901_03.jpg?sw=700&sfrm=jpg&q=80", "Im nike felpa cappuccio donna", "Felpa bianca, realizzata in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in rosa", 50.00, "white", Size.S, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
//        productsDAO.save(swittshirt4);
//        Products swittshirt5 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwd2945722/images/detail/22I002W8810_03.jpg?sw=700&sfrm=jpg&q=80", "Im nike felpa cappuccio donna", "Felpa bianca, realizzata in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in grigio ", 48.50, "white", Size.M, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
//        productsDAO.save(swittshirt5);
//        Products swittshirt6 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw5a187bd9/images/detail/22I002W8802_03.jpg?sw=700&sfrm=jpg&q=80", "Im nike felpa cappuccio donna", "Felpa grigia, in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in nero ", 39.99, "Green", Size.L, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
//        productsDAO.save(swittshirt6);
//        Products swittshirt7 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwc965a4e7/images/detail/22L002W11402_03.jpg?sw=700&sfrm=jpg&q=80", "Im nike felpa cappuccio donna", "Felpa bianca, in cotone. Presenta scritta centrale: INTER MILANO, con stemma centrale, scritta e stemma realizzati in azzurro ", 32.99, "Black", Size.S, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
//        productsDAO.save(swittshirt7);
//        Products swittshirt8 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw934c8089/images/detail/22I002W8801_03.jpg?sw=700&sfrm=jpg&q=80", "Im nike felpa cappuccio donna", "Felpa bianca, realizzata in cotone. Presenta un serpente al centro legato alla squadra, tutto definito con uno stemma calcistico al centro, in colore verde", 35.00, "Grey", Size.ONESIZE, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
//        productsDAO.save(swittshirt8);


//        Products pajamas1 = new Products("", "Pigiama", "", 25.99, "Grey", Size.M, Categories.WOMEN, TypeofProduct.PAJAMAS);
//        productsDAO.save(pajamas1);
//        Products pajamas2 = new Products("", "Pigiama  ", "", 20.00, "Black", Size.S, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
//        productsDAO.save(pajamas2);
//        Products pajamas3 = new Products("", "Pigiama", "", 30.00, "white", Size.S, Categories.WOMEN, TypeofProduct.PAJAMAS);
//        productsDAO.save(pajamas3);
//        Products pajamas4 = new Products("", "Pigiama ", "", 30.00, "white", Size.XS, Categories.WOMEN, TypeofProduct.PAJAMAS);
//        productsDAO.save(pajamas4);
//        Products pajamas5 = new Products("", "Pigiama", "", 30.99, "white", Size.ONESIZE, Categories.WOMEN, TypeofProduct.PAJAMAS);
//        productsDAO.save(pajamas5);
//        Products pajamas6 = new Products("", "Pigiama", "", 40.00, "Green", Size.ONESIZE, Categories.WOMEN, TypeofProduct.PAJAMAS);
//        productsDAO.save(pajamas6);


//        Products tshir1= new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwe3310c44/images/large/23I002U6602_01.jpg?sw=1400&q=80", "Polo Inter", "Tshirt grigia, realizzata in cotone. Presenta un serpente al centro legato alla squadra, tutto definito con uno stemma calcistico al centro, in colore rosa", 24.99, "Grey", Size.L, Categories.MAN, TypeofProduct.TSHIRT);
//        productsDAO.save(tshir1);
//        Products tshir2 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwecbcaf40/images/detail/23I002U6604_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt", "Tshirt nera, realizzata in cotone, presenta la scritta INTER centrale, scritta realizzata in grigio", 28.00, "Black", Size.S, Categories.MAN, TypeofProduct.TSHIRT);
//        productsDAO.save(tshir2);
//        Products tshir3 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw60bd5ec8/images/detail/23I002M6211_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt", "Tshirt bianca, realizzata in cotone, presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in rosa ", 23.99, "white", Size.XL, Categories.MAN, TypeofProduct.TSHIRT);
//        productsDAO.save(tshir3);
//        Products tshir4 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dweeafd38f/images/detail/23I002M6204_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt college ", "Tshirt bianca, realizzata in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in blu", 20.00, "white", Size.L, Categories.MAN, TypeofProduct.TSHIRT);
//        productsDAO.save(tshir4);
//        Products tshir5 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw759f8aa2/images/detail/23I002M6021_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt college", "Tshirt bianca, realizzata in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in grigio ", 25.00, "white", Size.L, Categories.MAN, TypeofProduct.TSHIRT);
//        productsDAO.save(tshir5);
//        Products tshir6 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwed8ccae5/images/detail/23I002M0102_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt college", "Tshirt grigia, in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in nero ", 30.00, "Green", Size.ONESIZE, Categories.MAN, TypeofProduct.TSHIRT);
//        productsDAO.save(tshir6);
//        Products tshir7 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwa367747c/images/detail/23I002M5619_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt college", "Tshirt bianca, in cotone. Presenta scritta centrale: INTER MILANO, con stemma centrale, scritta e stemma realizzati in azzurro ", 35.00, "Black", Size.S, Categories.MAN, TypeofProduct.TSHIRT);
//        productsDAO.save(tshir7);
//        Products tshir8 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw027b32d1/images/detail/22I002M12301_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt college", "Tshirt bianca, realizzata in cotone. Presenta un serpente al centro legato alla squadra, tutto definito con uno stemma calcistico al centro, in colore verde", 25.99, "Grey", Size.M, Categories.MAN, TypeofProduct.TSHIRT);
//        productsDAO.save(tshir8);
//        Products tshir9 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw793c1d76/images/detail/22I002M12302_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt college", "Tshirt grigia, in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in nero ", 25.00, "Green", Size.L, Categories.MAN, TypeofProduct.TSHIRT);
//        productsDAO.save(tshir9);
//        Products tshir10 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwaa4baa92/images/detail/22I002M7405_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt college", "Tshirt bianca, realizzata in cotone. Presenta un serpente al centro legato alla squadra, tutto definito con uno stemma calcistico al centro, in colore verde", 31.99, "Grey", Size.XS, Categories.MAN, TypeofProduct.TSHIRT);
//        productsDAO.save(tshir10);
//        Products tshir11 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw717987d1/images/detail/22L002M6010_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt college", "Tshirt grigia, in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in nero ", 37.00, "Green", Size.S, Categories.MAN, TypeofProduct.TSHIRT);
//        productsDAO.save(tshir11);

    }
}
