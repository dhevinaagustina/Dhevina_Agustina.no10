import java.util.Scanner;

public class Lingkaran11 {

    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);

        //Deklarasi
        int r;
        double keliling, luas, phi=3.14;

        //Input
        System.out.print("Masukkan jari-jari lingkaran\t:");
        r=sc.nextInt();

        //Operator
        keliling= 2*phi*r;
        luas= phi*r*r;

        //Output
        System.out.print("Keliling lingkaran adalah\t:");
        System.out.println(keliling);
        
        System.out.print("Luas lingkaran adalah\t\t:");
        System.out.println(luas);







        sc.close();
    }
}
