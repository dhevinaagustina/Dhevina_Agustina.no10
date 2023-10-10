import java.util.Scanner;
public class WhileGaji10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int jmlhKaryawan, jmlhJamLembur;
        double gajiLembur=0, totalGajiLembur=0;
        String jabatan;
        System.out.print("Masukkan jumlah karyawan:");
        jmlhKaryawan = scan.nextInt();

        int i = 0;

        while (i < jmlhKaryawan){
            System.out.println("Pilih jabatan-Direktur,Manajer,Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-"  + (i+1)+ ":");
            jabatan = scan.next();
            while(!(jabatan.equalsIgnoreCase("direktur") || jabatan.equalsIgnoreCase("manajer") || jabatan.equalsIgnoreCase("karyawan"))){
                System.out.print("Jabatan yang anda masukkan invalid.Coba lagi:");
                jabatan=scan.next();
            }
            i++;

            System.out.print("Masukkan jumlah jam lembur:");
            jmlhJamLembur = scan. nextInt();
            
            if (jabatan.equalsIgnoreCase("direktur")){
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")){
                gajiLembur = jmlhJamLembur * 100000;
            }else if (jabatan.equalsIgnoreCase("karyawan")){
                gajiLembur = jmlhJamLembur * 75000;
            } else {
                System.out.println("Jabatan invalid");
            }
            totalGajiLembur += gajiLembur;
            }   
            System.out.println("Total gaji lembur: "+ totalGajiLembur);


        scan.close();
        }

    }

