package recursion;
import java.util.*;
public class RotatedBinarySearch {
    private static int search(int[] arr, int t, int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid]==t){
            return mid;
        }
        if(arr[s]<=arr[mid]){
            if(t>=arr[s] && t<= arr[mid]){
                return search(arr,t,s,mid-1);
            }
            else{
                return search(arr,t,mid+1,e);
            }
        }
        if(t>= arr[mid] && t<= arr[e]){
            return search(arr,t,mid+1,e);
        }
        return search(arr,t,s,mid-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
        int n = sc.nextInt();
        int[]  array = new int[n];
        // input : 4,5,6,7,1,2,3
        for (int i = 0; i < n; i++) {
            System.out.println("enter the element "+ i+1 +" :");
            array[i]= sc.nextInt();
        }
        System.out.println("enter target:");
        int t = sc.nextInt();
        System.out.println(search(array,t,0, array.length-1));
    }
    }
