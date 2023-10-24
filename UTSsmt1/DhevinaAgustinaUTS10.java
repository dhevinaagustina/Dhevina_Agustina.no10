package UTSsmt1;
import java.util.Scanner;
public class DhevinaAgustinaUTS10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;
        double nilaiTesBahasaInggris = 30.00,nilaiTesAkademik = 50.00, nilaiTesWawancara = 20.00;
        double nilaiAkhir;
        String sistemInformasi , ilmuKomputer, bisnisManajemen , teknikInformatika;
        String jurusan;
     
        System.out.print("Masukan nilai tes bahasa inggris 0 - 100 :");
        nilaiTesBahasaInggris = input.nextInt();
        System.out.print("Masukkan nilai tes akademik  0 - 100 :");
        nilaiTesAkademik = input.nextInt();
        System.out.print("Masukkan nilai tes wawancara  0 - 100 :");
        nilaiTesWawancara = input.nextInt();
        nilaiAkhir = (float) nilaiTesBahasaInggris + nilaiTesAkademik + nilaiTesWawancara;
        System.out.println("Nilai akhir: " + nilaiAkhir);

        System.out.println("1.Sistem Informasi\n2.Ilmu Komputer\n3.Bisnis Manajemen\n4.Teknik Informatika");
        System.out.println("Pilih jurusan yang anda inginkan: ");
        jurusan = input.next();

        
            
        
           
         
        
          }
        }


      

        


    




    

    

