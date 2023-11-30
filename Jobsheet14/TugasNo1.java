package Jobsheet14;
import java.util.Scanner;
public class TugasNo1 {
    static int deretDescendingRekursif (int n) {
        if (n == 0){
            System.out.println(n);
            return (0);
        }else {
            System.out.print(n + " ");
            return deretDescendingRekursif(n -1);
        }
    }
    static void deretDescendingIterasi (int n){
        for (int i = n ; i <= 0 ; i--){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Masukkan nilai N : ");
        n = input.nextInt();

        deretDescendingRekursif(n);
        deretDescendingRekursif(n);
        System.out.println();

    
    }
}
