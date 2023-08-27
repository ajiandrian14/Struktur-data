import java.util.Scanner;

public class HitungDiskon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan total belanja: ");
        double totalBelanja = scanner.nextDouble();

        double diskon = 0;

        // Menghitung diskon berdasarkan ketentuan
        if (totalBelanja > 500000) {
            diskon = 0.1 * totalBelanja;
        } else if (totalBelanja > 250000) {
            diskon = 0.05 * totalBelanja;
        }

        double totalBayar = totalBelanja - diskon;

        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Total bayar: Rp " + totalBayar);

        scanner.close();
    }
}
