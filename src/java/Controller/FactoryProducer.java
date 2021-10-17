/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Ini Tylius ad
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Makanan")) {
            return new MakananFactory();
        } else if (choice.equalsIgnoreCase("Minuman")) {
            return new MinumanFactory();
        } else if (choice.equalsIgnoreCase("Sambal")) {
            return new SambalFactory();
        } else if (choice.equalsIgnoreCase("Order Type")) {
            return new OrderTypeFactory();
        }
        return null;
    }
}
