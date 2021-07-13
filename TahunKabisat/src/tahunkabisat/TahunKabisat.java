/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tahunkabisat;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class TahunKabisat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a = "Tahun Kabisat";
        String b = "Bukan Tahun Kabisat";
        int tahun;
        
        Scanner input=new Scanner(System.in);
        System.out.print("Masukan Tahun : ");
        tahun=input.nextInt();
        if(tahun % 400 == 0 || tahun % 4 == 0){
            System.out.println("Tahun "+ tahun +" "+a);
        }else if(tahun % 400 != 0 || tahun % 100 == 0){
            System.out.println("Tahun "+ tahun +" "+b);
        }
    }
}
