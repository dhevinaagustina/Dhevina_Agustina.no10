import java.util.Scanner;
public class WhileKelipatan10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i=1,kelipatan,total=0,counter=0;
        System.out.println("Masukkan bilangan kelipatan(1-9): ");
        kelipatan=scan.nextInt();

        while (i <= 50){
            if (i % kelipatan == 0){
                System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan , counter);   
            } else {
                System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n" , kelipatan, total);
            }
        i++;
        }
scan.close();
    }
    
}
