package Arrays.Leetcode;
import java.util.*;
public class MoveZeros_283 {
    private static int[] solution(int[] arr){
        int[] ans = new int[arr.length];
        int c =0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]!=0){
                ans[c] = arr[i];
                c++;
            }
        }
        for (int i = c; i <arr.length; i++) {
            ans[c] =0;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        System.out.println("enter array elements");
        int[] array = new int[n];
        for (int i = 0; i <n ; i++) {
            array[i] = sc.nextInt();
        }
        int[] ans = solution(array);
        for (int i = 0; i < ans.length ; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
