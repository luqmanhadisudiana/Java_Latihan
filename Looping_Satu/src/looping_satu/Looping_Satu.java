/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping_satu;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Looping_Satu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float a,b;
        int n = 0;
        boolean x = true, y = false;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Berapa Kali Perulangan : ");
        n = scan.nextInt();
        for (int j = 0; j <= n; j++){
           if(j != n){
               System.out.println("Masukan berat belanja di kedua kantong : ");
               System.out.print("A : ");
               a = scan.nextFloat();
               System.out.print("B : ");
               b = scan.nextFloat();
               System.out.println("");
            }else if (j == n){
               System.out.println("Proses selesai. ");   
            } 
           System.out.println("");
           System.out.println("");
           
        }
        n = scan.nextInt();
        for(int i = 0; i <= n; i++){
            if(i != n){
                System.out.println("Masukan berat belanja di kedua kantong : ");
                System.out.print("A : ");
                a = scan.nextFloat();
                System.out.print("B : ");
                b = scan.nextFloat();
                System.out.println("");
                if(a - b == 9 || b - a == 9){
                    System.out.println("Motor oleng" + x);
                } else if(a + b >= 150){
                    System.out.println("Motor oleng" + y);
                }
                System.out.println("Motor oleng : " + x);
                System.out.println("Motor oleng : " + y);
            }else if (i == n){
                System.out.println("Proses selesai. ");
            }           
       }
    }
}    
