package recursion;
import java.util.*;
public class Palindrome {
    static int sum=0;
    private static void palindrome(int n){
        if(n==0){
            return;
        }
        int rem =n%10;
        sum= sum*10+rem;
        palindrome(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n= sc.nextInt();
        palindrome(n);
        if(sum==n){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
