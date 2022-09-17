import java.util.Scanner;

// To find day before n-days
public class days {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int d = s.nextInt();
            int n = s.nextInt();
            int x = n % 7;
            int ans = d - x;
            if (ans > 0) {
                System.out.println(ans);
            } else {
                System.out.println(ans + 7);
            }
        }

    }
}