/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum.Modul;

/**
 *
 * @author MOKLET-2
 */
public class Praktikum1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=0; i<4; i++){
            System.out.print("@");
        }
        System.out.println("");
        for (int j=0; j<2; j++){
            System.out.print("@");
            for (int a=0; a<2; a++){
                System.out.print(" ");
            }
            System.out.println("@");
        }
        for (int b=0; b<4; b++){
            System.out.print("@");
        }
        System.out.println("");
    }
    
}
