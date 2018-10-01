/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latihan17.programtunjangan;
import java.util.Scanner;
/**
 *
 * @author lenovo
 * 
 * NAMA  : AldiLesmana
 * KELAS : IF-3
 * NIM   : 10117108
 * Deskripsi Program : Program ini di buat untuk menghitung tunjangan gaji dari
 *                     karyawan jika ia sudah menikah
 * 
 */
public class PBO310117122Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String statusMenikah;
        double gajiPokok, totalGaji, tunjangan;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--------Program Tunjangan------------");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp ");
        gajiPokok = scanner.nextDouble();
        System.out.print("Status Anda? (menikah/belum)\t: ");
        statusMenikah = scanner.next();
        
        tunjangan = (statusMenikah.equals("menikah"))? 0.35 * gajiPokok : 0;
        totalGaji = tunjangan + gajiPokok;
        
        System.out.println("=====Hasil Perhitungan Gaji Anda=====");
        System.out.println("Gaji Pokok  : Rp " + gajiPokok);
        System.out.println("Tunjangan   : RP " + tunjangan);
        System.out.println("Total Gaji  : Rp " + totalGaji);
        System.out.println("(Developed by : Aldi Lesmana)");
        
    }
    
}
