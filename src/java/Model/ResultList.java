/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Windows10
 */
public class ResultList {
    private int itemQuantity;
    private String itemName;
    private int itemPrice;
    
    public ResultList(){
    
    }

    public ResultList(int itemQuantity, String itemName, int itemPrice) {
        this.itemQuantity = itemQuantity;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
    
    
}
