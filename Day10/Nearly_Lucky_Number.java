import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int luckyDigitCount = 0;
        for (int i = 0; i < n.length(); i++) {
            char digit = n.charAt(i);
            if (digit == '4' || digit == '7') {
                luckyDigitCount++;
            }
        }

        if (isLuckyNumber(luckyDigitCount)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isLuckyNumber(int number) {
        if (number == 0) return false;
        while (number > 0) {
            int digit = number % 10;
            if (digit != 4 && digit != 7) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}
