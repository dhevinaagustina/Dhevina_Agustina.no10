package Jobsheet13;
import java.util.Scanner;
public class NilaiTugasMhsw {
    public static int [][] NilaiMahasiswa (){
        Scanner input = new Scanner(System.in);
        int NilaiMahasiswa [][] = {
            {20,19,25,20,10,0,10},
            {30,30,40,10,15,20,25},
            {5,0,20,25,10,5,45},
            {50,0,7,8,0,30,60},
            {15,10,16,15,10,10,5},
        };
        return NilaiMahasiswa;
    }
    public static void TampilNilaiMahasiswa (String [] namaMhs, int [][] nilaiMhs){
        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.println("======");
            System.out.println(namaMhs[i]);
            System.out.println("======");
            for (int j = 0; j < nilaiMhs[i].length; j++){
                System.out.println("Nilai minggu ke- " + (j+1) + " adalah " + nilaiMhs[i][j]);
            }
        }
    }
    public static int [] NilaiTertinggi (int [][] nilaiMhs){
        int mingguKe = 0;
        int nilaiTertinggi = 0;
        
        for (int i = 0; i < nilaiMhs[0].length; i++){
            int jumlah = 0;
            for (int j = 0; j < nilaiMhs.length; j++){
                jumlah += nilaiMhs[j][i];
                if (nilaiTertinggi < jumlah){
                    nilaiTertinggi = jumlah;
                    mingguKe = i + 1;
                }
            }

        }
        int [] mK = {nilaiTertinggi,mingguKe};
        return mK;
    }
    public static void NamaMhsNT (String [] namaMhs, int [][] nilaiMhs){
        int nilaiTertinggi = nilaiMhs[0][0];
        int mk = 0;
        String nama = " ";
        for (int i = 0; i < nilaiMhs.length; i++){
            for (int j = 0; j < nilaiMhs[i].length; j++){
                if (nilaiTertinggi < nilaiMhs [i][j]){
                    nilaiTertinggi = nilaiMhs[i][j];
                    mk = j + 1;
                    nama = namaMhs[i];
                }
            }

        }
        System.out.println("Nilai Tertinggi di raih oleh " + nama +" dengan nilai = " + nilaiTertinggi + " pada minggu ke " + mk );
    }

    public static void main(String[] args) {
        String [] namaMhs = {"Sari","Rina","Yani","Dwi","Lusi"};
        int [][] nilaiMhs = NilaiMahasiswa();

        TampilNilaiMahasiswa(namaMhs, nilaiMhs);
        
        int nT [] = NilaiTertinggi(nilaiMhs);
        int nilaiTertinggi = nT[0];
        int mingguKe = nT[1];

        System.out.println("========================================================");
        System.out.println("Nilai tertinggi mahsiswa minggu ke- " + mingguKe + " senilai " + nilaiTertinggi);
        System.out.println("========================================================");

        NamaMhsNT(namaMhs,nilaiMhs);
    }
}
