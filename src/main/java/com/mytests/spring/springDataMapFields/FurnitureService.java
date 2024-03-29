package com.mytests.spring.springDataMapFields;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 6/30/2022.</p>
 * <p>Project: spring-data-map-fields</p>
 * *
 */
@Service
public class FurnitureService {


    @Autowired
    private FurnitureRepository furnitureRepository;

    public void display(){
        System.out.println("---all:---");

        Iterable<Furniture> all = furnitureRepository.findAll();
        for (Furniture furniture : all) {
            System.out.println(furniture.toString());
        }
        System.out.println("---test search by map keys and values - named parameters:---");
        for (Furniture furniture : furnitureRepository.findByAttributeAndValue("color", "white")) {
            System.out.println(furniture);
        }
        System.out.println("---test search by map keys and values - indexed parameters:---");
        for (Furniture furniture : furnitureRepository.findByAttributeAndValue2("size", "100X180")) {
            System.out.println(furniture);
        }
        System.out.println("---test using || as concatenation:---");
        for (String furniture : furnitureRepository.getIdsNamesPricesConcatenation()) {
            System.out.println(furniture);
        }
    }
}
