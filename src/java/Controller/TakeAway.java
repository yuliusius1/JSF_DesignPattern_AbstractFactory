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
public class TakeAway implements OrderType{
    @Override
    public void Status() {
        System.out.println("Orderan ini merupakan Bungkus (Take Away)");
    }
}
