package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        //if database is empty, adds sample parts and products
       if (outsourcedPartRepository.count() == 0) {
           OutsourcedPart redPlatePair = new OutsourcedPart();
           redPlatePair.setCompanyName("Eleiko");
           redPlatePair.setName("25KG Plate(Pair)");
           redPlatePair.setInv(15);
           redPlatePair.setPrice(450.0);
           redPlatePair.setId(100L);
           outsourcedPartRepository.save(redPlatePair);

           OutsourcedPart bluePlatePair = new OutsourcedPart();
           bluePlatePair.setCompanyName("Eleiko");
           bluePlatePair.setName("20KG Plate(Pair)");
           bluePlatePair.setInv(15);
           bluePlatePair.setPrice(370.0);
           bluePlatePair.setId(100L);
           outsourcedPartRepository.save(bluePlatePair);

           OutsourcedPart yellowPlatePair = new OutsourcedPart();
           yellowPlatePair.setCompanyName("Eleiko");
           yellowPlatePair.setName("15KG Plate(Pair)");
           yellowPlatePair.setInv(15);
           yellowPlatePair.setPrice(290.0);
           yellowPlatePair.setId(100L);
           outsourcedPartRepository.save(yellowPlatePair);

           OutsourcedPart greenPlatePair = new OutsourcedPart();
           greenPlatePair.setCompanyName("Eleiko");
           greenPlatePair.setName("10KG Plate(Pair)");
           greenPlatePair.setInv(15);
           greenPlatePair.setPrice(200.0);
           greenPlatePair.setId(100L);
           outsourcedPartRepository.save(greenPlatePair);

           OutsourcedPart whitePlatePair = new OutsourcedPart();
           whitePlatePair.setCompanyName("Eleiko");
           whitePlatePair.setName("5KG Plate(Pair)");
           whitePlatePair.setInv(15);
           whitePlatePair.setPrice(120.0);
           whitePlatePair.setId(100L);
           outsourcedPartRepository.save(whitePlatePair);

           OutsourcedPart blackPlatePair = new OutsourcedPart();
           blackPlatePair.setCompanyName("Eleiko");
           blackPlatePair.setName("2.5KG Plate(Pair)");
           blackPlatePair.setInv(15);
           blackPlatePair.setPrice(80.0);
           blackPlatePair.setId(100L);
           outsourcedPartRepository.save(blackPlatePair);

           OutsourcedPart silverPlatePair = new OutsourcedPart();
           silverPlatePair.setCompanyName("Eleiko");
           silverPlatePair.setName("1.25KG Plate(Pair)");
           silverPlatePair.setInv(15);
           silverPlatePair.setPrice(60.0);
           silverPlatePair.setId(100L);
           outsourcedPartRepository.save(silverPlatePair);

           OutsourcedPart bench = new OutsourcedPart();
           bench.setCompanyName("Eleiko");
           bench.setName("Bench");
           bench.setInv(30);
           bench.setPrice(700.0);
           bench.setId(100L);
           outsourcedPartRepository.save(bench);

           OutsourcedPart rack = new OutsourcedPart();
           rack.setCompanyName("Eleiko");
           rack.setName("Squat/Bench Rack");
           rack.setInv(30);
           rack.setPrice(5000.0);
           rack.setId(100L);
           outsourcedPartRepository.save(rack);
       }

      /*  OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());*/

        //List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        //for(OutsourcedPart part:outsourcedParts){
        //    System.out.println(part.getName()+" "+part.getCompanyName());
        //}

        if (productRepository.count() == 0) {

            Product starterPack = new Product("Starter Pack", 7270.0, 15);
            Product allPlatePack = new Product("Full Plate Pack", 1570.0, 15);
            Product bigPlatePack = new Product("Big Plate Pack", 1310.0, 15);
            Product smallPlatePack = new Product("Small Plate Pack", 260.0, 15);
            Product comboRack = new Product("Combo Rack", 5700.0, 15);
            productRepository.save(starterPack);
            productRepository.save(allPlatePack);
            productRepository.save(bigPlatePack);
            productRepository.save(smallPlatePack);
            productRepository.save(comboRack);
        }


        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
