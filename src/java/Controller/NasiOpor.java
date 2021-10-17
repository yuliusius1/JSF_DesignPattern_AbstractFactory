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
public class NasiOpor implements Makanan{
    private int jumlah;
    private int jumlahMakanan;
    int harga = 13000;
    public NasiOpor(int i){
        jumlah=i*harga;
        jumlahMakanan = i;
    }
    @Override
    public int getHargaMakanan(){
        return jumlah;
    }
    public String getNamaMakanan(){
        return "Nasi Opor";
    }
    public int getJumlahMakanan(){
        return jumlahMakanan;
    }
}
