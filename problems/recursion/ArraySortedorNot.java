package recursion;
import java.util.*;
public class ArraySortedorNot {
    private static boolean sorted(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && sorted(arr,i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i =0;i<n;i++){
            System.out.println("enter element "+(i+1) +":");
            array[i]= sc.nextInt();

        }
        if(sorted(array,0)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
