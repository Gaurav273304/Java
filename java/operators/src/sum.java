import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int add = n * (n + 1) / 2;

            System.out.println("your ans is :" + add);
        }
    }

}
