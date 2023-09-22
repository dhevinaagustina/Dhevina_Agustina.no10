import java.util.Scanner;
public class Gaji11{
    public static void main(String[] args) {

    //Deklarasi
    Scanner sc =new Scanner(System.in);
    int jmlMasuk, jmlTdkMasuk, totGaji;
    int gaji , potGaji;

    //Input
    System.out.print("Masukkan Jumlah Hari Masuk Kerja Anda: ");
    jmlMasuk=sc.nextInt();

    System.out.print("Masukkan Jumlah Hari Tidak Masuk Kerja Anda: ");
    jmlTdkMasuk=sc.nextInt();

    System.out.println("Besaran Gaji:");
    gaji=sc.nextInt();

    System.out.println("Potongan Gaji: ");
    potGaji=sc.nextInt();

    //Operator
    totGaji=(jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);

    //Output
    System.out.println("Gaji yang anda terima adalah:  " +totGaji );
    sc.close();
    }
}

    

