import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String situation = scanner.next();
        boolean dangerous = false;
        
        int count = 1;
        for (int i = 1; i < situation.length(); i++) {
            if (situation.charAt(i) == situation.charAt(i - 1)) {
                count++;
                if (count >= 7) {
                    dangerous = true;
                    break;
                }
            } else {
                count = 1;
            }
        }
        
        System.out.println(dangerous ? "YES" : "NO");
    }
}
