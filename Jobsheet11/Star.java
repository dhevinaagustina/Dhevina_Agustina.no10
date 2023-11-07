package Jobsheet11 ;
import java.util.Scanner;
public class Star {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai N = ");
        int N = input.nextInt();
    
        for (int i = 0; i <= N ; i--){
            System.out.print("*");
        }
        
    }

}


