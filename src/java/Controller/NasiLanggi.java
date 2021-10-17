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
public class NasiLanggi implements Makanan{
    private int jumlah;
    private int jumlahMakanan;
    int harga = 13500;
    public NasiLanggi(int i){
        jumlah=i*harga;
        jumlahMakanan = i;
    }
    @Override
    public int getHargaMakanan(){
        return jumlah;
    }
    public String getNamaMakanan(){
        return "Nasi Langgi";
    }
    public int getJumlahMakanan(){
        return jumlahMakanan;
    }
}
