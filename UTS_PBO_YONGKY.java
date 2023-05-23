/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_pbo_yongky;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author C
 */
public class UTS_PBO_YONGKY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nilai = {21,34,12,15,26,32,76,34,54,35};
        String[] namaTeman = {"Yongky", "Febri","Ali","Angga","Ryan","Rahmat"};
        biodata yb = new biodata("Yongky", 21201275, "Malang", 20, 165);


         try {
            FileWriter writer = new FileWriter("file.txt");
            // Tulis array integer
            for (int i = 0; i < nilai.length; i++) {
                writer.write(nilai[i] + " ");
            }
            writer.write("\n");

            // Tulis array nama teman
            for (int i = 0; i < namaTeman.length; i++) {
                writer.write(namaTeman[i] + " ");
            }
            writer.write("\n");

            // Tulis data diri
            writer.write("Nama: " + yb.nama + "\n");
            writer.write("NIM: " + yb.nim + "\n");
            writer.write("Alamat: " + yb.alamat + "\n");
            writer.write("Umur: " + yb.umur + "\n");
            writer.write("Tinggi Badan: " + yb.tinggi + "\n");

            writer.close();
            System.out.println("Data berhasil disimpan dalam file.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan dalam menyimpan data.");
            e.printStackTrace();
        }
         
        
        
    }
    
}
class biodata{
        String nama ;
        int nim ;
        String alamat ;
        int umur ;
        int tinggi ;
        
        public biodata(String nama, int nim, String alamat, int umur, int tinggi) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        this.umur = umur;
        this.tinggi = tinggi;
        }
    }
