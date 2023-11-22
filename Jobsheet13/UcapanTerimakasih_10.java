package Jobsheet13;
import java.util.Scanner;
public class UcapanTerimakasih_10 {
    public static String PenerimaUcapan(){
        Scanner input = new Scanner(System.in);
        System.out.print("Tulisakan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = input.nextLine();
        return namaOrang;
    }
    public static void UcapanTerimaksih(){
        String nama = PenerimaUcapan();
        System.out.println("Thank You " + nama + " for being the best teacher in the world.\n" + "You inspired in me a love for learning and made me feel like I could ask you anything." );
        System.out.println();
        String ucpn = UcapanTambahan();
        System.out.println("Thank You " + nama + " for being the best teacher in the world.\n" + "You inspired in me a love for learning and made me feel like I could ask you anything." + "\n" + ucpn );
    }
    public static String UcapanTambahan(){
        Scanner input = new Scanner(System.in);
        System.out.print("Tulis ucapan tambahan: ");
        String ucpn = input.nextLine();
        return ucpn;
    }
    public static void main(String[] args) {
        UcapanTerimaksih();
    }
}
