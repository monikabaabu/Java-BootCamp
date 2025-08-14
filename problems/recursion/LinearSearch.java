package recursion;
import java.util.*;
public class LinearSearch {
    private static int search(int[] arr, int i, int t){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==t){
            return i;
        }
        return search(arr,i+1,t);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.println("enter the element "+ i+1 + ":");
            array[i]= sc.nextInt();
        }
        System.out.println("enter target:");
        int t = sc.nextInt();
        System.out.println("index is: " + search(array,0,t));
    }
}
