package Arrays.Leetcode;
import java.util.*;
public class ProductofArrayExceptSelf_238 {
    private static int[] find(int[] nums){
        int[] answer = new int[nums.length];
        answer[0]=1;
        for (int i = 1; i < nums.length; i++) {
            answer[i]= answer[i-1]*nums[i-1];

        }
        int right=1;
        for (int i = nums.length-1; i>=0; i--) {
            answer[i]*=right;
            right*=nums[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter elements");
        for (int i = 0; i <n ; i++) {
            nums[i] = sc.nextInt();
        }
        int[] answer = find(nums);
        for (int i = 0; i <n ; i++) {
            System.out.print(answer[i]+" ");
        }
    }
}
