package com.example.demo.model;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class HotelCab {
    public static void main(String[] args) {
        HotelCab hotelCab = new HotelCab();
        
        // Print sources
        System.out.println("Sources:");
        List<String> sources = hotelCab.getSources();
        for (String source : sources) {
            System.out.println(source);
        }

        // Print destinations
        System.out.println("\nDestinations:");
        List<String> destinations = hotelCab.getDestinations();
        for (String destination : destinations) {
            System.out.println(destination);
        }

        // Print cabs
        System.out.println("\nCabs:");
        List<Cab> cabs = hotelCab.getCabs();
        for (Cab cab : cabs) {
            System.out.println("Car Name: " + cab.getCarName() +
                                ", Car Number: " + cab.getCarNumber() +
                                ", Seater: " + cab.getSeater() +
                                ", Cab Price: " + cab.getCabPrice());
        }
    }

    public List<String> getSources() {
        return Arrays.asList("IGI Airport", "NDLS", "Red Fort", "India Gate", "CP", "Hotel");
    }

    public List<String> getDestinations() {
        return Arrays.asList("IGI Airport", "NDLS", "Red Fort", "India Gate", "CP", "Hotel");
    }

    public List<Cab> getCabs() {
        return Arrays.asList(
            new Cab("Prime Sedan", "MH01AB1234", 4, 150),
            new Cab("Lux", "KA02CD5678", 4, 155),
            new Cab("Prime Play", "DL03EF9012", 4, 160),
            new Cab("Executive", "TN04GH3456", 4, 255),
            new Cab("Lux SUV", "UP05IJ7890", 6, 300)
        );
    }
}

