import java.util.Scanner;

//largest of three number
//@author Gaurav rai
public class largest {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            if (a >= b && a >= c) {
                System.out.println(a);
            } else if (b >= a && b >= c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }

}
