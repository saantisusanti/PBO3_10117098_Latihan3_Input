/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan3_input;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Santi Susanti
 * KELAS : PBO3
 * NIM   : 10117098
 */
public class PBO3_10117098_Latihan3_Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Masukkan Nama Anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama Anda Adalah " +nama);        
    }
    
}
