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
public class MakananFactory extends AbstractFactory{
    @Override
    public Makanan getMakanan(String namaMakanan, int jumlahMakanan) {
        if (namaMakanan == null) {
            return null;
        }
        if (namaMakanan.equalsIgnoreCase("NasiOpor")) {
            return new NasiOpor(jumlahMakanan);
        } else if (namaMakanan.equalsIgnoreCase("LontongOpor")) {
            return new LontongOpor(jumlahMakanan);
        } else if (namaMakanan.equalsIgnoreCase("NasiLanggi")) {
            return new NasiLanggi(jumlahMakanan);
        }
        return null;
    }
    @Override
    Minuman getMinuman(String namaMinuman ,int jumlahMinuman) {
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
