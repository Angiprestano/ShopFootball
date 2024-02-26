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

    //MAGLIETTE DONNA
    public void createProducts() {

        //MAGLIETTE DONNA
        Products tshirt1 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw371047f3/images/large/23I002W7511_01.jpg?sw=1400&q=80", "Maglietta Rubber", "Maglietta grigia, realizzata in cotone. Presenta un serpente al centro legato alla squadra, tutto definito con uno stemma calcistico al centro, in colore rosa", 25.99, "price_1Oma73GUnxyubwNL68Ftt1bC", "Grigia", Size.M, Categories.WOMEN, TypeofProduct.TSHIRT);
        productsDAO.save(tshirt1);
        Products tshirt2 = new Products("https://store.inter.it/on/demandware.static/-/Sites-inter-master-catalog/default/dwba20bbab/images/detail/22L002W11302_03.jpg", "Tshirt stretch", "Maglietta, realizzata in cotone, presenta la scritta INTER centrale, scritta realizzata in grigio", 20.00, "Black", "price_1Omx7jGUnxyubwNLssLhQkyu" , Size.S, Categories.WOMEN, TypeofProduct.TSHIRT);
        productsDAO.save(tshirt2);
        Products tshirt3 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwc0c6c745/images/large/22I002W9101_01.jpg?sw=1400&q=80", "Maglietta college", "Maglietta bianca, realizzata in cotone, presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in rosa ", 23.99, "Bianco", Size.S, Categories.WOMEN, TypeofProduct.TSHIRT);
        productsDAO.save(tshirt3);
        Products tshirtGrey = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwcb2b6e7e/images/detail/22I002W9001_03.jpg?sw=700&sfrm=jpg&q=80", "Maglietta college ", "Maglietta bianca, realizzata in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in blu", 23.99, "Bianco", Size.M, Categories.WOMEN, TypeofProduct.TSHIRT);
        productsDAO.save(tshirtGrey);
        Products tshirt4 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw659f0243/images/detail/22L002W11301_03.jpg?sw=700&sfrm=jpg&q=80", "Maglietta college", "Maglietta bianca, realizzata in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in grigio ", 23.99, "Bianco", Size.XS, Categories.WOMEN, TypeofProduct.TSHIRT);
        productsDAO.save(tshirt4);
        Products tshirt5 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwb9ecd418/images/detail/22I002W9010_03.jpg?sw=700&sfrm=jpg&q=80", "Maglietta college", "Maglietta grigia, in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in nero ", 23.99, "Grigio", Size.L, Categories.WOMEN, TypeofProduct.TSHIRT);
        productsDAO.save(tshirt5);
        Products tshirt6 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw8363b5b7/images/detail/22I002W9002_03.jpg?sw=700&sfrm=jpg&q=80", "Maglietta college", "Maglietta nera, con scritta centrale rosa", 24.99, "Nero", Size.M, Categories.WOMEN, TypeofProduct.TSHIRT);
        productsDAO.save(tshirt6);
        Products tshirt7 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw7a8b3574/images/large/22L002W11315_01.jpg?sw=1400&q=80", "Maglietta college", "Maglietta verde militare, con scritta grigio", 29.99, "Verde", Size.M, Categories.WOMEN, TypeofProduct.TSHIRT);
        productsDAO.save(tshirt7);
        Products tshirt8 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw55efe0b9/images/detail/23I002W6121_03.jpg?sw=700&sfrm=jpg&q=80", "Maglietta college", "Maglietta bianca in cotone. Presenta una piccola scritta a destra: INTER MILANO in grigio ", 23.99, "Bianco", Size.L, Categories.WOMEN, TypeofProduct.TSHIRT);
        productsDAO.save(tshirt8);


        //FELPE DONNA

        Products swittshirt1 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw1b571e25/images/large/23I002W6516_01.jpg?sw=1400&q=80", "Im nike felpa cappuccio donna", "Felpa rosa, realizzata in cotone. Presenta un serpente al centro legato alla squadra, tutto definito con uno stemma calcistico al centro, in colore rosa", 28.00, "Pink", Size.M, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshirt1);
        Products swittshirt2 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw76904242/images/large/23I002W6502_01.jpg?sw=1400&q=80", "Im nike felpa cappuccio donna", "Felpa nera, realizzata in cotone, presenta la scritta INTER centrale, scritta realizzata in grigio", 30.00, "price_1OmxJ3GUnxyubwNLifU2Ceys", "Nera", Size.S, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshirt2);
        Products swittshirt3 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwfb92c127/images/large/22I002W8802_01.jpg?sw=1400&q=80", "Im nike felpa cappuccio donna", "Felpa bianca, realizzata in cotone, presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in rosa ", 40.00, "price_1OmxGpGUnxyubwNLPAR6kFyG", "Nera", Size.ONESIZE, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshirt3);
        Products swittshirt4 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwdacb1efa/images/detail/22I002W8901_03.jpg?sw=700&sfrm=jpg&q=80", "Im nike felpa cappuccio donna", "Felpa bianca, realizzata in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in rosa", 50.00, "white", Size.S, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshirt4);
        Products swittshirt5 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwd2945722/images/detail/22I002W8810_03.jpg?sw=700&sfrm=jpg&q=80", "Im nike felpa cappuccio donna", "Felpa bianca, realizzata in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in grigio ", 48.50, "white", Size.M, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshirt5);
        Products swittshirt6 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwfecc5fce/images/large/23I002W7911_01.jpg?sw=1400&q=80", "Im nike felpa cappuccio donna", "Felpa grigia, in cotone. In grigio antracite con la scritta INTER piccola, in rosa", 39.99, "Grigio", Size.L, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshirt6);
        Products swittshirt7 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwc965a4e7/images/detail/22L002W11402_03.jpg?sw=700&sfrm=jpg&q=80", "Im nike felpa cappuccio donna", "Felpa bianca, in cotone. Presenta scritta centrale: INTER MILANO, con stemma centrale, scritta e stemma realizzati in azzurro ", 32.99, "Black", Size.S, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshirt7);
        Products swittshirt8 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw934c8089/images/detail/22I002W8801_03.jpg?sw=700&sfrm=jpg&q=80", "Im nike felpa cappuccio donna", "Felpa bianca, realizzata in cotone. Presenta un serpente al centro legato alla squadra, tutto definito con uno stemma calcistico al centro, in colore verde", 35.00, "price_1OmxQoGUnxyubwNL2uNZaW72", "Bianca", Size.ONESIZE, Categories.WOMEN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshirt8);

        //PIGIAMI  DONNA
        Products pajamas1 = new Products("https://i0.wp.com/www.filodirettosrl.it/wp-content/uploads/2022/03/inter-pigiama-donna-estivo-IN41016.jpg?w=800&ssl=1", "Pigiama estivo Donna", "Pigiama estivo, con canotta e pantaloncino", 25.99, "Nero/blu", Size.M, Categories.WOMEN, TypeofProduct.PAJAMAS);
        productsDAO.save(pajamas1);
        Products pajamas2 = new Products("https://m.media-amazon.com/images/I/51nCgsrlC9L._AC_UY580_.jpg", "Pigiama Donna", "Pigiama grigio, con scritta INTER centrale", 28.00, "Grigio", Size.S, Categories.WOMEN, TypeofProduct.PAJAMAS);
        productsDAO.save(pajamas2);

        //MAGLIETTE UOMO

        Products tshir1 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwe3310c44/images/large/23I002U6602_01.jpg?sw=1400&q=80", "Polo Inter", "Polo nera, realizzata in cotone. Presenta una scritta piccola a destra, realizzata in grigio", 24.99, "price_1OmZacGUnxyubwNLx6EGF4TP",  "Nera", Size.L, Categories.MAN, TypeofProduct.TSHIRT);
        productsDAO.save(tshir1);
        Products tshir2 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwecbcaf40/images/detail/23I002U6604_03.jpg?sw=700&sfrm=jpg&q=80", "Polo Inter", "Polo blu, realizzata in cotone, presenta una scritta piccola a destra, scritta realizzata in azzurro", 28.00, "Blu", Size.S, Categories.MAN, TypeofProduct.TSHIRT);
        productsDAO.save(tshir2);
        Products tshir3 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw60bd5ec8/images/detail/23I002M6211_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt Inter Milano", "Tshirt blu, realizzata in cotone, presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in rosa ", 23.99, "Cachi", Size.XL, Categories.MAN, TypeofProduct.TSHIRT);
        productsDAO.save(tshir3);
        Products tshir4 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dweeafd38f/images/detail/23I002M6204_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt college ", "Tshirt cachi, realizzata in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in blu", 20.00, "Blu", Size.L, Categories.MAN, TypeofProduct.TSHIRT);
        productsDAO.save(tshir4);
        Products tshir5 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw759f8aa2/images/detail/23I002M6021_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt college", "Tshirt bianca, realizzata in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in grigio ", 25.00, "Bianca", Size.L, Categories.MAN, TypeofProduct.TSHIRT);
        productsDAO.save(tshir5);
        Products tshir6 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwba7663aa/images/large/23I002M0102_01.jpg?sw=1400&q=80", "Tshirt college", "Tshirt nera, in cotone. Presenta la scritta: INTER, e in basso un serpente stile cartone legato alla squadra", 26.99, "Nera", Size.M, Categories.MAN, TypeofProduct.TSHIRT);
        productsDAO.save(tshir6);
        Products tshir7 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwa367747c/images/detail/23I002M5619_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt college", "Tshirt celeste, in cotone. Presenta scritta centrale: INTER MILANO, con stemma centrale, scritta e stemma realizzati in azzurro ", 35.00, "Celeste", Size.S, Categories.MAN, TypeofProduct.TSHIRT);
        productsDAO.save(tshir7);
        Products tshir8 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw027b32d1/images/detail/22I002M12301_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt college", "Tshirt bianca, realizzata in cotone. Presenta un serpente al centro legato alla squadra, tutto definito con uno stemma calcistico al centro, in colore verde", 25.99, "Bianca", Size.M, Categories.MAN, TypeofProduct.TSHIRT);
        productsDAO.save(tshir8);
        Products tshir9 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw793c1d76/images/detail/22I002M12302_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt college", "Tshirt nera, in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in nero ", 25.00, "Nera", Size.L, Categories.MAN, TypeofProduct.TSHIRT);
        productsDAO.save(tshir9);
        Products tshir10 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwaa4baa92/images/detail/22I002M7405_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt college", "Tshirt azzurra, realizzata in cotone. Presenta un serpente al centro legato alla squadra, tutto definito con uno stemma calcistico al centro, in colore verde", 31.99, "Azzurra", Size.XS, Categories.MAN, TypeofProduct.TSHIRT);
        productsDAO.save(tshir10);
        Products tshir11 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw717987d1/images/detail/22L002M6010_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt college", "Polo grigia, in cotone. Presenta la scritta: INTER MILANO, scritta e stemma realizzati in blu ", 37.00, "Grigia", Size.S, Categories.MAN, TypeofProduct.TSHIRT);
        productsDAO.save(tshir11);
        Products tshir12 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw8b774ebe/images/large/23N002M2119_01.jpg?sw=1400&q=80", "Polo Uomo", "Polo celeste in cotone. Presenta logo nike a sinistra e stemma inter a destra ", 44.99, "Celeste", Size.S, Categories.MAN, TypeofProduct.TSHIRT);
        productsDAO.save(tshir12);
        Products tshir13 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwe9bcd05f/images/large/22I002M11903_01.jpg?sw=1400&q=80", "Maglietta Uomo", "Maglietta semplice di colore azzurro, con a destra scritta Inter e stemma piccolo in bianco", 29.99, "Celeste", Size.S, Categories.MAN, TypeofProduct.TSHIRT);
        productsDAO.save(tshir13);

        // FELPE UOMO
        Products swittshir1 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw40db8211/images/detail/23I002M7811_03.jpg?sw=700&sfrm=jpg&q=80", "IM FELPA CON CAPPUCCIO SNAKE CLUB", "Felpa grigia in cotone. Presenta la scritta INTER al centro, realizzata al centro.", 64.99, "Grigia", Size.L, Categories.MAN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshir1);
        Products swittshir2 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw0bc91e0c/images/large/23I002U5307_01.jpg?sw=1400&q=80", "IM FELPA COLOR BLOCK", "Felpa BLOCK INTER, realizzata con i colori: giallo, nero e azzurro, con all'interno lo stemma e la scritta IM", 54.99, "price_1OmxVxGUnxyubwNL94KvuSeP", "Nero", Size.S, Categories.MAN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshir2);
        Products swittshir3 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw77f1b11b/images/detail/23I002M6311_03.jpg?sw=700&sfrm=jpg&q=80", "IM FELPA CON CAPPUCCIO EVERYDAY", "Felpa grigia, realizzata in cotone, presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in rosa ", 43.99, "price_1OmxnOGUnxyubwNLAZtwuei5", "Grigia", Size.ONESIZE, Categories.MAN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshir3);
        Products swittshir4 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw82c903a8/images/detail/23I002M6321_03.jpg?sw=700&sfrm=jpg&q=80", "IM FELPA CON CAPPUCCIO EVERYDAY", "Felpa bianca, realizzata in cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in rosa", 52.99, "Bianca", Size.S, Categories.MAN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshir4);
        Products swittshir5 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw77f1b11b/images/detail/23I002M6311_03.jpg?sw=700&sfrm=jpg&q=80", "IM FELPA CON CAPPUCCIO EVERYDAY", "Felpa color cachi, realizzata in poliestere e cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in grigio ", 48.50, "Bianca", Size.M, Categories.MAN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshir5);
        Products swittshir6 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw3cd06bbe/images/detail/23I002M6402_03.jpg?sw=700&sfrm=jpg&q=80", "IM FELPA GIROCOLLO EVERYDAY", "Felpa nera, poliestere e cotone. Presenta la scritta: INTER MILANO, con stemma centrale, scritta e stemma realizzati in nero ", 40.50, "Nera", Size.L, Categories.MAN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshir6);
        Products swittshir7 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw1f118cc3/images/detail/23I002M6404_03.jpg?sw=700&sfrm=jpg&q=80", "IM FELPA GIROCOLLO EVERYDAY", "Felpa blu, poliestere e cotone. Presenta scritta centrale: INTER MILANO, con stemma centrale, scritta e stemma realizzati in azzurro ", 37.60, "Blu", Size.S, Categories.MAN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshir7);
        Products swittshir8 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw2d232ee2/images/large/23I002M0310_01.jpg?sw=1400&q=80", "IM FELPA GIROCOLLO BISCIONE", "Felpa grigia, poliestere e cotone. Presenta la scritta INTER con il disegno del serpente in basso (legato alla squadra).", 39.99, "price_1OmxpcGUnxyubwNLfg75hDJX", "Grigia", Size.L, Categories.MAN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshir8);
        Products swittshir9 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwc6e04fcf/images/detail/23I002M0302_03.jpg?sw=700&sfrm=jpg&q=80", "IM FELPA GIROCOLLO BISCIONE", "Felpa nera, presenta la scritta INTER con il disegno del serpente in basso (legato alla squadra).", 39.99, "Nera", Size.XS, Categories.MAN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshir9);
        Products swittshir10 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwb36baff0/images/large/23I002U4901_01.jpg?sw=1400&q=80", "IM GIACCA ALL OVER PATTERN", "Giacca INTER resistente all'acqua, ideali per le stagioni piovose. Bianca con stemmi inter in tutta la giacca, in azzurro ", 59.99, "price_1Omy8IGUnxyubwNLr3wd7XJ0", "Bianca", Size.L, Categories.MAN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshir10);
        Products swittshir11= new Products("https://store.inter.it/on/demandware.static/-/Sites-inter-master-catalog/default/dw4fa3b0b2/images/large/23I002U4902_01.jpg", "IM GIACCA ALL OVER PATTERN", "Giacca INTER resistente all'acqua, ideali per le stagioni piovose. Nera con stemmi inter in tutta la giacca, in azzurro ", 59.99, "Nera", Size.S, Categories.MAN, TypeofProduct.SWEATSHIRT);
        productsDAO.save(swittshir11);

        //PIGIAMI UOMO
        Products pajamasMan1 = new Products("https://www.proxerce.it/ditte/ime/output/files/PigiamiSquadre_Inter_FW22-23_ArtB2IN14130_2BotGiro_Interlock_Nero.jpg", "Pigiama inter uomo", "Pigiama in cotone, maglia azzurra con scritta centrale e pantalone nero", 49.99, "Nero/blu", Size.L, Categories.MAN, TypeofProduct.PAJAMAS);
        productsDAO.save(pajamasMan1);
        Products pajamasMan2 = new Products("https://m.media-amazon.com/images/I/71iuMKNxR-L._AC_UY1000_.jpg", "Pigiama inter uomo ", "Maglia azzurra con grande stemma centrale in nero, pantalone nero con piccolo stemma azzurro", 45.00, "Nero/blu", Size.S, Categories.MAN, TypeofProduct.PAJAMAS);
        productsDAO.save(pajamasMan2);
        Products pajamasMan3 = new Products("https://www.picclickimg.com/NBYAAOSwujJb-9s0/Pigiama-Homewear-Uomo-INTER-Prodotto-Ufficiale-Felpa-Art14069.webp", "Pigiama inter uomo ", "Maglia grigia e blu, con stemma e scritta centrale in blu, pantalone blu", 35.00, "Grigio/blu", Size.S, Categories.MAN, TypeofProduct.PAJAMAS);
        productsDAO.save(pajamasMan3);
        Products pajamasMan4 = new Products("https://m.media-amazon.com/images/I/617k1adcwXL._AC_UY1000_.jpg", "Pigiama inter uomo ", "Maglia grigia, con scritta e piccolo stemma, realizzati in blu e nero. Il pantalone è nero e presenta uno stemma piccolo a destra", 38.00, "Grigio/nero", Size.M, Categories.MAN, TypeofProduct.PAJAMAS);
        productsDAO.save(pajamasMan4);
        Products pajamasMan5 = new Products("https://alerosshop.it/19729-large_default/navigare-pigiama-uomo-cotone-jersey-manica-lunga-2141275.jpg", "Pigiama inter uomo ", "Pigiama in grigio antracite, presenta a destra una taschina azzurra con lo stemma in piccolo", 32.00, "Grigio", Size.L, Categories.MAN, TypeofProduct.PAJAMAS);
        productsDAO.save(pajamasMan5);
        Products pajamasMan6 = new Products("https://www.mondomaniamodugno.it/16671-large_default/pigiama-corto-ufficiale-inter-uomo-estivo-14106.jpg", "Pigiama inter uomo ", "Pigiama estivo, maglia nera con stemma centrale blu a manica corta e pantaloncino corto con fantasia a quadretti ", 29.99, "Nero", Size.XS, Categories.MAN, TypeofProduct.PAJAMAS);
        productsDAO.save(pajamasMan6);
        Products pajamasMan7 = new Products("https://www.picclickimg.com/l~wAAOSwgW1kgyaU/Pigiama-Uomo-INTER-Prodotto-Ufficiale-Cotone-2.webp", "Pigiama inter uomo ", "Pigiama estivo, maglia azzurro con scritta centrale bianca a manica corta e pantaloncino corto nero con stemma piccolo a destra ", 24.99, "Nero", Size.XS, Categories.MAN, TypeofProduct.PAJAMAS);
        productsDAO.save(pajamasMan7);
        Products pajamasMan8 = new Products("https://www.soccertime.it/45943-large_default/fc-inter-pigiama-serafino-pile-nero.jpg", "Pigiama inter uomo ", "Pigiama in pile nero, modello felpa, con scritta centrale in azzurro e sotto stemma ", 27.99, "Nero", Size.S, Categories.MAN, TypeofProduct.PAJAMAS);
        productsDAO.save(pajamasMan8);

       //TUTE UOMO
        Products suitMan1 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw269e7a95/images/large/23N002M2902_01.jpg?sw=1400&q=80", "Tuta inter uomo", "Tuta in cotone, maglia con stemma centrale", 35.99, "price_1OmyEWGUnxyubwNLiJwiwXTe" , "Nero/blu", Size.L, Categories.MAN, TypeofProduct.SUIT);
        productsDAO.save(suitMan1);
        Products suitMan2 = new Products("https://static.nike.com/a/images/t_PDP_1280_v1/f_auto,q_auto:eco/198d6b92-ba26-4fd8-bbb4-df7c6b0d983a/tuta-da-calcio-in-maglia-con-cappuccio-dri-fit-inter-strike-da-terza-R8cQvm.png", "Tuta uomo inter ", "Tuta arancione e grigia, con stemma nike a sinistra e stemma inter a destra", 69.00, "price_1OmyI5GUnxyubwNLrVR0cf1w" , "Arancione/grigia", Size.S, Categories.MAN, TypeofProduct.SUIT);
        productsDAO.save(suitMan2);
        Products suitMan3 = new Products("https://www.maestridelcalcio.com/wp-content/uploads/2022/09/TUONOME-2.jpg", "Tuta inter uomo ", "Tuta inter blu notte, con logo nike e stemma inter", 59.00, "Blu", Size.S, Categories.MAN, TypeofProduct.SUIT);
        productsDAO.save(suitMan3);
        Products suitMan4 = new Products("https://flylinestore.com/images/detailed/10/CW1221_VERDE_1.jpg", "Tuta inter uomo", "Tuta, realizzata in verde acqua e nero. Tessuto: Poliestere e cotone", 64.99, "Verde/nero", Size.M, Categories.MAN, TypeofProduct.SUIT);
        productsDAO.save(suitMan4);
        Products suitMan5 = new Products("https://www.merchandisingplaza.com/519229/2/Tute-Inter-Tuta-Inter-2023-24-l.jpg", "Tuta inter uomo ", "Tuta inter celeste, con logo nike e stemma inter", 60.00, "Celeste", Size.S, Categories.MAN, TypeofProduct.SUIT);
        productsDAO.save(suitMan5);
        Products suitMan6= new Products("https://www.sportingplus.net/13304/tuta-da-rappresentanzaallenamento-inter-2020-nike.jpg", "Tuta inter uomo", "Tuta marrone, realizzata in tessuto: Poliestere e cotone. Con stemma nike e stemma inter", 54.99, "Marrone/nero", Size.M, Categories.MAN, TypeofProduct.SUIT);
        productsDAO.save(suitMan6);
        Products suitMan7 = new Products("https://www.sportit.com/ir/133962/f/f/0/600/0/1577718600148/tuta-calcio-inter-strike-19/20-grigio-giallo.jpg", "Tuta inter uomo", "Tuta grigia con riporti gialli, realizzata in tessuto: Poliestere e cotone. Con stemma nike e stemma inter", 69.99, "Grigio/giallo", Size.M, Categories.MAN, TypeofProduct.SUIT);
        productsDAO.save(suitMan7);
        Products suitMan8 = new Products("https://www.fontanasportshop.it/media/catalog/product/cache/942a02295ecaf7fd13402a9be0546922/6/1/610523100_1_1.jpg", "Tuta inter uomo", "Maglia di tuta bianca, pantalone blu, realizzata in tessuto: Poliestere e cotone. Con stemma nike e stemma inter", 78.99, "Bianco/blu", Size.M, Categories.MAN, TypeofProduct.SUIT);
        productsDAO.save(suitMan8);
        Products suitMan9 = new Products("https://img4.dhresource.com/webp/m/0x0/f3/albu/km/l/04/9dbd7a04-20df-4135-a034-a564b7ae7591.jpg", "Tuta inter uomo", "Maglia tuta verde, pantalone nero, realizzata in cotone. Con stemma nike e stemma inter", 72.99, "Verde/nero", Size.M, Categories.MAN, TypeofProduct.SUIT);
        productsDAO.save(suitMan9);

       // TUTE DONNA
        Products suitWomen1 = new Products("https://static.nike.com/a/images/t_PDP_1280_v1/f_auto,q_auto:eco/185607a4-e8fb-41c5-b1f3-5f6b217ec5e0/felpa-pullover-con-cappuccio-dri-fit-inter-standard-issue-JT8kQB.png", "Tuta inter donna", "Tuta in pile, maglia con logo nike e stemma nike, questi ultimi realizzati in colore oro", 79.99, "Nero/oro", Size.L, Categories.WOMEN, TypeofProduct.SUIT);
        productsDAO.save(suitWomen1);
        Products suitWomen2 = new Products("https://static.nike.com/a/images/t_PDP_1280_v1/f_auto,q_auto:eco/6fbdd6c4-94ee-4c6d-b01c-8a3b96e53ed4/felpa-pullover-con-cappuccio-dri-fit-inter-hfP4P3.png", "Tuta inter donna ", "Tuta nera e blu, con stemma nike a sinistra e stemma inter a destra. Pantalone beige, sempre con logo nike", 85.99, "Nero/Beige", Size.S, Categories.WOMEN, TypeofProduct.SUIT);
        productsDAO.save(suitWomen2);
        Products suitWomen3 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw5b053516/images/detail/22N003W0702_03.jpg?sw=1400&q=80", "Pantalone tuta Donna, nero ", "Tuta nera con logo inter a sinistra e a destra logo nike", 45.00, "Nera", Size.S, Categories.WOMEN, TypeofProduct.SUIT);
        productsDAO.save(suitWomen3);
        Products suitWomen4 = new Products("https://media.foot-store.it/catalog/product/cache/image/1800x/9df78eab33525d08d6e5fb8d27136e95/n/i/nike_dv5032-010-phsfm001.jpg", "Tuta inter donna", "Tuta nera, realizzata in cerata. Con logo nike e stemma inter in giallo", 64.99, "Verde/nero", Size.M, Categories.WOMEN, TypeofProduct.SUIT);
        productsDAO.save(suitWomen4);

        // PANTALONI UOMO
        Products pants1 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwd27bbb8f/images/large/22N003M0502_01.jpg?sw=1400&q=80", "Pantalone inter uomo", "Pantalone di tuta, con stemma e logo nike in giallo", 54.99, "Nero/giallo", Size.M, Categories.MAN, TypeofProduct.PANTS);
        productsDAO.save(pants1);
        Products pants2 = new Products("https://www.ferrarisport.it/wp-content/uploads/2021/09/CW0574-010-PHSFM001-2000.jpeg", "Pantalone inter uomo ", "Tuta nera, piccolo stesso a sinistra con serprente nike a destra", 54.99, "", Size.S, Categories.MAN, TypeofProduct.PANTS);
        productsDAO.save(pants2);
        Products pants3 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwb0308456/images/large/23N003M0602_01.jpg?sw=1400&q=80", "Pantalone inter uomo ", "Presenta logo nike a destra, e a sinistra scritta Inter Milano", 59.90, "Nero", Size.XS, Categories.MAN, TypeofProduct.PANTS);
        productsDAO.save(pants3);
        Products pants4 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw56068bac/images/large/23N003M1603_01.jpg?sw=1400&q=80", "Pantalone inter uomo", "Realizzata in azzurro, con stemma inter a sinistra e logo nike a destra", 64.99, "Azzurro", Size.S, Categories.MAN, TypeofProduct.PANTS);
        productsDAO.save(pants4);
        Products pants5 = new Products("https://ochsnersport.scene7.com/asset/ochsnersport/ext/2110443_P.jpg", "Pantalone inter uomo ", "Presenta logo nike e stemma inter", 55.00, "Blu navy", Size.M, Categories.MAN, TypeofProduct.PANTS);
        productsDAO.save(pants5);
        Products pants6= new Products("https://www.futbolemotion.com/imagesarticulos/156955/grandes/pantalon-largo-nike-inter-de-milan-strike-2021-2022-black-turbo-green-2.jpg", "Pantalone inter uomo", "Pantalone inter, realizzata in cerata. Con stemma nike e stemma inter in verde acqua", 54.99, "Nero/verde", Size.L, Categories.MAN, TypeofProduct.PANTS);
        productsDAO.save(pants6);
        Products pants7 = new Products("https://img01.ztat.net/article/spp-media-p1/49c80935c526442bba03ecad078c2896/591bd892119f4af9943792da963f936c.jpg?imwidth=1800", "Pantalone inter uomo", "Pantalone inter, on riporti gialli, realizzata in tessuto: Poliestere e cotone. Con stemma nike e stemma inter in arancione", 69.99, "Blu/arancione", Size.XS, Categories.MAN, TypeofProduct.PANTS);
        productsDAO.save(pants7);

        // SET CALCIO UOMO
        Products set1 = new Products("https://www.sportcentercesena.com/media/catalog/product/cache/1/image/1200x1200/9df78eab33525d08d6e5fb8d27136e95/1/3/13842/MAGLIA-CALCIO-INTER-FC-23-24-NEUTRA-IN0124-IN0124-31.jpg", "Set calcio inter 2024", "Maglietta calcio inter 2024", 34.99, "price_1OmyPAGUnxyubwNLQCZ7tREQ" ,"Nero/azzurro", Size.M, Categories.MAN, TypeofProduct.SETFOOTBALL);
        productsDAO.save(set1);
        Products set2 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw29761fd7/images/large/23N001M1608_01.jpg?sw=700&sfrm=jpg&q=80", "Set calcio inter 2024", "Terza maglia calcio inter 2024", 34.99, "price_1OmyR4GUnxyubwNLAr8NaFyl" , "Arancione", Size.S, Categories.MAN, TypeofProduct.SETFOOTBALL);
        productsDAO.save(set2);
        Products set3 = new Products("https://www.pelusciamo.com/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/c/o/completo_inter_as.jpg", "Set calcio inter 2024", "Completo pantaloncino e maglietta inter 2024", 120.99, "Nero/azzurro", Size.M, Categories.MAN, TypeofProduct.SETFOOTBALL);
        productsDAO.save(set3);
        Products set4 = new Products("https://d18c63gzk0ps2w.cloudfront.net/media/catalog/product/cache/8f568ca51e2bd5270292b106648095e7/N/I/NIKECV8153_100_01_e97a.jpg", "Set calcio inter 2024", "Pantaloncino bianco inter, con logo nike", 55.99, "Bianco", Size.S, Categories.MAN, TypeofProduct.SETFOOTBALL);
        productsDAO.save(set4);
        Products set5 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw10c8cd5c/images/large/23N001M0501_01.jpg?sw=1400&q=80", "Set calcio inter 2024", "Maglia bianca calcio INTER", 95.00, "Bianco", Size.M, Categories.MAN, TypeofProduct.SETFOOTBALL);
        productsDAO.save(set5);
        Products set6= new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwfafd9624/images/large/23N001M1708_01.jpg?sw=1400&q=80", "Set calcio inter 2024", "Pantaloncino arancione uomo, con logo nike e stemma nike", 54.99, "Arancione", Size.XS, Categories.MAN, TypeofProduct.SETFOOTBALL);
        productsDAO.save(set6);
        Products set7 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwaba020af/images/large/23N001U0801_01.jpg?sw=1400&q=80", "Set calcio inter 2024", "Calzettoni calcio inter bianchi", 19.99, "Bianco", Size.ONESIZE, Categories.UNISEX, TypeofProduct.SETFOOTBALL);
        productsDAO.save(set7);

        // SET CALCIO DONNA
        Products setW1 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw7e267de2/images/detail/23N001W0903_03.jpg?sw=700&sfrm=jpg&q=80", "Set calcio Donna Inter", "Prima maglia calcio inter 2024", 94.99, "Nero/azzurro", Size.M, Categories.WOMEN, TypeofProduct.SETFOOTBALL);
        productsDAO.save(setW1);
        Products setW2 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwb667c7cb/images/large/23N001W1001_01.jpg?sw=1400&q=80", "Set calcio Donna inter", "Seconda maglia calcio inter 2023/24", 94.99, "Bianca", Size.S, Categories.WOMEN, TypeofProduct.SETFOOTBALL);
        productsDAO.save(setW2);
        Products setW3 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw570b32e0/images/large/23N001W1808_01.jpg?sw=1400&q=80", "Set calcio Donna inter", "Terza maglia calcio inter 2023/24", 94.99, "Nero/azzurro", Size.M, Categories.WOMEN, TypeofProduct.SETFOOTBALL);
        productsDAO.save(setW3);

        //MAGLIETTE BAMBINO

        Products tshirKid1 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw7258a6f8/images/detail/22I002K12901_03.jpg?sw=1400&q=80", "Maglietta Inter Bambino", "Maglietta bianca, realizzata in cotone. Presenta un disegno centrale", 24.99, "price_1OmyJuGUnxyubwNLjx21NZem","Bianca", Size.SIX_YEARS, Categories.KIDS, TypeofProduct.TSHIRT);
        productsDAO.save(tshirKid1);
        Products tshirKid2 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw25a6d21e/images/detail/22I002K12905_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt Inter Bambino", "Maglietta azzurra, realizzata in cotone, presenta un disegno centrale ", 24.99, "Azzurra", Size.EIGHT_YEARS, Categories.KIDS, TypeofProduct.TSHIRT);
        productsDAO.save(tshirKid2);
        Products tshirKid3 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw00c112c0/images/detail/22I002K7904_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt Inter Bambino", "Maglietta nera, realizzata in cotone, presenta disegno del calcio balilla con giocatori dell'inter ", 26.99, "Nera", Size.SIX_YEARS, Categories.KIDS, TypeofProduct.TSHIRT);
        productsDAO.save(tshirKid3);
        Products tshirKid4 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw56abbceb/images/detail/22L002K11501_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt Inter Bambino", "Maglietta bianca, realizzata in cotone, presenta una scritta centrale", 25.99, "Bianca", Size.TEN_YEARS, Categories.KIDS, TypeofProduct.TSHIRT);
        productsDAO.save(tshirKid4);
        Products tshirKid5 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw8c19efa0/images/detail/22L002K11515_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt Inter Bambino", "Maglietta bianca, realizzata in cotone, presenta una scritta centrale", 22.99, "Verde Militare", Size.EIGHT_YEARS, Categories.KIDS, TypeofProduct.TSHIRT);
        productsDAO.save(tshirKid5);
        Products tshirKid6 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwc94af5da/images/detail/22L002K11502_03.jpg?sw=700&sfrm=jpg&q=80", "Tshirt Inter Bambino", "Maglietta bianca, realizzata in cotone, presenta una scritta centrale", 22.99, "price_1OmyN7GUnxyubwNLenEJsKiW","Nera", Size.TWELVE_YEARS, Categories.KIDS, TypeofProduct.TSHIRT);
        productsDAO.save(tshirKid6);

        //SET CALCIO BAMBINO

        Products calcioKids1 = new Products("https://calcioitalia.com/media/cache/sylius_shop_product_large_thumbnail/5c/77/49c2e8733eac6f416c2d93102ea0.jpeg", "Set calcio Bambino", "Set calcio bambino, prima maglia, colori: nero azzurro", 60.00, "Nero/azzurro", Size.TEN_YEARS, Categories.KIDS, TypeofProduct.SETFOOTBALL);
        productsDAO.save(calcioKids1);
        Products calcioKids2 = new Products("https://static.nike.com/a/images/c_limit,w_592,f_auto/t_product_v1/a1ca29fe-efd2-4f35-84d4-e98ec1e274cd/maglia-da-calcio-dri-fit-inter-2023-24-stadium-per-away-CflvXz.png", "Maglia calcio Bambino", "Set calcio bambino, seconda maglie, bianca", 49.00, "Bianco", Size.SIX_YEARS, Categories.KIDS, TypeofProduct.SETFOOTBALL);
        productsDAO.save(calcioKids2);
        Products calcioKids3 = new Products("https://madrid-shop.cn/wp-content/uploads/2023/12/Camiseta-Inter-Milan-Tercera-Equipacion-2023-24-Nino-jpg.webp", "Set calcio Bambino", "Set calcio bambino, terza maglia, in arancione", 60.00, "Arancione", Size.EIGHT_YEARS, Categories.KIDS, TypeofProduct.SETFOOTBALL);
        productsDAO.save(calcioKids3);

        //PIGIAMA BAMBINO

        Products pajamasKid1 = new Products("https://www.intimorosa.com/media/catalog/product/cache/54bf89b287c48ac25e0fac3973c2572a/d/s/dsc_1506_1.jpg", "Pigiama inter bambino", "Pigiama in cotone nero, con taschino con stemma piccolo inter", 46.99, "Nero", Size.TEN_YEARS, Categories.KIDS, TypeofProduct.PAJAMAS);
        productsDAO.save(pajamasKid1);
        Products pajamasKid2 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dweb6bd1f7/images/large/22L008K0810_01.jpg?sw=1400&q=80", "Pigiama inter bambino ", "Maglia grigia con scritta IM e lo stemma , e pantalone nero con piccolo stemma azzurro", 39.99, "Nero/grigio", Size.SIX_YEARS, Categories.KIDS, TypeofProduct.PAJAMAS);
        productsDAO.save(pajamasKid2);
        Products pajamasKid3 = new Products("https://www.filodirettosrl.it/wp-content/uploads/2022/10/inter-pigiama-bimbo-IN16011.jpg", "Pigiama inter uomo ", "Pigiama grigio con riportini azzurri per bambino, pantalone azzurro con stemma inter nero", 36.00, "Grigio/azzurro", Size.TEN_YEARS, Categories.KIDS, TypeofProduct.PAJAMAS);
        productsDAO.save(pajamasKid3);
        Products pajamasKid4 = new Products("https://photos6.spartoo.it/photos/164/16477433/16477433_500_A.jpg", "Pigiama inter bambino ", "Maglia grigia e azzurra, presenta una scritta centrale INTER al centro della maglietta", 25.99, "Grigio/azzzurro", Size.SIX_YEARS, Categories.KIDS, TypeofProduct.PAJAMAS);
        productsDAO.save(pajamasKid4);
        Products pajamasKid5 = new Products("https://www.filodirettosrl.it/wp-content/uploads/2022/10/inter-pigiama-bimbo-IN16020-1.jpg", "Pigiama inter bambino ", "Maglietta pigiama in grigio, con serpente raffigurato al centro, pigiama azzurro con scritta inter bianca", 32.00, "Grigio/azzurro", Size.EIGHT_YEARS, Categories.KIDS, TypeofProduct.PAJAMAS);
        productsDAO.save(pajamasKid5);
        Products pajamasKid6 = new Products("", "Pigiama inter bambino ", "Maglietta nero e azzurra, con scritta INTER realizzata di lato, in nero. Il pantalone sotto è in nero con scritta inter in azzurro", 28.90, "Grigio/azzurro", Size.SIX_YEARS, Categories.KIDS, TypeofProduct.PAJAMAS);
        productsDAO.save(pajamasKid6);

        //FELPE BAMBINO
        Products felpa1 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwa0ece432/images/detail/23I002K8011_03.jpg?sw=700&sfrm=jpg&q=80", "Felpa inter bambino", "Felpa in grigio per bambini, con scritta INTER centrale, di piccole dimensioni", 30.99, "Grigio Antracite", Size.EIGHT_YEARS, Categories.KIDS, TypeofProduct.SWEATSHIRT);
        productsDAO.save(felpa1);
        Products felpa2 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwef15153f/images/detail/23I002K5407_03.jpg?sw=700&sfrm=jpg&q=80", "Felpa inter bambino", "La felpa presenta molti stemmi dell'inter in tutta la felpa, ogni stemma racchiuso in un colore diverso", 39.99, "Giallo/nero/blu", Size.SIX_YEARS, Categories.KIDS, TypeofProduct.SWEATSHIRT);
        productsDAO.save(felpa2);
        Products felpa3 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw2a0531ab/images/detail/23I002K0602_03.jpg?sw=700&sfrm=jpg&q=80", "Felpa inter bambino", "Felpa nera in poliestere e cotone, presenta una scritta centrale: INTER ", 45.00, "nera", Size.TEN_YEARS, Categories.KIDS, TypeofProduct.SWEATSHIRT);
        productsDAO.save(felpa3);
        Products felpa4 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw220fb2a1/images/detail/23I002K0410_03.jpg?sw=700&sfrm=jpg&q=80", "Felpa inter bambino", "Felpa grigia, presenta la scritta inter e un serpente sotto", 33.99, "Grigio", Size.SIX_YEARS, Categories.KIDS, TypeofProduct.SWEATSHIRT);
        productsDAO.save(felpa4);
        Products felpa5 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw3b534d27/images/detail/22L002K11702_03.jpg?sw=700&sfrm=jpg&q=80", "Felpa inter bambino", "Felpa nera, apri e chiudi", 42.00, "Nera", Size.EIGHT_YEARS, Categories.KIDS, TypeofProduct.SWEATSHIRT);
        productsDAO.save(felpa5);
        Products felpa6 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwb4255507/images/detail/23I002K0405_03.jpg?sw=700&sfrm=jpg&q=80", "Felpa inter bambino", "Felpa azzurra, presenta la scritta inter e un serpente sotto", 40.00, "Azzurra", Size.EIGHT_YEARS, Categories.KIDS, TypeofProduct.SWEATSHIRT);
        productsDAO.save(felpa6);
        Products felpa7 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw8c59329d/images/detail/22I002K13204_03.jpg?sw=700&sfrm=jpg&q=80", "Felpa inter bambino ", "Felpa nera con disegno centrale rappresentante Dzeko", 34.90, "Nera", Size.TEN_YEARS, Categories.KIDS, TypeofProduct.SWEATSHIRT);
        productsDAO.save(felpa7);

        //TUTE KIDS
        Products tuta1 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwd4375330/images/large/22L003K2402_01.jpg?sw=1400&q=80", "Pantalone inter bambino", "Pantalone di tuta nero per bambini, con stemma gommato inter in grigio", 30.99, "Nero", Size.EIGHT_YEARS, Categories.KIDS, TypeofProduct.SUIT);
        productsDAO.save(tuta1);
        Products tuta2 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw03ea616e/images/large/23N002K1519_01.jpg?sw=1400&q=80", "Tuta inter bambino", "Tuta inter per bambino. Felpa celeste con logo nike e stemma inter e pantalone nero", 104.99, "Celeste/nero", Size.TWELVE_YEARS, Categories.KIDS, TypeofProduct.SUIT);
        productsDAO.save(tuta2);
        Products tuta3 = new Products("https://www.maestridelcalcio.com/wp-content/uploads/2018/03/TUTA-ZIP-UFFICIALE-BAMBINO-INTER-PERSONALIZZATA.jpg", "Tuta inter bambino", "Tuta inter bambino. Con felpa e pantalone blu notte, con fantasia strisce colorare e stemma inter in alto", 89.99, "Blu", Size.TEN_YEARS, Categories.KIDS, TypeofProduct.SUIT);
        productsDAO.save(tuta3);
        Products tuta4 = new Products("https://cdn.printerval.com/image/960x960/hoodies-bambini-classic-hoodie-1,maroon,print-2023-08-14+c11ec95d-5ca3-4c6d-b622-125188526221,6a2f4d.jpeg", "Felpa inter bambino", "Felpa bordeaux con scritta centrale in bianco e blu", 30.99, "Bordeaux", Size.EIGHT_YEARS, Categories.KIDS, TypeofProduct.SUIT);
        productsDAO.save(tuta4);
        Products tuta5 = new Products("https://www.sport85.com/on/demandware.static/-/Sites-sport85-catalog-master/default/dwb1dcb200/images/large/2000216750216/200021675021650.jpg", "Tuta inter bambino", "Tuta inter, felpa verde acqua con riportini e pantalone di tuta nero e riportini verdi", 100.99, "", Size.TEN_YEARS, Categories.KIDS, TypeofProduct.SUIT);
        productsDAO.save(tuta5);
        Products tuta6 = new Products("https://www.game7athletics.com/media/catalog/product/cache/7e5edc493104757145bc3cfcb741eab0/e/2/e293a1436d94fa64d675417bc578eefe674e6d8c01f59da4830f5e420b1b489b.jpeg?impolicy=original", "Tuta inter bambino", "Felpa inter bambino, in colore nero riporta una fantasia di colore grigio, con stemma e logo nike in colore oro", 100.99, "Nero", Size.EIGHT_YEARS, Categories.KIDS, TypeofProduct.SUIT);
        productsDAO.save(tuta6);
        Products tuta7 = new Products("https://m.media-amazon.com/images/I/81dPrfvHDQL._AC_UY1000_.jpg", "Tuta inter bambino", "Tuta grigia Inter, con stemma inter e scritta in basso", 50.30, "Grigia", Size.SIX_YEARS, Categories.KIDS, TypeofProduct.SUIT);
        productsDAO.save(tuta7);
        Products tuta8 = new Products("https://www.calciogadgets.com/image/cache/catalog/Felpe/felpa-inter-ufficiale-camouflage-adulto-bambino--510x600.jpg", "Tuta inter bambino", "Felpa inter, realizzata in nero e blu, con fantasia militare e scritta inter centrale in giallo", 100.99, "Nero/blu", Size.EIGHT_YEARS, Categories.KIDS, TypeofProduct.SUIT);
        productsDAO.save(tuta8);

        //PRODOTTI SCONTATI

        Products sale7 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwf077b32e/images/detail/23I029U0202_03.jpg?sw=700&sfrm=jpg&q=80", "IM BORSONE DA VIAGGIO", "Articolo in sconto", 48.00, "Nero", Size.ONESIZE, Categories.UNISEX, TypeofProduct.SALES);
        productsDAO.save(sale7);
        Products sale8 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw02784f49/images/detail/23I029U0204_03.jpg?sw=700&sfrm=jpg&q=80", "IM BORSONE DA VIAGGIO", "Articolo in sconto", 48.00, "Nero", Size.ONESIZE, Categories.UNISEX, TypeofProduct.SALES);
        productsDAO.save(sale8);
        Products sale9 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwb7919fd2/images/large/23I004U0902_01.jpg?sw=1400&q=80", "IM CAPPELLINO EVERYDAY INTER", "Cappellino Inter con visiera, logo e scritta gommate", 19.99, "Nero", Size.ONESIZE, Categories.MAN, TypeofProduct.ACCESSORIES);
        productsDAO.save(sale9);
        Products sale10 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw3f57e350/images/large/23I004U0904_01.jpg?sw=1400&q=80", "IM CAPPELLINO EVERYDAY INTER", "Cappellino Inter con visiera, logo e scritta gommate", 19.99, "Blu", Size.ONESIZE, Categories.MAN, TypeofProduct.ACCESSORIES);
        productsDAO.save(sale10);
        Products sale11 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw084fb211/images/detail/22L023U2702_03.jpg?sw=700&sfrm=jpg&q=80", "IM INTER BOTTLES CLIMA BOTTLE NERO", "Borraccia termica INTER, con design: SERPENTE e STEMMA INTER", 40.00, "Bianco", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(sale11);
        Products sale12 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw6cd0ba5b/images/detail/22L023U2803_03.jpg?sw=700&sfrm=jpg&q=80", "IM INTER BOTTLES CLIMA BOTTLE BLU", "Borraccia termica Inter, con design: SERPENTE e STEMMA INTER", 40.00, "Bianco", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(sale12);

        //ACCESSORIES

        Products accessories1 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwb7919fd2/images/large/23I004U0902_01.jpg?sw=1400&q=80", "IM CAPPELLINO EVERYDAY INTER", "Cappellino Inter con visiera, logo e scritta gommate", 19.99, "Nero", Size.ONESIZE, Categories.MAN, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories1);
        Products accessories2 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw3f57e350/images/large/23I004U0904_01.jpg?sw=1400&q=80", "IM CAPPELLINO EVERYDAY INTER", "Cappellino Inter con visiera, logo e scritta gommate", 19.99, "Blu", Size.ONESIZE, Categories.MAN, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories2);
        Products accessories3 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw3cb8a35a/images/detail/23I004U0911_03.jpg?sw=700&sfrm=jpg&q=80", "IM CAPPELLINO EVERYDAY INTER", "Cappellino Inter con visiera, logo e scritta gommate", 19.99, "Grigio", Size.ONESIZE, Categories.MAN, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories3);
        Products accessories4 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwa50bae07/images/detail/23I004U1102_03.jpg?sw=700&sfrm=jpg&q=80", "IM BERRETTO ALL OVER PATTERN", "Cappello nero, visiera con design e stemma centrale blu ", 21.99, "Nero", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories4);
        Products accessories5 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwf62736e7/images/detail/23I004U1101_03.jpg?sw=700&sfrm=jpg&q=80", "IM CAPPELLINO ALL OVER PATTERN", "Cappello bianco, visiera con design e stemma centrale blu", 23.99, "Nero", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories5);
        Products accessories6 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw9548a3c8/images/large/22L004U0402_01.jpg?sw=1400&q=80", "IM CAPPELLO CON RIBALTA", "Berretto invernale, di colore nero con strisce blu. Nella parte in basso presenta lo stemma della squadra", 19.99, "Nero", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories6);
        Products accessories7 = new Products("https://store.inter.it/on/demandware.static/-/Sites-inter-master-catalog/default/dw0e11b9e6/images/large/22L004U0401_01.jpg", "IM CAPPELLO CON RIBALTA", "Berretto invernale, di colore bianco con strisce blu e nere. Nella parte in basso presenta lo stemma della squadra", 19.99, "Bianco", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories7);
        Products accessories8 = new Products("https://store.inter.it/on/demandware.static/-/Sites-inter-master-catalog/default/dwd5088724/images/large/22L004U0407_01.jpg", "IM CAPPELLO CON RIBALTA", "Berretto invernale, di colore giallo con strisce blu e nere. Nella parte in basso presenta lo stemma della squadra", 19.99, "Giallo", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories8);
        Products accessories9 = new Products("https://store.inter.it/on/demandware.static/-/Sites-inter-master-catalog/default/dw20b7ac8c/images/large/22L004U0416_01.jpg", "IM CAPPELLO A RIGHE CON RIBALTA", "Berretto Inter, realizzato in rosa con strisce nero azzurre", 19.99, "Rosa", Size.ONESIZE, Categories.WOMEN, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories9);
        Products accessories10 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw8ca8471d/images/large/23I012U0502_01.jpg?sw=1400&q=80", "IM PORTAFOGLIO SNAKE CLUB", "Portafoglio in pelle nero, figura centrale con serpente e stemma inter ", 36.99, "Nero", Size.ONESIZE, Categories.MAN, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories10);
        Products accessories11 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw63eb6b39/images/detail/23I006U0102_03.jpg?sw=700&sfrm=jpg&q=80", "IM CINTURA EVERYDAY", "Cintura uomo, in grigio", 22.99, "Grigio", Size.ONESIZE, Categories.MAN, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories11);
        Products accessories12 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw056ef798/images/detail/22L006U0602_03.jpg?sw=700&sfrm=jpg&q=80", "IM GUANTI IN PELLE", "Guanti in pelle con piccolo stemma in basso", 39.99, "Nero", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories12);
        Products accessories13 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwc3e008a2/images/large/23L014U0409_01.jpg?sw=1400&q=80", "IM OROLOGIO TOP CHRONO", " Orologio INTER, cassa in acciaio da 42 mm con lunetta e bracciale neri, impermeabile fino a 100 metri.", 189.99, "Argento", Size.ONESIZE, Categories.MAN, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories13);
        Products accessories14 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw349eefef/images/detail/23L014M0209_04.jpg?sw=700&sfrm=jpg&q=80", "IM OROLOGIO SUB BLACK & BLUE", "L'orologio INTER Sub presenta un design unico. È sportivo e presenta una cassa e bracciale in acciaio inossidabile da 42 mm. L'orologio è impermeabile fino a 100 metri.", 154.99, "Argento", Size.ONESIZE, Categories.MAN, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories14);
        Products accessories15 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwd2973d5e/images/detail/23L012U0709_02.jpg?sw=700&sfrm=jpg&q=80", "IM PORTACHIAVI CHAMPIONS LEAGUE TROPHY 3D", "Portachiavi realizzato in metallo, presenta una coppa con scritta centrale, dedicata alla stagione Inter in Champions League.", 16.99, "Argento", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories15);
        Products accessories16 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw6500e414/images/detail/23L031U0102_03.jpg?sw=700&sfrm=jpg&q=80", "IM CALENDARIO INTER 2024 VERTICALE", "Calendario Inter ufficiale, anno corrente: 2024", 12.99, "Nero", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories16);
        Products accessories17 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw5b5bd3cf/images/detail/23I012U0202_02.jpg?sw=700&sfrm=jpg&q=80", "IM PORTACHIAVI EVERYDAY", "Il portachiavi Everyday INTER è un accessorio elegante. Realizzato in poliestere, presenta il logo del Club gommato.", 9.99, "Nero", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories17);
        Products accessories18 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwdfd5cc58/images/detail/23I012U0204_02.jpg?sw=700&sfrm=jpg&q=80", "IM PORTACHIAVI EVERYDAY", "Il portachiavi Everyday INTER è un accessorio elegante. Realizzato in poliestere, presenta il logo del Club gommato.", 9.99, "Blu", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories18);
        Products accessories19 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw399a4b35/images/large/23I012U0211_01.jpg?sw=1400&q=80", "IM PORTACHIAVI EVERYDAY", "Il portachiavi Everyday INTER è un accessorio elegante. Realizzato in poliestere, presenta il logo del Club gommato.", 9.99, "Argento", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories19);
        Products accessories20 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw9f56f974/images/detail/22L012U1409_02.jpg?sw=700&sfrm=jpg&q=80", "IM PORTACHIAVI LOGO GIREVOLE", "Il portachiavi INTER è realizzato in acciaio, presenta lo stemma del club", 10.99, "Argento", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories20);
        Products accessories21 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwf80822ae/images/detail/22L012U0809_02.jpg?sw=700&sfrm=jpg&q=80", "IM PORTACHIAVI SMALTATO", "Il portachiavi INTER è realizzato in acciaio, presenta lo stemma del club", 9.99, "Argento", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories21);
        Products accessories22 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwd702e2cd/images/detail/22L012U1609_02.jpg?sw=700&sfrm=jpg&q=80", "IM PORTACHIAVI LOGO ARGENTATO EFFETTO ANTICO", "Il portachiavi INTER presenta un effetto antico, con stemma del club", 9.99, "Argento", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories22);
        Products accessories23 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw82090134/images/detail/22L005U1101_02.jpg?sw=700&sfrm=jpg&q=80", "IM SCIARPA A RIGHE NERAZZURRE", "Sciarpa INTER bianca in tessuto acrilico, presenta delle righe blu e nere con stemma nella parte finale", 20.99, "Bianco", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories23);
        Products accessories24 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw2e3f0a56/images/detail/22L005U1107_02.jpg?sw=700&sfrm=jpg&q=80", "IM SCIARPA A RIGHE NERAZZURRE", "Sciarpa INTER gialla in tessuto acrilico, presenta delle righe blu e nere con stemma nella parte finale", 20.99, "Giallo", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories24);
        Products accessories25 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw8363d6a0/images/detail/22L005U1116_02.jpg?sw=700&sfrm=jpg&q=80", "IM SCIARPA A RIGHE NERAZZURRE", "Sciarpa INTER rosa in tessuto acrilico, presenta delle righe blu e nere con stemma nella parte finale", 20.99, "Rosa", Size.ONESIZE, Categories.WOMEN, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories25);
        Products accessories26 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwff2ba5f6/images/detail/22L005U0503_02.jpg?sw=700&sfrm=jpg&q=80", "IM SCIARPA DI PADRE IN FIGLIO", "Sciarpa INTER ", 14.99, "Blue", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories26);
        Products accessories27 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw818b1862/images/detail/22L005U1302_02.jpg?sw=700&sfrm=jpg&q=80", "IM SCIARPA SCRITTA INTER", "Sciarpa INTER ", 9.99, "Blue", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories27);
        Products accessories28 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw5de8440f/images/detail/22L005U1202_02.jpg?sw=700&sfrm=jpg&q=80", "IM SCIARPA CLUB", "Sciarpa INTER ", 9.99, "Blue", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories28);
        Products accessories29 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwc2daed53/images/detail/22L032U0102_02.jpg?sw=700&sfrm=jpg&q=80", "IM BANDIERA LOGO PICCOLA", "Bandiera INTER -  Dimensioni: 50 x 70 x 0,01 cm ", 14.99, "Blu", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories29);
        Products accessories30 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwddb08867/images/detail/22L032U0202_02.jpg?sw=700&sfrm=jpg&q=80", "IM BANDIERA LOGO MEDIA", "Bandiera INTER - Dimensioni: 100 x 140 x 0,01 cm", 19.99, "Blu", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories30);
        Products accessories31 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwc65e2633/images/detail/22L032U0302_02.jpg?sw=700&sfrm=jpg&q=80", "IM BANDIERA LOGO GRANDE", "Bandiera INTER - Dimensioni: 140 x 220 x 0,01 cm ", 29.99, "Blu", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories31);
        Products accessories32 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw4fd86098/images/detail/23I011U0402_03.jpg?sw=700&sfrm=jpg&q=80", "IM ZAINO TRAVEL", "Lo zaino Travel Everyday INTER è realizzato in resistente poliestere, con le seguenti misure: 44 x 31 x 15 cm ", 69.99, "Nero", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories32);
        Products accessories33 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwb77cb3bb/images/detail/23I011U0404_03.jpg?sw=700&sfrm=jpg&q=80", "IM ZAINO TRAVEL", "Lo zaino Travel Everyday INTER è realizzato in resistente poliestere, con le seguenti misure: 44 x 31 x 15 cm", 69.99, "Blu", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories33);
        Products accessories34= new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw4638c844/images/detail/23L029U0302_03.jpg?sw=700&sfrm=jpg&q=80", "IM TROLLEY INTER", "Il trolley INTER è realizzato con un rivestimento rigido di colore nero, le 4 rotelle girevoli garantiscono una mobilità fluida in qualsiasi direzione", 119.99, "Nero", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories34);
        Products accessories35 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwf077b32e/images/detail/23I029U0202_03.jpg?sw=700&sfrm=jpg&q=80", "IM BORSONE DA VIAGGIO", "Borsone da viaggio INTER di colore nero, con stemma centrale nero", 59.99, "Nero", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories35);
        Products accessories36 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw02784f49/images/detail/23I029U0204_03.jpg?sw=700&sfrm=jpg&q=80", "IM BORSONE DA VIAGGIO", "Borsone da viaggio INTER di colore blu, con stemma centrale blu", 59.99, "Nero", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories36);
        Products accessories37 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw1916b895/images/detail/23I029U0211_03.jpg?sw=700&sfrm=jpg&q=80", "IM BORSONE DA VIAGGIO", "Borsone da viaggio INTER di colore grigio, con stemma centrale bianco", 59.99, "Grigio", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories37);
        Products accessories38 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dwe9b35634/images/large/22L023U2401_HOME_01.jpg?sw=700&sfrm=jpg&q=80", "IM TAZZA PERSONALIZZABILE MAGLIA GARA", "Tazza INTER personalizzabile, personalizzabile con il nome", 14.99, "Bianco", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories38);
        Products accessories39 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw4d0e8800/images/detail/22L023U0401_03.jpg?sw=700&sfrm=jpg&q=80", "IM TAZZA LOGO", "Tazza bianca INTER, realizzata in ceramica, con stemma centrale ", 12.99, "Bianco", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories39);
        Products accessories40 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw61b43f15/images/detail/22L023U0603_03.jpg?sw=700&sfrm=jpg&q=80", "IM TAZZA INTER MILANO", "Tazza bianca INTER, realizzata in ceramica, con stemma centrale", 12.99, "Bianco", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories40);
        Products accessories41 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw084fb211/images/detail/22L023U2702_03.jpg?sw=700&sfrm=jpg&q=80", "IM INTER BOTTLES CLIMA BOTTLE NERO", "Borraccia termica INTER, con design: SERPENTE e STEMMA INTER", 40.00, "Bianco", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories41);
        Products accessories42 = new Products("https://store.inter.it/dw/image/v2/BJBQ_PRD/on/demandware.static/-/Sites-inter-master-catalog/default/dw6cd0ba5b/images/detail/22L023U2803_03.jpg?sw=700&sfrm=jpg&q=80", "IM INTER BOTTLES CLIMA BOTTLE BLU", "Borraccia termica Inter, con design: SERPENTE e STEMMA INTER", 40.00, "Bianco", Size.ONESIZE, Categories.UNISEX, TypeofProduct.ACCESSORIES);
        productsDAO.save(accessories42);
    }
}
