import java.util.Scanner;

public class Dubstep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String remix = scanner.nextLine();
        String[] parts = remix.split("WUB");
        StringBuilder original = new StringBuilder();
        for (String part : parts) {
            if (!part.isEmpty()) {
                if (original.length() != 0) {
                    original.append(" ");
                }
                original.append(part);
            }
        }
        System.out.println(original.toString());
    }
}
