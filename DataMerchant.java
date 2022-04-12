package com.company;
import java.util.*;
public class DataMerchant {
    static Scanner input = new Scanner(System.in);
    static Merchant merchants[] = new Merchant[0];

    public static Merchant[] tambahMerchant(Merchant merchant){
        Merchant[] mrch = new Merchant[DataMerchant.merchants.length + 1];
        for (int i = 0; i < DataMerchant.merchants.length; i++){
            mrch[i] = merchants[i];
        }
        mrch[DataMerchant.merchants.length] = merchant;
        return mrch;
    }
    public static void tampilData(){
        for (Merchant merchant1 : DataMerchant.merchants) {
            System.out.println("====Tampilan Data Merchant UBFood====");
            System.out.println("Nama Merchant   : "+ merchant1.getNamaMerchant());
            System.out.println("Nama Produk     : "+ merchant1.getNamaProduk());
            System.out.println("Harga           : "+ (int)merchant1.getHargaMakanan());
        }
    }
    public static Merchant cariMerchant(String nama){
        int m = 0;
        for (int i = 0; i < DataMerchant.merchants.length; i++){
            if (DataMerchant.merchants[i].getNamaMerchant().equals(nama)){
                m = i;
                break;
            }
        }
        return merchants[m];
    }
    public static void tampilMerchant(Merchant merchant2){
        System.out.println("=== Tampilan Data Merchant UBFood ===");
        System.out.println("Nama Merchant   : " + merchant2.getNamaMerchant());
        System.out.println("Nama Produk     : " + merchant2.getNamaProduk());
        System.out.println("Harga           : " + (int) merchant2.getHargaMakanan());
    }
    public static void updateMerchant(Merchant merchant3, String namaMerchant, String produk, double harga){
        merchant3.setNamaMerchant(namaMerchant);
        merchant3.setNamaProduk(produk);
        merchant3.setHargaMakanan(harga);
    }
}

//Nama      : Prayoga Dwi Purwono
//Kelas     : TI-E
//NIM       : 215150707111021