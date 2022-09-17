import java.io.IOException;

//Assignment Operators
public class Test {
    public static void main(String[] args) throws IOException {
        int x = 10, y = 5, z;

        x += y;

        System.out.println(x);

        x %= y;

        System.out.println(x);

        z = x = y;

        System.out.println(z);
    }

}
