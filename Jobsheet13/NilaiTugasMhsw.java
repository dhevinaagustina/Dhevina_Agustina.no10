package Jobsheet13;
import java.util.Scanner;
public class NilaiTugasMhsw {
    static int inputNilaiMhs [][] = new int[5][7];
    static String [] namaMhs = new String[5];
    private static final int[][] NilaiMahasiswa = null;

    //fungsi untuk input nilai
    public static int [][] NilaiMahasiswa (){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        inputNilaiMhs = new int[jumlahMahasiswa][];
                                                                                                                                                                                                                        
        System.out.print("Masukkan jumlah tugas per mahasiswa: ");
        int jumlahTugas = input.nextInt();
        namaMhs = new String[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            inputNilaiMhs[i] = new int[jumlahTugas];
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMhs[i] = input.next();
            System.out.println("Masukkan nilai tugas untuk mahasiswa " + namaMhs[i] + ":");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Nilai tugas " + (j + 1) + ": ");
                inputNilaiMhs[i][j] = input.nextInt();
            }
        }
        return NilaiMahasiswa;
    }
    //fungsi untuk menampilkan nilai
    public static void TampilNilaiMahasiswa (){
        System.out.println("Nilai Mahasiswa dalam satu minggu:");
        for (int i = 0; i < namaMhs.length; i++){
            System.out.print(namaMhs[i] + " : ");
            for (int j = 0; j < inputNilaiMhs[i].length; j++){
                System.out.print(inputNilaiMhs[i][j] + " ");
            }
            System.out.println();
        }
    }
    //fungdi untuk menghitung nilai tertinggi
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
    //fungsi untuk menunjukkan nama mahasiswa nilai tertinggi
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
        System.out.println("====================================================================");
        System.out.println("Nilai Tertinggi di raih oleh " + nama +" dengan nilai = " + nilaiTertinggi + " pada minggu ke " + mk );
        System.out.println("====================================================================");
    }

    public static void main(String[] args) {
        NilaiMahasiswa();
        TampilNilaiMahasiswa();

        int nT [] = NilaiTertinggi(inputNilaiMhs);
        int nilaiTertinggi = nT[0];
        int mingguKe = nT[1];

        System.out.println("========================================================");
        System.out.println("Nilai tertinggi mahsiswa minggu ke- " + mingguKe + " senilai " + nilaiTertinggi);
        System.out.println("========================================================");

        NamaMhsNT(namaMhs, inputNilaiMhs);
    }
}
