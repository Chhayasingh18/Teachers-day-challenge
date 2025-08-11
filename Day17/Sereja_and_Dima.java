import java.util.Scanner;
 
public class SerejaAndDima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cards = new int[n];
        for (int i = 0; i < n; i++) {
            cards[i] = scanner.nextInt();
        }
        
        int left = 0;
        int right = n - 1;
        int serejaScore = 0;
        int dimaScore = 0;
        boolean serejaTurn = true;
        
        while (left <= right) {
            int chosen;
            if (cards[left] > cards[right]) {
                chosen = cards[left];
                left++;
            } else {
                chosen = cards[right];
                right--;
            }
            
            if (serejaTurn) {
                serejaScore += chosen;
            } else {
                dimaScore += chosen;
            }
            
            serejaTurn = !serejaTurn;
        }
        
        System.out.println(serejaScore + " " + dimaScore);
    }
}
