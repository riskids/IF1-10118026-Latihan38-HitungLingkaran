/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitung;

import java.util.Scanner;

/**
  * @author
 * NAMA			: Riski Dwi Sabariyanto
 * KELAS		: IF-1
 * NIM			: 10118026
 * Deksripsi Program : Program ini berisi program untuk menghitung lingkaran
 * dan berbasis objek oriented
 */
public class Lingkaran {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String d;
        double diameter; //operand
        Scanner scanner = new Scanner(System.in);
        Hitung hitung = new Hitung();
        
        System.out.println("=====Perhitungan Lingkaran=====");
        
        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            d = scanner.nextLine();
            System.out.println((!d.matches("[0-9]*"))
                    ?"Nilai Diameter Tidak Sesuai\n":"");

        } while (!d.matches("[0-9]*"));
        
        System.out.println("=====Hasil Perhitungan Lingkaran=====");
        diameter = Double.parseDouble(d); 
        System.out.printf("Jari-jari Lingkaran = %.0f cm %n",hitung.jariLingkaran(diameter));
        System.out.printf("Luas Lingkaran = %.2f cm %n",hitung.luasLingkaran(hitung.jariLingkaran(diameter)));
        System.out.printf("Keliling Lingkaran = %.2f cm %n",hitung.kelilingLingkaran(hitung.jariLingkaran(diameter)));
    }
}
