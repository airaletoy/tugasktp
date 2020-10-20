/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadiahktp;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class HadiahKTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      String Nama, Lahir, Kelamin, Alamat, Darah, Kelurahan, Kecamatan, Agama, Perkawinan, Pekerjaan, Kewarganegaraan;
      int NIK, Rt,Rw;        
      
      System.out.println("Kartu Tanda Penduduk");
      
     
      System.out.print("Nama : ");
      Nama = sc.nextLine();
      System.out.print("Tempat dan tanggal lahir : ");
      Lahir = sc.nextLine();
      System.out.print("Jenis Kelamin : ");
      Kelamin = sc.nextLine();
      System.out.print("Alamat : ");
      Alamat = sc.nextLine();
      System.out.print("Gol Darah : ");
      Darah = sc.nextLine();
      System.out.print("Kelurahan : ");
      Kelurahan = sc.nextLine();
      System.out.print("Kecamatan : ");
      Kecamatan = sc.nextLine();
      System.out.print("Agama : ");
      Agama = sc.nextLine();
      System.out.print("Status Perkawinan : ");
      Perkawinan = sc.nextLine();
      System.out.print("Pekerjaan : ");
      Pekerjaan = sc.nextLine();
      System.out.print("Kewarganegaraan : ");
      Kewarganegaraan = sc.nextLine();
       System.out.print("NIK : ");
      NIK=sc.nextInt();
      System.out.print("Rt : ");
      Rt = sc.nextInt();
      System.out.print("Rw : ");
      Rw = sc.nextInt();
      
      
      System.out.println("*************");
       System.out.println("Nama : " +Nama);
      System.out.println("Tempat tanggal lahir : " +Lahir);
      System.out.println("Jenis Kelamin : " +Kelamin);
      System.out.println("Alamat : " +Alamat);
      System.out.println("Gol Darah : " +Darah);
      System.out.println("Kelurahan : " +Kelurahan);
      System.out.println("Kecamatan : " +Kecamatan);
      System.out.println("Agama : " +Agama);
      System.out.println("Status Perkawinan : " +Perkawinan);
      System.out.println("Pekerjaan : " +Pekerjaan);
      System.out.println("Kewarganegaraan : " +Kewarganegaraan);
      System.out.println("NIK : " +NIK);
      System.out.println("Rt : " +Rt);
        System.out.println("Rw : " +Rw);
    }
    
}
