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
    public void createProducts() {
        Products tshirt1 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw371047f3/images/large/23I002W7511_01.jpg?sw=1400&q=80", "Tshirt rubber", "Tshirt grigia, realizzata in cotone. Presenta un serpente al centro legato alla squadra, tutto definito con uno stemma calcistico al centro, in colore rosa", 25.99, "Grey", Size.M, Categories.WOMEN, TypeofProduct.TSHIRT);
        productsDAO.save(tshirt1);
        Products tshirt2 = new Products("https://store.inter.it/on/demandware.static/-/Sites-inter-master-catalog/default/dwba20bbab/images/detail/22L002W11302_03.jpg", "Tshirt stretch  ", "Tshirt nera, realizzata in cotone, presenta la scritta INTER centrale, scritta realizzata in grigio", 20.00, "Black", Size.S, Categories.WOMEN, TypeofProduct.TSHIRT);
        productsDAO.save(tshirt2);
        Products tshirt3 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwc0c6c745/images/large/22I002W9101_01.jpg?sw=1400&q=80", "Tshirt college", "Tshirt bianca, realizzata in cotone, presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in rosa ", 23.99, "white", Size.S, Categories.WOMEN, TypeofProduct.TSHIRT);
        productsDAO.save(tshirt3);
        Products tshirtGrey = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw371047f3/images/large/23I002W7511_01.jpg?sw=1400&q=80", "Tshirt college ", "Tshirt bianca, realizzata in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in blu", 23.99, "white", Size.M, Categories.WOMEN, TypeofProduct.TSHIRT);
        productsDAO.save(tshirtGrey);
        Products tshirt4 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw371047f3/images/large/23I002W7511_01.jpg?sw=1400&q=80", "Tshirt college", "Tshirt bianca, realizzata in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in grigio ", 23.99, "white", Size.XS, Categories.WOMEN, TypeofProduct.TSHIRT);
        productsDAO.save(tshirt4);
        Products tshirt5 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw371047f3/images/large/23I002W7511_01.jpg?sw=1400&q=80", "Tshirt college", "Tshirt grigia, in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in nero ", 23.99, "Green", Size.L, Categories.WOMEN, TypeofProduct.TSHIRT);
        productsDAO.save(tshirt5);
        Products tshirt6 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw371047f3/images/large/23I002W7511_01.jpg?sw=1400&q=80", "Tshirt college", "Tshirt bianca, in cotone. Presenta scritta centrale: INTER MILANO, con stemma centrale, scritta e stemma realizzati in azzurro ", 30.00, "Black", Size.M, Categories.WOMEN, TypeofProduct.TSHIRT);
        productsDAO.save(tshirt6);
        Products tshirt7 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw371047f3/images/large/23I002W7511_01.jpg?sw=1400&q=80", "Tshirt college", "Tshirt bianca, realizzata in cotone. Presenta un serpente al centro legato alla squadra, tutto definito con uno stemma calcistico al centro, in colore verde", 25.99, "Grey", Size.M, Categories.WOMEN, TypeofProduct.TSHIRT);
        productsDAO.save(tshirt7);
        Products tshirt8 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw371047f3/images/large/23I002W7511_01.jpg?sw=1400&q=80", "Tshirt college", "Tshirt grigia, in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in nero ", 23.99, "Green", Size.L, Categories.WOMEN, TypeofProduct.TSHIRT);
        productsDAO.save(tshirt8);
        Products tshirt9 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw371047f3/images/large/23I002W7511_01.jpg?sw=1400&q=80", "Tshirt college", "Tshirt bianca, in cotone. Presenta scritta centrale: INTER MILANO, con stemma centrale, scritta e stemma realizzati in azzurro ", 30.00, "Black", Size.M, Categories.WOMEN, TypeofProduct.TSHIRT);
        productsDAO.save(tshirt9);
        Products tshirt10 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw371047f3/images/large/23I002W7511_01.jpg?sw=1400&q=80", "Tshirt college", "Tshirt bianca, realizzata in cotone. Presenta un serpente al centro legato alla squadra, tutto definito con uno stemma calcistico al centro, in colore verde", 25.99, "Grey", Size.M, Categories.WOMEN, TypeofProduct.TSHIRT);
        productsDAO.save(tshirt10);


        Products swittshirt1 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw1b571e25/images/large/23I002W6516_01.jpg?sw=1400&q=80", "Im nike felpa cappuccio donna", "Felpa rosa, realizzata in cotone. Presenta un serpente al centro legato alla squadra, tutto definito con uno stemma calcistico al centro, in colore rosa", 28.00, "Pink", Size.M, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshirt1);
        Products swittshirt2 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw76904242/images/large/23I002W6502_01.jpg?sw=1400&q=80", "Im nike felpa cappuccio donna", "Felpa nera, realizzata in cotone, presenta la scritta INTER centrale, scritta realizzata in grigio", 30.00, "Black", Size.S, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshirt2);
        Products swittshirt3 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwfb92c127/images/large/22I002W8802_01.jpg?sw=1400&q=80", "Im nike felpa cappuccio donna", "Felpa bianca, realizzata in cotone, presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in rosa ", 40.00, "white", Size.ONESIZE, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshirt3);
        Products swittshirt4 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwdacb1efa/images/detail/22I002W8901_03.jpg?sw=700&sfrm=jpg&q=80", "Im nike felpa cappuccio donna", "Felpa bianca, realizzata in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in rosa", 50.00, "white", Size.S, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshirt4);
        Products swittshirt5 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwd2945722/images/detail/22I002W8810_03.jpg?sw=700&sfrm=jpg&q=80", "Im nike felpa cappuccio donna", "Felpa bianca, realizzata in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in grigio ", 48.50, "white", Size.M, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshirt5);
        Products swittshirt6 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw5a187bd9/images/detail/22I002W8802_03.jpg?sw=700&sfrm=jpg&q=80", "Im nike felpa cappuccio donna", "Felpa grigia, in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in nero ", 39.99, "Green", Size.L, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshirt6);
        Products swittshirt7 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwc965a4e7/images/detail/22L002W11402_03.jpg?sw=700&sfrm=jpg&q=80", "Im nike felpa cappuccio donna", "Felpa bianca, in cotone. Presenta scritta centrale: INTER MILANO, con stemma centrale, scritta e stemma realizzati in azzurro ", 32.99, "Black", Size.S, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshirt7);
        Products swittshirt8 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw934c8089/images/detail/22I002W8801_03.jpg?sw=700&sfrm=jpg&q=80", "Im nike felpa cappuccio donna", "Felpa bianca, realizzata in cotone. Presenta un serpente al centro legato alla squadra, tutto definito con uno stemma calcistico al centro, in colore verde", 35.00, "Grey", Size.ONESIZE, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshirt8);


        Products pajamas1 = new Products("", "Pigiama", "", 25.99, "Grey", Size.M, Categories.WOMEN, TypeofProduct.PAJAMAS);
        productsDAO.save(pajamas1);
        Products pajamas2 = new Products("", "Pigiama  ", "", 20.00, "Black", Size.S, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(pajamas2);


        Products tshir1 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwe3310c44/images/large/23I002U6602_01.jpg?sw=1400&q=80", "Polo Inter", "Tshirt grigia, realizzata in cotone. Presenta un serpente al centro legato alla squadra, tutto definito con uno stemma calcistico al centro, in colore rosa", 24.99, "Grey", Size.L, Categories.MAN, TypeofProduct.TSHIRT);
        productsDAO.save(tshir1);
        Products tshir2 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwecbcaf40/images/detail/23I002U6604_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt", "Tshirt nera, realizzata in cotone, presenta la scritta INTER centrale, scritta realizzata in grigio", 28.00, "Black", Size.S, Categories.MAN, TypeofProduct.TSHIRT);
        productsDAO.save(tshir2);
        Products tshir3 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw60bd5ec8/images/detail/23I002M6211_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt", "Tshirt bianca, realizzata in cotone, presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in rosa ", 23.99, "white", Size.XL, Categories.MAN, TypeofProduct.TSHIRT);
        productsDAO.save(tshir3);
        Products tshir4 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dweeafd38f/images/detail/23I002M6204_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt college ", "Tshirt bianca, realizzata in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in blu", 20.00, "white", Size.L, Categories.MAN, TypeofProduct.TSHIRT);
        productsDAO.save(tshir4);
        Products tshir5 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw759f8aa2/images/detail/23I002M6021_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt college", "Tshirt bianca, realizzata in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in grigio ", 25.00, "white", Size.L, Categories.MAN, TypeofProduct.TSHIRT);
        productsDAO.save(tshir5);
        Products tshir6 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwed8ccae5/images/detail/23I002M0102_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt college", "Tshirt grigia, in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in nero ", 30.00, "Green", Size.ONESIZE, Categories.MAN, TypeofProduct.TSHIRT);
        productsDAO.save(tshir6);
        Products tshir7 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwa367747c/images/detail/23I002M5619_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt college", "Tshirt bianca, in cotone. Presenta scritta centrale: INTER MILANO, con stemma centrale, scritta e stemma realizzati in azzurro ", 35.00, "Black", Size.S, Categories.MAN, TypeofProduct.TSHIRT);
        productsDAO.save(tshir7);
        Products tshir8 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw027b32d1/images/detail/22I002M12301_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt college", "Tshirt bianca, realizzata in cotone. Presenta un serpente al centro legato alla squadra, tutto definito con uno stemma calcistico al centro, in colore verde", 25.99, "Grey", Size.M, Categories.MAN, TypeofProduct.TSHIRT);
        productsDAO.save(tshir8);
        Products tshir9 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw793c1d76/images/detail/22I002M12302_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt college", "Tshirt grigia, in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in nero ", 25.00, "Green", Size.L, Categories.MAN, TypeofProduct.TSHIRT);
        productsDAO.save(tshir9);
        Products tshir10 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwaa4baa92/images/detail/22I002M7405_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt college", "Tshirt bianca, realizzata in cotone. Presenta un serpente al centro legato alla squadra, tutto definito con uno stemma calcistico al centro, in colore verde", 31.99, "Grey", Size.XS, Categories.MAN, TypeofProduct.TSHIRT);
        productsDAO.save(tshir10);
        Products tshir11 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw717987d1/images/detail/22L002M6010_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt college", "Tshirt grigia, in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in nero ", 37.00, "Green", Size.S, Categories.MAN, TypeofProduct.TSHIRT);
        productsDAO.save(tshir11);

        Products swittshir1 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw40db8211/images/detail/23I002M7811_03.jpg?sw=700&sfrm=jpg&q=80", "IM FELPA CON CAPPUCCIO SNAKE CLUB", "Felpa grigia in cotone. Presenta la scritta INTER al centro, realizzata al centro.", 64.99, "Grey", Size.L, Categories.MAN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshir1);
        Products swittshir2 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw0bc91e0c/images/large/23I002U5307_01.jpg?sw=1400&q=80", "IM FELPA COLOR BLOCK", "Felpa color BLOCK INTER, realizzata con i colori: giallo, nero e azzurro, con all'interno lo stemma e la scritta IM", 54.99, "Black", Size.S, Categories.MAN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshir2);
        Products swittshir3 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw77f1b11b/images/detail/23I002M6311_03.jpg?sw=700&sfrm=jpg&q=80", "IM FELPA CON CAPPUCCIO EVERYDAY", "Felpa nera, realizzata in cotone, presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in rosa ", 43.99, "white", Size.ONESIZE, Categories.MAN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshir3);
        Products swittshir4 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwdacb1efa/images/detail/22I002W8901_03.jpg?sw=700&sfrm=jpg&q=80", "IM FELPA CON CAPPUCCIO EVERYDAY", "Felpa bianca, realizzata in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in rosa", 52.99, "white", Size.S, Categories.MAN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshir4);
        Products swittshir5 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwd2945722/images/detail/22I002W8810_03.jpg?sw=700&sfrm=jpg&q=80", "IM FELPA CON CAPPUCCIO EVERYDAY", "Felpa grigia, realizzata in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in grigio ", 48.50, "white", Size.M, Categories.MAN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshir5);
        Products swittshir6 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw5a187bd9/images/detail/22I002W8802_03.jpg?sw=700&sfrm=jpg&q=80", "IM FELPA GIROCOLLO EVERYDAY", "Felpa blu. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in nero ", 40.50, "Green", Size.L, Categories.MAN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshir6);
        Products swittshir7 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwc965a4e7/images/detail/22L002W11402_03.jpg?sw=700&sfrm=jpg&q=80", "IM FELPA GIROCOLLO EVERYDAY", "Felpa nera Presenta scritta centrale: INTER MILANO, con stemma centrale, scritta e stemma realizzati in azzurro ", 37.60, "Black", Size.S, Categories.MAN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshir7);
        Products swittshir8 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw934c8089/images/detail/22I002W8801_03.jpg?sw=700&sfrm=jpg&q=80", "IM FELPA GIROCOLLO BISCIONE", "Felpa grigia, presenta la scritta INTER con il disegno del serpente in basso (legato alla squadra).", 39.99, "Grey", Size.L, Categories.MAN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshir8);
        Products swittshir9 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwc6e04fcf/images/detail/23I002M0302_03.jpg?sw=700&sfrm=jpg&q=80", "IM FELPA GIROCOLLO BISCIONE", "Felpa nera, presenta la scritta INTER con il disegno del serpente in basso (legato alla squadra).", 39.99, "Grey", Size.XS, Categories.MAN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshir9);

        //Pajamas
        Products pajamasMan1 = new Products("https://m.media-amazon.com/images/I/71iuMKNxR-L._AC_UY1000_.jpg", "Pigiama inter uomo", "Pigiama in cotone, maglia con stemma centrale", 35.99, "Grey", Size.L, Categories.MAN, TypeofProduct.PAJAMAS);
        productsDAO.save(pajamas1);
        Products pajamasMan2 = new Products("", "Pigiama  ", "", 20.00, "Black", Size.S, Categories.MAN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(pajamas2);

        //ACCESSORIES

        Products accessories1 = new Products("https://store.inter.it/demandware.static/-/Sites-inter-master-catalog/default/dw3f57e350/images/large/23I004U0904_01.jpg", "IM CAPPELLINO EVERYDAY INTER", "Cappellino Inter con visiera, logo e scritta gommate", 19.99, "Black", Size.ONESIZE, Categories.MAN, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories1);
        Products accessories2 = new Products("https://store.inter.it/demandware.static/-/Sites-inter-master-catalog/default/dw3f57e350/images/large/23I004U0904_01.jpg", "IM CAPPELLINO EVERYDAY INTER", "Cappellino Inter con visiera, logo e scritta gommate", 19.99, "Blue", Size.ONESIZE, Categories.MAN, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories2);
        Products accessories3 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw3f57e350/images/large/23I004U0904_01.jpg?sw=1400&q=80", "IM CAPPELLINO EVERYDAY INTER", "Cappellino Inter con visiera, logo e scritta gommate", 19.99, "Grey", Size.ONESIZE, Categories.MAN, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories3);
        Products accessories4 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwa50bae07/images/detail/23I004U1102_03.jpg?sw=700&sfrm=jpg&q=80", "IM BERRETTO ALL OVER PATTERN", "Cappello nero, visiera con design e stemma centrale blu ", 21.99, "Black", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories4);
        Products accessories5 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwf62736e7/images/detail/23I004U1101_03.jpg?sw=700&sfrm=jpg&q=80", "IM CAPPELLINO ALL OVER PATTERN", "Cappello bianco, visiera con design e stemma centrale blu", 23.99, "Black", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories5);
        Products accessories6 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw29073ea6/images/detail/22L004U0402_02.jpg?sw=700&sfrm=jpg&q=80", "IM CAPPELLO CON RIBALTA", "Berretto invernale, di colore nero con strisce blu. Nella parte in basso presenta lo stemma della squadra", 19.99, "Black", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories6);
        Products accessories7 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw108542ba/images/detail/22L004U0401_02.jpg?sw=700&sfrm=jpg&q=80", "IM CAPPELLO CON RIBALTA", "Berretto invernale, di colore bianco con strisce blu e nere. Nella parte in basso presenta lo stemma della squadra", 19.99, "White", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories7);
        Products accessories8 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw42a60c4d/images/detail/22L004U0407_02.jpg?sw=700&sfrm=jpg&q=80", "IM CAPPELLO CON RIBALTA", "Berretto invernale, di colore giallo con strisce blu e nere. Nella parte in basso presenta lo stemma della squadra", 19.99, "Yellow", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories8);
        Products accessories9 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw12345677/images/detail/22L004U0416_02.jpg?sw=700&sfrm=jpg&q=80", "IM CAPPELLO A RIGHE CON RIBALTA", "", 19.99, "Pink", Size.ONESIZE, Categories.WOMEN, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories9);
        Products accessories10 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw8ca8471d/images/large/23I012U0502_01.jpg?sw=1400&q=80", "IM PORTAFOGLIO SNAKE CLUB", "Portafoglio in pelle nero, figura centrale con serpente e stemma inter ", 36.99, "Black", Size.ONESIZE, Categories.MAN, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories10);
        Products accessories11 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw63eb6b39/images/detail/23I006U0102_03.jpg?sw=700&sfrm=jpg&q=80", "IM CINTURA EVERYDAY", "", 22.99, "Grey", Size.ONESIZE, Categories.MAN, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories11);
        Products accessories12 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw056ef798/images/detail/22L006U0602_03.jpg?sw=700&sfrm=jpg&q=80", "IM GUANTI IN PELLE", "Guanti in pelle con piccolo stemma in basso", 39.99, "Black", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories12);
        Products accessories13 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwc3e008a2/images/large/23L014U0409_01.jpg?sw=1400&q=80", "IM OROLOGIO TOP CHRONO", " Orologio INTER, cassa in acciaio da 42 mm con lunetta e bracciale neri, impermeabile fino a 100 metri.", 189.99, "Silver", Size.ONESIZE, Categories.MAN, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories13);
        Products accessories14 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw349eefef/images/detail/23L014M0209_04.jpg?sw=700&sfrm=jpg&q=80", "IM OROLOGIO SUB BLACK & BLUE", "L'orologio INTER Sub presenta un design unico. È sportivo e presenta una cassa e bracciale in acciaio inossidabile da 42 mm. L'orologio è impermeabile fino a 100 metri.", 154.99, "Silver", Size.ONESIZE, Categories.MAN, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories14);
        Products accessories15 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwd2973d5e/images/detail/23L012U0709_02.jpg?sw=700&sfrm=jpg&q=80", "IM PORTACHIAVI CHAMPIONS LEAGUE TROPHY 3D", "Portachiavi realizzato in metallo, presenta una coppa con scritta centrale, dedicata alla stagione Inter in Champions League.", 16.99, "Silver", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories15);
        Products accessories16 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw6500e414/images/detail/23L031U0102_03.jpg?sw=700&sfrm=jpg&q=80", "IM CALENDARIO INTER 2024 VERTICALE", "Calendario Inter ufficiale, anno corrente: 2024", 12.99, "Black", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories16);
        Products accessories17 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw5b5bd3cf/images/detail/23I012U0202_02.jpg?sw=700&sfrm=jpg&q=80", "IM PORTACHIAVI EVERYDAY", "Il portachiavi Everyday INTER è un accessorio elegante. Realizzato in poliestere, presenta il logo del Club gommato.", 9.99, "Black", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories17);
        Products accessories18 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwdfd5cc58/images/detail/23I012U0204_02.jpg?sw=700&sfrm=jpg&q=80", "IM PORTACHIAVI EVERYDAY", "Il portachiavi Everyday INTER è un accessorio elegante. Realizzato in poliestere, presenta il logo del Club gommato.", 9.99, "Blue", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories18);
        Products accessories19 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw399a4b35/images/large/23I012U0211_01.jpg?sw=1400&q=80", "IM PORTACHIAVI EVERYDAY", "Il portachiavi Everyday INTER è un accessorio elegante. Realizzato in poliestere, presenta il logo del Club gommato.", 9.99, "Silver", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories19);
        Products accessories20 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw9f56f974/images/detail/22L012U1409_02.jpg?sw=700&sfrm=jpg&q=80", "IM PORTACHIAVI LOGO GIREVOLE", "Il portachiavi INTER è realizzato in acciaio, presenta lo stemma del club", 10.99, "Silver", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories20);
        Products accessories21 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwf80822ae/images/detail/22L012U0809_02.jpg?sw=700&sfrm=jpg&q=80", "IM PORTACHIAVI SMALTATO", "Il portachiavi INTER è realizzato in acciaio, presenta lo stemma del club", 9.99, "Silver", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories21);
        Products accessories22 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwd702e2cd/images/detail/22L012U1609_02.jpg?sw=700&sfrm=jpg&q=80", "IM PORTACHIAVI LOGO ARGENTATO EFFETTO ANTICO", "Il portachiavi INTER presenta un effetto antico, con stemma del club", 9.99, "Silver", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories22);
        Products accessories23 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw82090134/images/detail/22L005U1101_02.jpg?sw=700&sfrm=jpg&q=80", "IM SCIARPA A RIGHE NERAZZURRE", "Sciarpa INTER bianca in tessuto acrilico, presenta delle righe blu e nere con stemma nella parte finale", 20.99, "White", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories23);
        Products accessories24 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw2e3f0a56/images/detail/22L005U1107_02.jpg?sw=700&sfrm=jpg&q=80", "IM SCIARPA A RIGHE NERAZZURRE", "Sciarpa INTER gialla in tessuto acrilico, presenta delle righe blu e nere con stemma nella parte finale", 20.99, "Yellow", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories24);
        Products accessories25 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw8363d6a0/images/detail/22L005U1116_02.jpg?sw=700&sfrm=jpg&q=80", "IM SCIARPA A RIGHE NERAZZURRE", "Sciarpa INTER rosa in tessuto acrilico, presenta delle righe blu e nere con stemma nella parte finale", 20.99, "Pink", Size.ONESIZE, Categories.WOMEN, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories25);
        Products accessories26 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwff2ba5f6/images/detail/22L005U0503_02.jpg?sw=700&sfrm=jpg&q=80", "IM SCIARPA DI PADRE IN FIGLIO", "Sciarpa INTER ", 14.99, "Blue", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories26);
        Products accessories27 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw818b1862/images/detail/22L005U1302_02.jpg?sw=700&sfrm=jpg&q=80", "IM SCIARPA SCRITTA INTER", "Sciarpa INTER ", 9.99, "Blue", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories27);
        Products accessories28 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw5de8440f/images/detail/22L005U1202_02.jpg?sw=700&sfrm=jpg&q=80", "IM SCIARPA CLUB", "Sciarpa INTER ", 9.99, "Blue", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories28);
        Products accessories29 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwc2daed53/images/detail/22L032U0102_02.jpg?sw=700&sfrm=jpg&q=80", "IM BANDIERA LOGO PICCOLA", "Bandiera INTER -  Dimensioni: 50 x 70 x 0,01 cm ", 14.99, "Blue", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories29);
        Products accessories30 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwddb08867/images/detail/22L032U0202_02.jpg?sw=700&sfrm=jpg&q=80", "IM BANDIERA LOGO MEDIA", "Bandiera INTER - Dimensioni: 100 x 140 x 0,01 cm", 19.99, "Blue", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories30);
        Products accessories31 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwc65e2633/images/detail/22L032U0302_02.jpg?sw=700&sfrm=jpg&q=80", "IM BANDIERA LOGO GRANDE", "Bandiera INTER - Dimensioni: 140 x 220 x 0,01 cm ", 29.99, "Blue", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories31);
        Products accessories32 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw4fd86098/images/detail/23I011U0402_03.jpg?sw=700&sfrm=jpg&q=80", "IM ZAINO TRAVEL", "Lo zaino Travel Everyday INTER è realizzato in resistente poliestere, con le seguenti misure: 44 x 31 x 15 cm ", 69.99, "Black", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories32);
        Products accessories33 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwb77cb3bb/images/detail/23I011U0404_03.jpg?sw=700&sfrm=jpg&q=80", "IM ZAINO TRAVEL", "Lo zaino Travel Everyday INTER è realizzato in resistente poliestere, con le seguenti misure: 44 x 31 x 15 cm", 69.99, "Blue", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories33);
        Products accessories34= new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw4638c844/images/detail/23L029U0302_03.jpg?sw=700&sfrm=jpg&q=80", "IM TROLLEY INTER", "Il trolley INTER è realizzato con un rivestimento rigido di colore nero, le 4 rotelle girevoli garantiscono una mobilità fluida in qualsiasi direzione", 119.99, "Black", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories34);
        Products accessories35 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwf077b32e/images/detail/23I029U0202_03.jpg?sw=700&sfrm=jpg&q=80", "IM BORSONE DA VIAGGIO", "Borsone da viaggio INTER di colore nero, con stemma centrale nero", 59.99, "Black", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories35);
        Products accessories36 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw02784f49/images/detail/23I029U0204_03.jpg?sw=700&sfrm=jpg&q=80", "IM BORSONE DA VIAGGIO", "Borsone da viaggio INTER di colore blu, con stemma centrale blu", 59.99, "Blue", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories36);
        Products accessories37 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw1916b895/images/detail/23I029U0211_03.jpg?sw=700&sfrm=jpg&q=80", "IM BORSONE DA VIAGGIO", "Borsone da viaggio INTER di colore grigio, con stemma centrale bianco", 59.99, "Grey", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories37);
        Products accessories38 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwe9b35634/images/large/22L023U2401_HOME_01.jpg?sw=700&sfrm=jpg&q=80", "IM TAZZA PERSONALIZZABILE MAGLIA GARA", "Tazza INTER personalizzabile, personalizzabile con il nome", 14.99, "White", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories38);
        Products accessories39 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw4d0e8800/images/detail/22L023U0401_03.jpg?sw=700&sfrm=jpg&q=80", "IM TAZZA LOGO", "Tazza bianca INTER, realizzata in ceramica, con stemma centrale ", 12.99, "White", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories39);
        Products accessories40 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw61b43f15/images/detail/22L023U0603_03.jpg?sw=700&sfrm=jpg&q=80", "IM TAZZA INTER MILANO", "Tazza bianca INTER, realizzata in ceramica, con stemma centrale", 12.99, "White", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories40);
        Products accessories41 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw084fb211/images/detail/22L023U2702_03.jpg?sw=700&sfrm=jpg&q=80", "IM INTER X 24BOTTLES CLIMA BOTTLE NERO", "Borraccia termica INTER, con design: SERPENTE e STEMMA INTER", 40.00, "White", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories41);
        Products accessories42 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw6cd0ba5b/images/detail/22L023U2803_03.jpg?sw=700&sfrm=jpg&q=80", "IM INTER X 24BOTTLES CLIMA BOTTLE BLU", "", 40.00, "White", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories42);
    }
}
