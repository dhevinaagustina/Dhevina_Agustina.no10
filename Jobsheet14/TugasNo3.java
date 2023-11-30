package Jobsheet14;
import java.util.Scanner;
public class TugasNo3 {
    static boolean cekPrimaRekursif (int n, int pembagi){
        if ( n == 2){
            return true;
        }else if ( n <= 1){
            return false;
        }else if (n % pembagi == 0){
            return false;
        }else if (pembagi * pembagi > n){
            return true;
        }else {
            return cekPrimaRekursif(n, pembagi + 1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan;
        System.out.print("Masukkan bilangan yang akan diperiksa: ");
        bilangan = input.nextInt();

        if (cekPrimaRekursif(bilangan, 2)){
            System.out.println(bilangan + ", "  + " bilangan tersebut adalah bilangan prima");
        } else {
            System.out.println(bilangan + ", " + " bilangan tersebut bukan bilangan prima");
        }
    }
}
