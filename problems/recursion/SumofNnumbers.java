package recursion;
import java.util.*;
public class SumofNnumbers {
    private static int sum(int n){
        if(n<=0){
            return 0;
        }
        return n+ sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}