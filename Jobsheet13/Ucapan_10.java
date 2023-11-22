package Jobsheet13;
import java.util.Scanner;
public class Ucapan_10 {
    public static String PenerimaUcapan(){
        Scanner input = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang anda beri ucapan: ");
        String namaOrang = input.nextLine();
        System.out.println(namaOrang);
        input.close();
        return namaOrang;
    }
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + "\nMay the force be with you.");
    }
    
}
