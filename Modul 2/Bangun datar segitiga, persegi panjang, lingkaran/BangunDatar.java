import java.util.Scanner;

class BangunDatar {
    static Scanner scanner = new Scanner(System.in);

    static double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    static double hitungLuasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    static double hitungLuasLingkaran(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("=== Menu Bangun Datar ===");
            System.out.println("1. Hitung Luas Segitiga");
            System.out.println("2. Hitung Luas Persegi Panjang");
            System.out.println("3. Hitung Luas Lingkaran");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan alas segitiga: ");
                    double alas = scanner.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    double tinggi = scanner.nextDouble();
                    double luasSegitiga = hitungLuasSegitiga(alas, tinggi);
                    System.out.println("Luas segitiga: " + luasSegitiga);
                    break;

                case 2:
                    System.out.print("Masukkan panjang persegi panjang: ");
                    double panjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    double lebar = scanner.nextDouble();
                    double luasPersegiPanjang = hitungLuasPersegiPanjang(panjang, lebar);
                    System.out.println("Luas persegi panjang: " + luasPersegiPanjang);
                    break;

                case 3:
                    System.out.print("Masukkan radius lingkaran: ");
                    double radius = scanner.nextDouble();
                    double luasLingkaran = hitungLuasLingkaran(radius);
                    System.out.println("Luas lingkaran: " + luasLingkaran);
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
