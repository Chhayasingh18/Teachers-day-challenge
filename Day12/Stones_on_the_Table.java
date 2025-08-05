import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        int removals = 0;
        
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                removals++;
            }
        }
        
        System.out.println(removals);
    }
}
