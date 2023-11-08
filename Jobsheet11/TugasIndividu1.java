package Jobsheet11;
import java.util.Scanner;
public class TugasIndividu1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        do{
        System.out.print("Masukkan Nilai N (Nilai N minimal 3) = ");
        N = input.nextInt();
             if (N < 3){
            System.out.println("Masukkan Nilai N kembali!");
        }
        } while (N<3);
            int i =1;
            while (i<=N){
                int j=N;
                while (j>=i){
                    System.out.print(" ");
                    j--;
                }
            int k=1;
            while (k<=i) {
                System.out.print(k);
                k++;
            }
            System.out.println();
            i++;
            }   

        }  
   
    }

