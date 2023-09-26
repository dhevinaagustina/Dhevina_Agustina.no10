import java.util.Scanner;
public class PemilihanPercobaan311 {
    public static void main(String[] args) {
        Scanner input11=new Scanner(System.in);

        //DEKLARASI
        double angka1, angka2, hasil;
        char operator;
    
        //INPUT
        System.out.println("KALKULATOR: ");
        System.out.print("Masukkan angka pertama: ");
        angka1 = input11.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        angka2 = input11.nextDouble();
        System.out.print("Masukkan operator (+ - * /): ");
        operator = input11.next().charAt(0);


        //OUTPUT
        switch (operator){
          case '+':
            hasil = angka1 + angka2;
            System.out.println(angka1 + "+" + angka2 + "=" + hasil);
            break;
          case '-':
            hasil = angka1 - angka2;
            System.out.println(angka1 + "-" + angka2 + "=" + hasil);
            break;
          case '*':
            hasil = angka1 * angka2;
            System.out.println(angka1 + "*" + angka2 + "=" + hasil);
            break;
          case '/':
            hasil = angka1 / angka2;
            System.out.println(angka1 + "/" + angka2 + "=" + hasil);
            break;

          default:
            System.out.println("ERROR");
          
            
        }
        input11.close();
    }
}
