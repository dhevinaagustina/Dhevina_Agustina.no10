package Jobsheet9;
import java.util.Scanner;
public class LinearSearch10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int jmlElemenArray;
        int key;
        int hasil = 0;
        
        System.out.print("Masukkan jumlah Elemen Array: ");
        jmlElemenArray = input.nextInt();
        int [] arrayInt = new int [jmlElemenArray];
        
        for (int i = 0; i < jmlElemenArray; i++){
            System.out.print("Masukkan jumlah Elemen Array ke- " + i + ": ");
            arrayInt [i] = input.nextInt();
            }

        System.out.print("Masukkan Key yang anda cari: ");    
        key = input.nextInt();

        for (int i = 0; i < jmlElemenArray ; i++){
            if (key == arrayInt [i]){
                System.out.println("Key berada di posisi Indeks ke- " + i);
                break;
            }
            else {
                System.out.println("KEY TIDAK DITEMUKAN");
                break;
            }


        }


           
           
           
            

        }

    
        
    }
    

