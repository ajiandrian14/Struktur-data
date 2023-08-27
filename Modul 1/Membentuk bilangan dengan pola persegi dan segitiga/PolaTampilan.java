public class PolaTampilan {
    public static void main(String[] args) {
        int n = 5;

        // Pola 1
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

        System.out.println();

        // Pola 2
        count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

        System.out.println();

        // Pola 3
        count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(count + " ");
            }
            count++;
            System.out.println();
        }

        System.out.println();

        // Pola 4
        count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count + " ");
            }
            count++;
            System.out.println();
        }
    }
}
