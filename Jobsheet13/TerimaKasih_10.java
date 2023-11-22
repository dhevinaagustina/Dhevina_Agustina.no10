package Jobsheet13;

public class TerimaKasih_10 {
    public static void UcapanTerimKasih(){
        System.out.println("Thank you for being the best teacher in the world.\n" + "You inspire in me a love for learning and made me feel like I could ask you anything.");
    }
    public static void UcapanTambahan(String ucapan){
        System.out.println(ucapan);
    }

    public static void main(String[] args) {
         UcapanTerimKasih();
         String ucapan = "Terimakasih Pak... Bu... Semoga Sehat Selalu";
         UcapanTambahan(ucapan);
    }
}
