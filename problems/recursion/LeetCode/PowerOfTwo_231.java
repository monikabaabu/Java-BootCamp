package recursion;
import java.util.*;
public class PowerOfTwo_231 {
    public static boolean power(int n) {
        long num=n;
        if(num==0){
            return false;
        }
        return(num&(num-1))==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n  = sc.nextInt();
        System.out.println(power(n));
    }
}
