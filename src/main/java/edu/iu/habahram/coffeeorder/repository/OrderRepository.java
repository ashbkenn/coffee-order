package edu.iu.habahram.coffeeorder.repository;

import edu.iu.habahram.coffeeorder.model.*;
import org.springframework.stereotype.Repository;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@Repository
public class OrderRepository {

    private static int receiptIdCounter = 1;
    public Receipt add(OrderData order) throws Exception {
        Beverage beverage = null;
        switch (order.beverage().toLowerCase()) {
            case "dark roast":
                beverage = new DarkRoast();
                break;
            case "house blend":
                beverage = new HouseBlend();
                break;
            case "espresso":
                beverage = new Espresso();
                break;
            case "decaf":
                beverage = new Decaf();
                break;
        }
        if (beverage == null) {
            throw new Exception("Beverage type '%s' is not valid!".formatted(order.beverage()));
        }
        for(String condiment : order.condiments()) {
            switch (condiment.toLowerCase()) {
                case "milk":
                   beverage = new Milk(beverage);
                   break;
                case "mocha":
                    beverage = new Mocha(beverage);
                    break;
                case "whip":
                    beverage = new Whip(beverage);
                    break;
                case "soy":
                    beverage = new Soy(beverage);
                    break;
                default:
                    throw new Exception("Condiment type '%s' is not valid".formatted(condiment));
            }
        }
        int receiptId = generateUniqueId();

        Receipt receipt = new Receipt(receiptId, beverage.getDescription(), beverage.cost());
        storeOrderInFile(receipt);
        return receipt;
    }

    private synchronized int generateUniqueId() {
        return receiptIdCounter++;
    }
    private void storeOrderInFile(Receipt receipt) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("db.txt", true))) {
            String line = String.format("%d, %.2f, %s%n", receipt.id(), receipt.cost(), receipt.description());
            writer.write(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
