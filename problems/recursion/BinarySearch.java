package recursion;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size:");
        int n= sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n ; i++) {
            array[i]= sc.nextInt();
        }
        System.out.println("enter target:");
        int x = sc.nextInt();

        System.out.println(search(array,x,0,n));
    }
    static int search(int[] array, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(target == array[mid]){
            return mid;
        }
        else if( target > array[mid]){
            return search(array,target,mid+1,end);
        }

        return search(array,target,start,mid-1);

    }
}

