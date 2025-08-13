package recursion;
import java.util.*;
public class ReverseNumber {
    static int num=0;
    private static void reverse(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        num= num*10+rem;
        reverse(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of number:");
        int n= sc.nextInt();
        reverse(n);
        System.out.println(num);
    }
}