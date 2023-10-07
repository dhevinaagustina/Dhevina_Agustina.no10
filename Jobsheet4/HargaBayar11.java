import java.util.Scanner;

public class HargaBayar11 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        //Deklarasi
        int harga, jumlah, jmlHalaman;
        double dis=0.1, total, bayar, jmlDis;
        String merkBuku;
        
        //Input
        System.out.print("Masukkan harga barang yang dibeli\t\t:" +"Rp.");
        harga=sc.nextInt();
        System.out.print("Masukkan jumlah-jumlah barang yang akan dibeli\t:");
        jumlah=sc.nextInt();
        System.out.print("Masukkan merk buku yang anda pilih\t\t:");
        merkBuku=sc.next();
        System.out.print("Masukkan jumlah halaman buku\t\t\t:");
        jmlHalaman=sc.nextInt();
        System.out.print("Masukkan diskon yang anda dapat (Desimal)\t:");
        dis = sc.nextDouble();
    

        //Operator
        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        //Output
        System.out.println("Jumlah halaman buku adalah\t\t\t:" + jmlHalaman);
        System.out.println("Merk Buku\t\t\t\t\t:" + merkBuku);
        System.out.println("Diskon yang anda dapatkan adalah\t\t:" +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah\t\t:" +bayar);

        sc.close();
    }
}