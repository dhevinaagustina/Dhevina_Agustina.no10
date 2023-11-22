package Jobsheet13;
import java.util.Scanner;
public class Kubus10 {
    public static int LuasPermukaanKubus(int sisi){
        int Luas = 6*sisi*sisi;
        return Luas;
    }
    public static int VolumeKubus (int sisi){
        int Volume = sisi*sisi*sisi;
        return Volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rusuk,L,V;

        System.out.print("Masukkan panjang rusuk kubus: ");
        rusuk = input.nextInt();

        L = LuasPermukaanKubus(rusuk);
        System.out.println("Luas permukaan kubus= " + L);

        V = VolumeKubus(rusuk);
        System.out.println("Volume kubus= " + V);



    }
}
