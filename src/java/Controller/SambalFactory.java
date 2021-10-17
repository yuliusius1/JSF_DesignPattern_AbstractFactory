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
public class SambalFactory extends AbstractFactory{
    @Override
    public Makanan getMakanan(String namaMakanan, int jumlahMakanan) {
        
        return null;
    }
    
    @Override
    Minuman getMinuman(String namaMinuman, int jumlahMinuman) {
        
        return null;
    }
    
    @Override
    Sambal getSambal(String namaSambal, int jumlahSambal) {
        if (namaSambal == null) {
            return null;
        }
        if (namaSambal.equalsIgnoreCase("Terasi")) {
            return new SambalTerasi(jumlahSambal);
        } else if (namaSambal.equalsIgnoreCase("Bawang")) {
            return new SambalBawang(jumlahSambal);
        } else if (namaSambal.equalsIgnoreCase("Matah")) {
            return new SambalMatah(jumlahSambal);
        }
        return null;
    }
    
    @Override
    OrderType getOrderType (String OrderTypeName){
        
        return null;
    }
}
