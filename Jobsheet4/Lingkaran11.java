import java.util.Scanner;

public class Lingkaran11 {

    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);

        int r;
        double keliling, luas;

        System.out.print("Masukkan jari-jari lingkaran: ");
        r=sc.nextInt();

        keliling= 2*3.14*r;
        luas= 3.14*r*r;

        System.out.print("Keliling lingkaran adalah:");
        System.out.println(keliling);
        
        System.out.print("Luas lingkaran adalah:");
        System.out.println(luas);








    }
}