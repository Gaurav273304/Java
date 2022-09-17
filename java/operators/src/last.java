import java.util.Scanner;

// To find the last digit
public class last {
    public static void main(String[] args) {
        {

            try (Scanner sc = new Scanner(System.in)) {
                int n = sc.nextInt();
                int y = Math.abs(n); // take the modules of the entered value
                int ans = y % 10;

                System.out.println(ans);
            }
        }

    }

}
