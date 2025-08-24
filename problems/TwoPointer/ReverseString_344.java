package TwoPointer;
import java.util.*;
public class ReverseString_344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of characters in the array");
        int n = sc.nextInt();
        System.out.println("enter the characters of the string one by one");
        char[] s = new char[n];
        for(int i = 0; i < n; i++) {
            s[i] = sc.next().charAt(0);
        }
        int start=0;
        int end =n-1;
        while(start<end){
            char temp = s[start];
            s[start]= s[end];
            s[end]= temp;
            start++;
            end--;

        }
//        for(int i=0;i<n;i++){
//            System.out.print(s[i]+" ");
//        } or
        System.out.println(Arrays.toString(s));

    }
}