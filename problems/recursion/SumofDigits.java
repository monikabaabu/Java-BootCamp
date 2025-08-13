package recursion;
import java.util.*;
public class SumofDigits {
    private static int sum(int n){
        if(n<=0){
            return 0;
        }
        return (n%10)+ sum(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
