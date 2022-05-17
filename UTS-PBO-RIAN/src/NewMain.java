/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author ESES
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
     Scanner input=new Scanner(System.in);
    
    int gaji_pokok ;
    float thr = 0;
    float masa_kerja;
    
    /*Hiasan*/
    System.out.println("=============================================");
    System.out.println("Identitas Pembuat");
    System.out.println("=============================================");
    System.out.println("Nama   : Yusril Ihza Mahendra");
    System.out.println("NIM    : C1983207019");
    System.out.println("Prodi  : PTI (6)");
    System.out.println("Matkul : Pendidikan Berorientasi Objek");
    System.out.println("Ujian Tengah Semester (UTS)");
    System.out.println("============================================");
    System.out.println("Program Perhitungan Gaji Pokok/THR Sederhana");
    System.out.println("============================================");
    /*Inputan data*/
    System.out.print ("Masukan Gaji Pokok : ");
    gaji_pokok = input.nextInt();
    
    System.out.print ("Masukan Jumlah Bulan Kerja : ");
    Scanner sc = new Scanner(System.in);
    masa_kerja = sc.nextFloat();
        
    /*Pemilihan masa kerja dengan fungsi IF*/
    if (masa_kerja >= 12)
    {
       thr = (float)gaji_pokok;
    }
    else if (masa_kerja <= 12)
    {
       thr = (float)(gaji_pokok / 12) * masa_kerja; 
    } 
    
    /*Menampilkan hasil*/
    System.err.println ("Tunjangan Hari Raya (THR) Yang Didapatkan : Rp."+thr);   
    }
    
}
