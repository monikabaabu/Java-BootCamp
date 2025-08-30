package recursion.LeetCode;

import java.util.*;

public class WordSearch_79 {
    private static boolean search(char[][] grid, String s, int r, int c, int i){
        if(i== s.length()){
            return true;
        }
        if(r<0 || r>= grid.length || c<0 || c>= grid[0].length || grid[r][c] != s.charAt(i)){
            return false;
        }
        char temp = grid[r][c];
        grid[r][c] = '0';
        boolean found = search( grid, s, r-1, c, i+1) ||
                        search(grid, s, r+1, c, i+1) ||
                        search(grid, s, r, c-1, i+1) ||
                        search(grid, s, r, c+1, i+1);
        grid[r][c] = temp;
        return found;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row size");
        int r = sc.nextInt();
        System.out.println("enter column size");
        int c = sc.nextInt();
        char[][] grid = new char[r][c];
        System.out.println("enter the letters");
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j < c; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }
        String s = sc.next();
        boolean res = false;
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                if(grid[i][j] == s.charAt(0)){
                    res = search(grid,s, i,j, 0);
                    if(res){
                        break;
                    }
                }

            }
            if(res){
                break;
            }

        }
        if(res){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
