package recursion;

import java.util.*;

public class PrintNtoOne {
    private static void print(int n){
        if(n==0){
            return;
        }

        System.out.println(n);

        //print(n-1); or
        print(--n);
        // n-- wont work here
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        print(n);

    }
}

