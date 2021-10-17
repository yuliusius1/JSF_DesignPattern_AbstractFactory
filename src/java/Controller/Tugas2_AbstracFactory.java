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
public class Tugas2_AbstracFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] namaMakanan = {"NasiOpor","NasiLanggi","LontongOpor"};
        int[] jmlMakanan = {5,3,9};
        String[] namaMinuman = {"Teh","Jeruk","Sirup"};
        String[] jnsMinuman = {"Es","Es",""};
        int[] jmlMinuman = {2,3,7};
        String[] namaSambal = {"Terasi","Bawang","Matah"};
        int[] jmlSambal = {2,2,2};
        int totalPesanan = 0;
        System.out.println("-------------------------------------------");
        System.out.println("Anggota Kelompok : \n - (672019014) Yulius \n - (672019152) Juan Raynaldi");
        System.out.println("-------------------------------------------");
        AbstractFactory makanan = FactoryProducer.getFactory("Makanan");
        for(int i=0;i<namaMakanan.length;i++){
            Makanan makanan1 = makanan.getMakanan(namaMakanan[i],jmlMakanan[i]);
            System.out.println(makanan1.getJumlahMakanan() + " " + makanan1.getNamaMakanan()+ " \t\t= Rp." + makanan1.getHargaMakanan());
            totalPesanan += makanan1.getHargaMakanan();
        }
        
        AbstractFactory minuman = FactoryProducer.getFactory("Minuman");
        for(int i=0;i<namaMinuman.length;i++){
            Minuman minuman1 = minuman.getMinuman(namaMinuman[i],jmlMinuman[i]);
            System.out.println(minuman1.getJumlahMinuman()+ " " + minuman1.getNamaMinuman()+ " \t\t= Rp." + minuman1.getHargaMinuman());
            totalPesanan += minuman1.getHargaMinuman();
        }
        
        AbstractFactory sambal = FactoryProducer.getFactory("Sambal");
        for(int i=0;i<namaSambal.length;i++){
            Sambal sambal1 = sambal.getSambal(namaSambal[i],jmlSambal[i]);
            System.out.println(sambal1.getJumlahSambal() + " " + sambal1.getNamaSambal()+ " \t= Rp." + sambal1.getHargaSambal());
            totalPesanan += sambal1.getHargaSambal();
        }
        
        AbstractFactory order = FactoryProducer.getFactory("Order Type");
        OrderType order1 = order.getOrderType("Take Away");
        
        
        System.out.println("-------------------------------------------");
        System.out.println("Total Harga \t\t= Rp." + totalPesanan);
        order1.Status();
        System.out.println("-------------------------------------------");
    }
    
}
