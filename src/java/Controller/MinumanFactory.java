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
public class MinumanFactory extends AbstractFactory{
    @Override
    public Makanan getMakanan(String namaMakanan, int jumlahMakanan) {
        
        return null;
    }
    @Override
    Minuman getMinuman(String namaMinuman,int jumlahMinuman) {
        if (namaMinuman == null) {
            return null;
        }
        if (namaMinuman.equalsIgnoreCase("Teh")) {
            return new Teh(jumlahMinuman);
        } else if (namaMinuman.equalsIgnoreCase("Jeruk")) {
            return new Jeruk(jumlahMinuman);
        } else if (namaMinuman.equalsIgnoreCase("Sirup")) {
            return new Sirup(jumlahMinuman);
        }
        return null;
    }
    
    @Override
    Sambal getSambal(String namaSambal, int jumlahSambal) {
        
        return null;
    }
    
    @Override
    OrderType getOrderType (String OrderTypeName){
        
        return null;
    }
}
