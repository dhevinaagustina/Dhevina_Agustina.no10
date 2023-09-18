import java.util.Scanner;
public class Gaji11{
    public static void main(String[] args) {
        
    Scanner sc =new Scanner(System.in);
    int jmlMasuk, jmlTdkMasuk, totgaji;
    int gaji=40000, potGaji=25000;

    System.out.print("Masukkan Jumlah Hari Masuk Kerja Anda: ");
    jmlMasuk=sc.nextInt();

    System.out.print("Masukkan Jumlah Hari Tidak Masuk Kerja Anda: ");
    jmlTdkMasuk=sc.nextInt();

    totgaji=(jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);
    System.out.println("Total gaji:  " +totgaji );
    
    }
}

    

