import java.util.Scanner;

public class leap {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int year = sc.nextInt();

            if (year % 4 == 0 && year % 100 != 0) {
                System.out.print("Yes");
            } else if (year % 400 == 0) {
                System.out.print("Yes");
            } else {
                System.out.print("No");
            }
        }
    }

}
