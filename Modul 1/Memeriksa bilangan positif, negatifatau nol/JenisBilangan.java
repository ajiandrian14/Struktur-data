import java.util.Scanner;

public class JenisBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = scanner.nextInt();

        if (bilangan > 0) {
            if (bilangan % 2 == 0) {
                System.out.println("Bilangan genap positif.");
            } else {
                System.out.println("Bilangan ganjil positif.");
            }
        } else if (bilangan < 0) {
            if (bilangan % 2 == 0) {
                System.out.println("Bilangan genap negatif.");
            } else {
                System.out.println("Bilangan ganjil negatif.");
            }
        } else {
            System.out.println("Bilangan nol.");
        }

        scanner.close();
    }
}