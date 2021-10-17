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
public class SambalMatah implements Sambal{
    private int jumlah,jumlahSambal;
    int harga = 3000;
    public SambalMatah(int i){
        jumlah=i*harga;
        jumlahSambal = i;
    }
    @Override
    public int getHargaSambal(){
        return jumlah;
    }
    public String getNamaSambal(){
        return "Sambal Matah  ";
    }
    public int getJumlahSambal(){
        return jumlahSambal;
    }
}
