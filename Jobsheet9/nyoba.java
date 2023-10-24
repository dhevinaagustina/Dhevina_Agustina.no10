package Jobsheet9;
import java.util.Scanner;

public class nyoba {
    public static void main(String[] args) {
        // Deklarasi variabel
        int n, i, data[], max, min, sum;

        // Input banyaknya elemen
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan banyaknya elemen: ");
        n = scan.nextInt();

        // Input nilai tiap elemen
        data = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            data[i] = scan.nextInt();
        }

        // Cari nilai tertinggi
        max = data[0];
        for (i = 1; i < n; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }

        // Cari nilai terendah
        min = data[0];
        for (i = 1; i < n; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }

        // Hitung rata-rata
        sum = 0;
        for (i = 0; i < n; i++) {
            sum += data[i];
        }
        float avg = (float) sum / n;

        // Output
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
        System.out.println("Nilai rata-rata: " + avg);
    }
}
