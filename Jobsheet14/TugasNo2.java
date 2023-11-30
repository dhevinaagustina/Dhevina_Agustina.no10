package Jobsheet14;

public class TugasNo2 {
    static int penjumlahanRekursif (int f){
        if (f == 1){
            System.out.print(f);
            return 1;
        }else {
            int Hasil = f  + penjumlahanRekursif(f - 1);
            System.out.print(" + " + f);
            return Hasil;
        }
    } 
    public static void main(String[] args) {
        int f = 8;
        System.out.println("Hasil dari penjumlahan " + f + " adalah: ");
        int hasil = penjumlahanRekursif(f);
        System.out.println(" = " + hasil);


    }





}
