import java.util.Scanner;

public class XeniaAndRingroad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[] tasks = new int[m];
        for (int i = 0; i < m; i++) {
            tasks[i] = scanner.nextInt();
        }
        
        long time = 0;
        int current = 1;
        
        for (int i = 0; i < m; i++) {
            int next = tasks[i];
            if (next >= current) {
                time += next - current;
            } else {
                time += n - current + next;
            }
            current = next;
        }
        
        System.out.println(time);
    }
}
