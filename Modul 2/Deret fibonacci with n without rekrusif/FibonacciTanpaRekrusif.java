public class FibonacciTanpaRekrusif {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;

        System.out.println("Deret Fibonacci (tanpa rekursif):");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
    }
}