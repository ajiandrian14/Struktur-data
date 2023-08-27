public class GabunganPola {
    public static void main(String[] args) {
        int n = 5; // Jumlah baris dalam pola

        // Looping untuk mencetak pola pertama
        System.out.println("Pola Pertama:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(); // Baris kosong untuk memisahkan pola

        // Looping untuk mencetak pola kedua
        System.out.println("Pola Kedua:");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println(); // Baris kosong untuk memisahkan pola

        // Looping untuk mencetak pola ketiga
        System.out.println("Pola Ketiga:");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
