package Arrays.Leetcode;
import java.util.*;
public class BestTimetoBuyandSellStock_121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int profit =0;
        int max =0;
        System.out.println("enter elements:");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
            min = Math.min(min,arr[i]);
            profit= arr[i]- min;
            max = Math.max(profit,max);
        }
        System.out.println(max);
    }
}
