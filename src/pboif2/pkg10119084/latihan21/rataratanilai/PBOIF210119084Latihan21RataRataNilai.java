/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan21.rataratanilai;
import java.util.Scanner;
/**
 * @author  
 * Nama  : Muhammad Idris Merdefi
 * Kelas : PBOIF2
 * NIM   : 10119084
 * Deskripsi Program : Program ini berisi program untuk menampilkan Program Rata-Rata Nilai
 **/
public class PBOIF210119084Latihan21RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int i, n;
        float jumlah,x, rata;
        System.out.print("Masukkan Banyaknya Mahasiswa :");
        n = masuk.nextInt();
        jumlah = 0;
        i = 1;
        while (i<=n){
            System.out.print("Nilai Mahasiswa ke-"+i+": ");
            x = masuk.nextFloat();
            jumlah += x;
            i++;
            
        }
        rata = jumlah / n;
        System.out.println("Maka,Rata-rata Nilainya adalah : " + rata);
        System.out.println("========================================");
        System.out.println("Developed by Muhammad idris Merdefi");
        
    }
    
}
