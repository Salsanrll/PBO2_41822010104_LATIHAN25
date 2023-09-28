/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo2.pkg41822010104.latihan25;
import java.util.Scanner;
/**
 *
 * @author SALSA NURUL LAELI
 * Nama : Salsa Nurul Laeli
 * NIM  : 41822010104
 */
public class PBO241822010104Latihan25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Format Tugas PBO");
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nama depan Anda untuk di eja: ");
            String nama = input.nextLine();
            
            System.out.println("Ejaan untuk \"" + nama + "\" adalah:");
            
            for (int i = 0; i < nama.length(); i++) {
                char huruf = nama.charAt(i);
                System.out.println("Huruf ke-" + (i + 1) + ":" + huruf);
            }
            System.out.println("\nDeveloped by: Salsa Nurul Laeli");
        }
    }
    
}
