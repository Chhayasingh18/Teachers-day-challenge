import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        char[] queue = scanner.next().toCharArray();
        
        for (int time = 0; time < t; time++) {
            boolean[] swapped = new boolean[n];
            for (int i = 0; i < n - 1; i++) {
                if (queue[i] == 'B' && queue[i + 1] == 'G' && !swapped[i] && !swapped[i + 1]) {
                    queue[i] = 'G';
                    queue[i + 1] = 'B';
                    swapped[i] = true;
                    swapped[i + 1] = true;
                    i++;
                }
            }
        }
        System.out.println(new String(queue));
    }
}
