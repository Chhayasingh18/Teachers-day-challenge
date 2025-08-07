import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] p = new int[n + 1]; // Using 1-based indexing
        for (int i = 1; i <= n; i++) {
            p[i] = scanner.nextInt();
        }
        int[] q = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            q[p[i]] = i;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(q[i] + " ");
        }
    }
}
