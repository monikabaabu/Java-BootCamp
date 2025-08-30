package recursion.LeetCode;

import java.util.*;

public class CombinationSum_39 {
    private static void makecombo(int[] array, int t, List<List<Integer>> res, List<Integer> comb, int total, int i){
        if(total == t){
            res.add(new ArrayList<>(comb));
            return;
        }
        if(total> t || i>= array.length){
            return;
        }
        comb.add(array[i]);
        makecombo(array,t,res,comb,total+array[i],i);
        comb.remove(comb.size()-1);
        makecombo(array,t,res,comb,total,i+1);
    }
    public static List<List<Integer>> combinationSum(int[] array, int t){
        List<List<Integer>> res = new ArrayList<>();
        makecombo(array,t,res,new ArrayList<>(),0,0);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("enter distinct integer");
        for (int i = 0; i <n ; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("enter target");
        int t = sc.nextInt();
        System.out.println(combinationSum(array,t));

    }
}
