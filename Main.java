package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataMerchant.merchants = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merchants = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merchants = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 8000));
        DataMerchant.tampilData();
        DataMerchant.merchants = DataMerchant.tambahMerchant(new Merchant(DataMerchant.input.nextLine(), DataMerchant.input.nextLine(), DataMerchant.input.nextDouble()));
        DataMerchant.tampilData();
    }
}

//Nama      : Prayoga Dwi Purwono
//Kelas     : TI-E
//NIM       : 215150707111021


