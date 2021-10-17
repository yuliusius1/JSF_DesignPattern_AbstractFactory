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
public class SambalBawang implements Sambal{
    private int jumlah,jumlahSambal;
    int harga = 2500;
    public SambalBawang(int i){
        jumlah=i*harga;
        jumlahSambal = i;
    }
    @Override
    public int getHargaSambal(){
        return jumlah;
    }
    public String getNamaSambal(){
        return "Sambal Bawang";
    }
    public int getJumlahSambal(){
        return jumlahSambal;
    }
}
