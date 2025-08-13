//1342. Number of  Steps to Reduce a Number to Zero
package recursion;
import java.util.*;
public class CountSteps {
    static int steps(int n, int c ){
        if(n==0){
            return c;
        }
        if(n%2==0){
            return steps(n/2,c+1);
        }
        return steps(n-1,c+1);
    }
    public static int numberOfSteps(int num) {
        return steps(num,0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println(numberOfSteps(n));
    }
}
