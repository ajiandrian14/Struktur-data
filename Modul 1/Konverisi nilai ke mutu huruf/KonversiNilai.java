import java.util.Scanner;

public class KonversiNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai angka: ");
        double nilaiAngka = scanner.nextDouble();

        // Konversi nilai angka menjadi huruf mutu
        String hurufMutu;

        if (nilaiAngka >= 85.0) {
            hurufMutu = "A";
        } else if (nilaiAngka >= 70.0) {
            hurufMutu = "B";
        } else if (nilaiAngka >= 55.0) {
            hurufMutu = "C";
        } else if (nilaiAngka >= 45.0) {
            hurufMutu = "D";
        } else {
            hurufMutu = "E";
        }

        System.out.println("Huruf mutu: " + hurufMutu);

        scanner.close();
    }
}
