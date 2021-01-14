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
public class FungsiRekursif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat scanner
        Scanner input = new Scanner (System.in);
        //deklarasi variabel
        int bil, hasil;
        //input bilangan
        System.out.print("Masukkan suatu bilangan: ");
        bil = input.nextInt();
        hasil = faktorial(bil);
        System.out.println("Nilai faktorial "+bil+" adalah "+hasil);
    }
    private static int faktorial(int a){
        if (a==1){
            return 1;
        }else
            return (a*faktorial(a-1));
    }
}
