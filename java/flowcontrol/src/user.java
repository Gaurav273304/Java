import java.util.Scanner;

// to find the sum of n natural number for positive numbers
public class user {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter Your Number ");
            int n = s.nextInt();
            if (n > 0) {
                System.out.println(n * (n + 1) / 2);
            } else {
                System.out.println("Invalid");
            }
        }

    }
}
