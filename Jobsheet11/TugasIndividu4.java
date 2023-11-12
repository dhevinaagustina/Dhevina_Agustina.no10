package Jobsheet11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class TugasIndividu4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] atlet = new String[4][5];
        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voly"};
        int i = 0;
        while (i < 4){
            System.out.print("Masukkan Nama Atlet " + cabangOlahraga[i] + ": " );
            System.out.println();
            int j = 0;
            while (j < 5){
                System.out.print("Atlet " + (j + 1) + ": ");
                String nama =input.nextLine();
                atlet[i][j] = nama;
                j++;
            }
        i++;
        System.out.println();
        }
        for ( i = 0; i < 4; i++) {
            ArrayList<String> namaAtlet = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                namaAtlet.add(atlet[i][j]);
            }
            Collections.sort(namaAtlet);
            for (int j = 0; j < 5; j++) {
                atlet[i][j] = namaAtlet.get(j);
            }
        }
        for (i = 0; i < 4; i++) {
            System.out.println("Atlet " + cabangOlahraga[i] + ":");
            for (int j = 0; j < 5; j++) {
                System.out.println(atlet[i][j]);
            }
        System.out.println();
        }

        
        
        
    }
}
