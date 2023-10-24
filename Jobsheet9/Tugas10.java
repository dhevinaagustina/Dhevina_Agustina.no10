package Jobsheet9;
import java.util.Scanner;
public class Tugas10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int jmlElemen;
        System.out.print("Masukkan jumlah elemen: ");
        jmlElemen = input.nextInt();
        int [] nilai = new int [jmlElemen];

        int totalNilai = 0;
        for ( int i = 0; i < jmlElemen; i++){
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
            nilai [i] = input.nextInt();
            totalNilai += nilai [i];
        }
        
        int nilaiMax = nilai[0];
        for ( int i = 0; i < jmlElemen; i++){
            if (nilaiMax < nilai [i]){
                nilaiMax = nilai [i];
            }
        }
        
        int nilaiMin = nilai [0];
        for ( int i = 0; i < jmlElemen; i++){
            if (nilaiMin > nilai [i]){
                nilaiMin = nilai [i];
            }
        }
        
        float rata2;
        rata2 = totalNilai/jmlElemen;
        
        System.out.println("Nilai Maximal adalah: " + nilaiMax);
        System.out.println("Nilai Minimal adalah: " + nilaiMin);
        System.out.println("Total nilai: " + totalNilai);
        System.out.println("Rata rata nilai adalah: " + rata2);
        



    }
}
