import java.util.Scanner;

// to Define an input is  1)positive even . 2) positive odd . 3) Negative even . 4)Negative odd . 5)Zero
public class inut {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter Your Number ");
            int n = s.nextInt();
            if (n > 0) {
                if (n % 2 == 0) {
                    System.out.println("positive even");
                } else {
                    System.out.println("positive odd");
                }

            } else if (n < 0) {
                if (n % 2 == 0) {
                    System.out.println("Negative even");
                } else {
                    System.out.println("Negative odd");
                }
            } else {
                System.out.println("Zero");
            }
        }

    }
}
