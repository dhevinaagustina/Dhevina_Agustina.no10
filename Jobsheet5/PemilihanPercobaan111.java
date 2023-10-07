import java.util.Scanner;
public class PemilihanPercobaan111 {
   public static void main(String[] args) {

    //SCANNER
      Scanner input11=new Scanner(System.in);

    //INPUT
      int angka;
      System.out.print("Masukkan angka: ");
      angka=input11.nextInt();

    //OUTPUT
      String hasil= angka % 2 == 0 ? "Bilangan genap" : "Bilangan ganjil";
      System.out.print(hasil);


      input11.close();
      


   }
    
}
  

