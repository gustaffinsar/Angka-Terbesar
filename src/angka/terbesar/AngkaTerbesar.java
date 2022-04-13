/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angka.terbesar;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class AngkaTerbesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int pertama, kedua, terbesar;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Angka Pertama : ");
        pertama = input.nextInt();
        
        System.out.print("Masukkan Angka Kedua : ");
        kedua = input.nextInt();
        
        if (pertama>kedua){
            terbesar = pertama;
        }else{
            terbesar=kedua;
            
        System.out.println("Angka Terbesar Adalah "+terbesar);
        
        }
    }
    
}
