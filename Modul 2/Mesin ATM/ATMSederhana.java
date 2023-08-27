import java.util.Scanner;

public class ATMSederhana {
    static Scanner scanner = new Scanner(System.in);
    static long saldo = 0;

    static void tarikTunai() {
        System.out.print("Masukkan jumlah uang yang akan diambil: ");
        long jumlahTarik = scanner.nextLong();

        if (jumlahTarik > saldo || saldo - jumlahTarik < 50000) {
            System.out.println("Saldo tidak mencukupi atau tidak memenuhi syarat saldo minimum.");
        } else {
            if (jumlahTarik > 1000000) {
                saldo -= jumlahTarik + 5000;
            } else if (jumlahTarik > 500000) {
                saldo -= jumlahTarik + 2500;
            } else {
                saldo -= jumlahTarik;
            }
            System.out.println("Sisa saldo: " + saldo);
        }
    }

    static void simpanUang() {
        System.out.print("Masukkan jumlah uang yang akan disimpan: ");
        long jumlahSimpan = scanner.nextLong();
        saldo += jumlahSimpan;
        System.out.println("Sisa saldo: " + saldo);
    }

    public static void main(String[] args) {
        System.out.print("Masukkan nama nasabah: ");
        String namaNasabah = scanner.nextLine();
        System.out.print("Masukkan saldo awal: ");
        saldo = scanner.nextLong();

        int pilihan;
        do {
            System.out.println("=== Menu Bank Halal ===");
            System.out.println("1. Tarik Tunai");
            System.out.println("2. Simpan Uang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tarikTunai();
                    break;
                case 2:
                    simpanUang();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan layanan Bank Halal.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}