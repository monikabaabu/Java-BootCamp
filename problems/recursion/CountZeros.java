package recursion;
import java.util.*;
public class CountZeros {
    static int count(int n) {
        return zero(n, 0);
    }

    private static int zero(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            return zero(n / 10, c + 1);
        }
        return zero(n / 10, c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("1");
        } else {
            System.out.println(count(n));
        }
    }
}
