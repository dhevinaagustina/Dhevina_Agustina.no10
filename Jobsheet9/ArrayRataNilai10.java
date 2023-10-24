package Jobsheet9;
import java.util.Scanner;
public class ArrayRataNilai10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int jmlMhs;
        double total = 0 ,totalTdkLulus = 0;
        double rata2 , rata2MhsTdkLulus;
        int jmlMhsLulus = 0, jmlMhsTdkLulus = 0;
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        jmlMhs = input.nextInt();
        int [] nilaiMhs = new int [jmlMhs];
        
        for (int i = 0; i < nilaiMhs.length;i++){
            System.out.print("Masukkan Nilai Mahasiswa ke- " + (i+1) + ":");
            nilaiMhs[i] = input.nextInt();
        }
        
        for (int i = 0; i < nilaiMhs.length; i++){
            if (nilaiMhs [i] > 70){
                System.out.println("Mahasiaswa ke- " + (i+1) + " Lulus!");
                total += nilaiMhs [i];
                jmlMhsLulus++;
            }
            else {
                System.out.println("Mahasiswa ke- " + (i+1) + " Tidak Lulus!");
                totalTdkLulus += nilaiMhs [i];
                jmlMhsTdkLulus++;
            }
        }
        rata2 = total/jmlMhsLulus;
        System.out.println("Rata-rata Nilai Mahasiswa yg Lulus = " + rata2);
        rata2MhsTdkLulus = totalTdkLulus/jmlMhsTdkLulus;
        System.out.println("Rata-rata Nilai Mahasiswa yg Tidak Lulus = " + rata2MhsTdkLulus);

        
    }
}