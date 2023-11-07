package Jobsheet11;
import java.util.Scanner;
public class NestedLoop_2341760065 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double suhu [][] = new double[5][7];
        
        
        for (int i = 0; i < suhu.length ; i++){
            System.out.println("Kota ke- " + (i+1));
            for (int j = 0; j < suhu[0].length ; j++){
                System.out.print("Hari ke-"+ (j+1) + ": " );
                suhu [i][j] = input.nextDouble();
            }
            System.out.println();
        }
       //  for (int i = 0; i < suhu.length; i++) { 
      //      System.out.print("Kota ke-" + (i + 1) + ": "); 
     //      for (int j = 0; j < suhu[0].length; j++) { 
     //       System.out.print(suhu[i][j] + " "); 
     //       } 
     //      System.out.println();
     //  }
      int urutan = 1;
      for (double[] kota : suhu) {
        System.out.print("Kota ke-" + urutan + ": ");
            double total= 0.0;
            for (double suhuKota : kota) {
                System.out.print(suhuKota + " ");
                total += suhuKota; 
            }
            System.out.println();
            urutan++;
        
            double rata2 = total / kota.length;
            System.out.println("Rata rata suhu kota adalah: " + rata2);
      }

           


}
}