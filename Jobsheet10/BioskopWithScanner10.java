package Jobsheet10;
import java.util.Scanner;
public class BioskopWithScanner10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        boolean exit = false;

        String[][] penonton = new String[4][2];

        while (! exit) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton: ");
            System.out.println("2. Tampilkan daftar penonton: ");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
        
            int pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = input.next();
                    System.out.print("Masukkan baris: ");
                    baris = input.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = input.nextInt();
                    input.nextLine();
                    if (baris > penonton.length || baris < 1 || kolom > penonton[0].length || kolom < 1) {
                        System.out.println("Nomor baris/kolom kursi tidak tersedia!");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                    }
                    break;
                case 2:
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            System.out.print(penonton[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    exit = true;
                    System.out.println("Terimakasih");
                    //System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan menu salah!");
                    break;
            }
        }

          //  System.out.print("Input penonton lainnya? (y/t): ");
           // next = input.nextLine();

            // if (next.equalsIgnoreCase("t")){
              //  break;
            }
        }
       
    

