import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }
        int threshold = scores[k - 1];
        int count = 0;
        for (int score : scores) {
            if (score >= threshold && score > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
