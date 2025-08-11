import java.util.*;
 
public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int maxHeight = -1, minHeight = 101;
        int maxIndex = -1, minIndex = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] > maxHeight) {
                maxHeight = a[i];
                maxIndex = i;
            }
            if (a[i] <= minHeight) {
                minHeight = a[i];
                minIndex = i;
            }
        }
        int swaps = maxIndex + (n - 1 - minIndex);
        if (maxIndex > minIndex) {
            swaps -= 1;
        }
        System.out.println(swaps);
        sc.close();
    }
}
