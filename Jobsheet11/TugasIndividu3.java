package Jobsheet11;
import java.util.Scanner;
public class TugasIndividu3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input nilai N dan nilai N minimal 3
        System.out.print("Masukkan Nilai N (Nilai N Minimal 3) = ");
        int N = input.nextInt();
        //ketika nilai N < 3 program akan menampilkan peringatan
        while (N < 3){
            System.out.println("NILAI N YANG ANDA MASUKKAN KURANG!!!");
            //inputkan kembali
            System.out.print("Masukkan Nilai N (Nilai N Minimal 3) = ");
            N = input.nextInt();  
        }
        //ketika i <= N prograam akan melakukan perulangan dan nilai i akan terus bertambah
        int i = 1;
        while(i <= N){
            //ketika j <= N program akan mengulang,j akan terus bertambah dan ketika i = 1 atau i = N atau j = 1 atau j = N program akan mencetak N + spasi.
            int j = 1;
            while (j <= N){
                if (i == 1 || i == N ||j == 1 || j == N){
                    System.out.print(N + " ");
                }//selain pada if diatas program hanya akan mencetak spasi 
                else{
                    System.out.print("  ");
                }
            j++;
            }
        i++;
        System.out.println();    
        }








    }
    
}
