import java.util.Scanner;

// find even-odd
public class test {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter Your Number ");
            int n = s.nextInt();
            if (n % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }

    }

}
