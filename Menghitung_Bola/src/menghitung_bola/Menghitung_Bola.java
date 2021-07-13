/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitung_bola;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Menghitung_Bola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double k, r, phi = 3.14;
        double l, v;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan panjang jari-jari lingkaran: ");
    r = scan.nextDouble();
    k = 2 * phi * r;
    l = 4 * phi * r*r;
    v = (4 * phi * r*r*r)/3;
    
    System.out.println("Keliling Lingkaran adalah " + String.format("%.2f", k));
    System.out.println("Luas Lingkaran adalah " + String.format("%.2f", l));
    System.out.println("Volume Lingkaran adalah " + String.format("%.2f", v));
    }  
}
