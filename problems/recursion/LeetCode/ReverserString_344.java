package recursion;

import java.util.*;

public class ReverserString_344 {
    private static void reverse(char[] s, int start, int end){
        if(start>=end){
            return;
        }
        char temp = s[start];
        s[start]=s[end];
        s[end] = temp;
        reverse(s,start+1,end-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of characters in the array");
        int n = sc.nextInt();
        System.out.println("enter the characters of the string one by one");
        char[] s = new char[n];
        for(int i = 0; i < n; i++) {
            s[i] = sc.next().charAt(0);
        }
        reverse(s,0,n-1);
        System.out.print(Arrays.toString(s));
    }
}
