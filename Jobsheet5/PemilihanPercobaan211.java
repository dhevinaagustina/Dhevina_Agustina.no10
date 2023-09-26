import java.util.Scanner;
public class PemilihanPercobaan211 {
    public static void main(String[] args) {
        Scanner input11=new Scanner(System.in);

        //DEKLARASI
        Float uas, uts, kuis, tugas, total;

        //INPUT
        System.out.print("Nilai UAS   :");
        uas = input11.nextFloat();
        System.out.print("Nilai UTS   :");
        uts = input11.nextFloat();
        System.out.print("Nilai kuis  :");
        kuis = input11.nextFloat();
        System.out.print("Nilai tugas :");
        tugas = input11.nextFloat();

        //OPERATOR
        total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F)  +(tugas * 0.2F);

        String messege = total < 65 ? " Remidi " : " Tidak remidi ";
        System.out.println(" Nilai akhir = " + total + " sehingga " + messege);

        //OUTPUT
        if (80<total && total<=100){
            System.out.println("Nilai akhir adalah A Setara 4 Kualifikasi Sangat Baik");
        }
        else if (73<total && total<=80){
            System.out.println("Nilai akhir adalah B+ Setara 3,5 Kualifikasi Lebih dari Baik");
        }
        else if (65>total && total<=73){
            System.out.println("Nilai akhir adalah B Setara 3 Kualifikasi Baik");
        }
        else if (60>total && total<=65){
            System.out.println("Nilai akhir adalah C+ Setara 2,5 Kualifikasi Lebih dari Cukup");
        }
        else if (50>total && total<=60){
            System.out.println("Nilai akhir adalah C Setera 2 Kualifikasi Cukup");
        }
        else if (39>total && total<=50){
            System.out.println("Nilai akhir adakah D Setara 1 Kualifikasi Kurang");
        }
        else if (total<=39){
            System.out.println("Nilai akhir adalah E Setara 0 Kualifikasi Gagal");
        }
        else {System.out.println("COBA LAGI");}

        input11.close();
    
    
    
    
    }
    
}
