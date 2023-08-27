import java.util.Scanner;

public class HitungSisiMiring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi pertama: ");
        double sisi1 = scanner.nextDouble();

        System.out.print("Masukkan panjang sisi kedua: ");
        double sisi2 = scanner.nextDouble();

        // Menghitung sisi miring menggunakan Teorema Pythagoras
        double sisiMiring = Math.sqrt(sisi1 * sisi1 + sisi2 * sisi2);

        System.out.println("Panjang sisi miring adalah: " + sisiMiring);

        scanner.close();
    }
}
