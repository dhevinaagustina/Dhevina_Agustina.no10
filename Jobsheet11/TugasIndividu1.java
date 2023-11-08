package Jobsheet11;
import java.util.Scanner;
public class TugasIndividu1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input nilai N dan nilai N minimal 3
        int N;
        do{
        System.out.print("Masukkan Nilai N (Nilai N minimal 3) = ");
        N = input.nextInt();
            //ketika nilai N < 3 program akan memanpilkan peringatan dan akan mengulang pada do
             if (N < 3){
            System.out.println("Masukkan Nilai N kembali!");
        }
        } while (N < 3);
        //ketika i <= N program akan melakukan perulangan untuk mengeksekusi program didalamnya 
        int i = 1;
        while (i <= N){
            //ketika j >= i program akan mengeprint jarak dan nilai j akan terus berkurang
            int j = N;
            while (j >= i){
                System.out.print(" ");
                j--;
            }
            //ketika k <= i proram akan mengeprint nilai k dan nilai k akan terus bertambah
            int k = 1;
            while (k <= i) {
                System.out.print(k);
                k++;
            }
            System.out.println();
            i++;
        }   

        }  
   
    }

