/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitung_suhu;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Menghitung_Suhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double celcius = 0, farenheit = 0, kelvin = 0, reamur = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Suhu Celcius : ");
        celcius = scan.nextDouble();
        reamur = celcius * 4/5;
        kelvin = (farenheit + 459.67)*5/9;
        farenheit = (celcius * 9/5) + 32 ;
        System.out.println("Suhu Reamur : " + reamur);
        System.out.println("Suhu Kelvin : " + kelvin);
        System.out.println("Suhu Farenheit : " + farenheit);
        System.out.println("");
        
        System.out.print("Masukan Suhu Farenheit : ");
        reamur = scan.nextDouble();
        celcius =(farenheit - 32)* 5/9;
        kelvin = (farenheit + 459.67)*5/9;
        System.out.println("Suhu Reamur : " + celcius);
        System.out.println("Suhu Kelvin : " + kelvin);
        System.out.println("");
        
        System.out.print("Masukan Suhu Kelvin : ");
        kelvin = scan.nextDouble();
        celcius =(farenheit - 32)* 5/9;
        reamur = celcius * 4/5;
        System.out.println("Suhu Farenheit : " + celcius);
        System.out.println("Suhu Reamur : " + reamur);
        System.out.println("");
       
    }
    
}
