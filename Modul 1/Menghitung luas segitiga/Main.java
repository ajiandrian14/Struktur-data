import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang alas: ");
        double alas = scanner.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double tinggi = scanner.nextDouble();

        double luas = (alas * tinggi) / 2;

        System.out.println("Luas segitiga: " + luas);

        scanner.close();
    }
}