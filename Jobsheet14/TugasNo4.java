package Jobsheet14;
import java.util.Scanner;
public class TugasNo4 {
    public static int hitungPasanganMarmut(int bulan) {
        if (bulan <=1 ) {
            return bulan;
        }else if (bulan == 1 || bulan == 2){
            return 1;
        } else{
            return hitungPasanganMarmut(bulan - 1) + hitungPasanganMarmut(bulan - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 12; i++){
            System.out.print("Masukkan bulan ke-: ");
            int bulan = input.nextInt();

            int pasanganProduktif, pasanganBelumProduktif, jumlahPasangan;

            if (bulan > 1) {
                pasanganProduktif = hitungPasanganMarmut(bulan - 2);
                pasanganBelumProduktif = hitungPasanganMarmut(bulan - 1);
            } else {
                pasanganProduktif = 0;
                pasanganBelumProduktif = 1;
            }

            jumlahPasangan = hitungPasanganMarmut(bulan);
            
            System.out.println("Jumlah pasangan marmut produktif pada bulan ke-" + bulan + " adalah: " + pasanganProduktif);
            System.out.println("Jumlah pasangan marmut belum produktif pada bulan ke-" + bulan + " adalah: " + pasanganBelumProduktif);
            System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulan + " adalah: " + jumlahPasangan);
        }
    }
}