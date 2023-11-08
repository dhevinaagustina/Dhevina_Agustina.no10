package Jobsheet11;
import java.util.Scanner;
public class TugasIndividu2 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       //input nilai N dan nilai N min 5
       System.out.print("Masukkan Nilai N (N minimal 5) = ");
       int N = input.nextInt();
       //ketika nilai N kurang dari 5 program akan memberi peringatan
       while (N < 5){
        System.out.println("NILAI N YANG ANDA MASUKKAN KURANG!!!");
       //input nilai N kembali
        System.out.print("Masukkan Nilai N (N minimal 5)= ");
        N = input.nextInt();
       }//ketika i < N program akan melakukan perulangan
        int i = 0;
        while (i < N){
            //ketika j > i program akan melakukan perulangan ,setelah itu program akan mencetak bintang (*) dan nilai j akan terus berkurang hingga j = N
           int j = N;
            while (j > i){
                System.out.print("*");
                j--;
            }
            System.out.println();
            i++;
        }
        
    }



    
    
}
