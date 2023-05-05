package org.example;

import com.google.gson.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        try
        {
            Customer custs[] = {new Customer("Joe", "Oakes", "oja5195@psu.edu", "PA", "2677095093"),
                    new Customer("Jim", "Oakes", "oja5195@psu.edu", "PA", "2677095093"),
                    new Customer("John", "Oakes", "oja5195@psu.edu", "PA", "2677095093")};

            try (FileWriter writer = new FileWriter("Customer.json")){
                writer.write(new Gson().toJson(custs));
            }

            Customer[] cust2 = new Gson().fromJson(new FileReader("Customer.json"), Customer[].class);
            for (Customer cut : cust2){
                System.out.println(" ");
                System.out.println("Name: " + cut.getFirstName() + " " + cut.getLastName());
                System.out.println("Phone: " + cut.getPhoneNumber());
                System.out.println("Email: " + cut.getEmail());
                System.out.println("State: " + cut.getAddress());
            }
        }catch(Exception e){

        }
    }
}
