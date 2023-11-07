package Jobsheet11;
import java.util.Scanner;
import java.util.Random;
public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        char menu = 'y';
        do{
            int number = random.nextInt(10)+1;
            boolean succes = false;
            do{
                    System.out.print("Tebak angka (1-10): ");
                    int answer = input.nextInt();
                    if (answer < number){
                        System.out.print("Angka yang anda inputkan kurang dari jawaban yang benar");
                        System.out.println();
                    }else if (answer > number) {
                        System.out.print("Angka yang anda masukkan lebih dari jawban yang benar");
                        System.out.println();
                    }
                    input.nextLine();
                    succes = (answer == number);

            }while (!succes);
            System.out.print("Jawaban anda benar");
            System.out.println();
            System.out.print("Apakah anda ingin mengulang permainan (Y/T)? ");
            menu = input.nextLine().charAt(0);
        }while (menu == 'y'|| menu == 'Y');
            
        }


    }
    

