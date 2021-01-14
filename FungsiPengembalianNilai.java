/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan.Modul;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class FungsiPengembalianNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat scanner
        Scanner input = new Scanner (System.in);
        //deklarasi variabel
        int a, b, c;
        System.out.println("Program Menjumlahkan 2 Nilai");
        //input nilai
        System.out.print("Masukkan nilai a: ");
        a = input.nextInt();
        System.out.print("Masukkan nilai b: ");
        b = input.nextInt();
        System.out.print("Masukkan nilai c: ");
        c = input.nextInt();
        System.out.println("");
        System.out.println("Jumlah a+b: "+(jumlah(a,b)));
        System.out.println("Jumlah b+c: "+(jumlah(b,c)));
        System.out.println("Jumlah a+c: "+(jumlah(a,c)));
    }
    //konstruktor
    private static int jumlah(int a, int b){
        int hasil = a+b;
        return hasil;
    }
}
