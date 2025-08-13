package recursion;
import java.util.*;
public class ProductofDigits {
    private static int product(int n){
        if(n==0){
            return 1;
        }
        return n%10 * product(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        if(n==0){
            System.out.println("0");
        }
        else{
            System.out.println(product(n));
        }

    }
}
