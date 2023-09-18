import java.util.Scanner;

public class HargaBayar11 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        int harga, jumlah, jmlHalaman;
        double dis=0.1, total, bayar, jmlDis, besaranDis;
        String merkBuku;
        
        System.out.print("Masukkan harga barang yang dibeli: ");
        harga=sc.nextInt();
        System.out.print("Masukkan jumlah-jumlah barang yang akan dibeli: ");
        jumlah=sc.nextInt();
        System.out.println("Masukkan merk buku yang anda pilih: ");
        merkBuku=sc.next();
        System.out.print("Masukkan jumlah halaman buku: ");
        jmlHalaman=sc.nextInt();



        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);

    }
}