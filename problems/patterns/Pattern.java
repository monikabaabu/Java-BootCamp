package patterns;

public class Pattern{
    public static void main(String[] args) {
        System.out.println("pattern 1");
        pattern1(5);
        System.out.println();

        System.out.println("pattern 2");
        pattern2(4);
        System.out.println();

        System.out.println("pattern 3");
        pattern3(5);
        System.out.println();

        System.out.println("pattern 4");
        pattern4(4);
        System.out.println();

        System.out.println("pattern 5");
        pattern5(5);
        System.out.println();

        System.out.println("pattern 6");
        pattern6(5);
        System.out.println();

        System.out.println("pattern 7");
        pattern7(5);
        System.out.println();

        System.out.println("pattern 8");
        pattern8(5);
        System.out.println();

        System.out.println("pattern 9");
        pattern9(5);
        System.out.println();

        System.out.println("pattern 10");
        pattern10(5);
        System.out.println();

        System.out.println("pattern 11");
        pattern11(5);
        System.out.println();

        System.out.println("pattern 12");
        pattern12(5);
        System.out.println();

        System.out.println("pattern 13");
        pattern13(5);
        System.out.println();

        System.out.println("pattern 14");
        pattern14(5);
        System.out.println();

        System.out.println("pattern 15");
        pattern15(5);
        System.out.println();


        System.out.println("pattern 17");
        pattern17(5);
        System.out.println();
        System.out.println("pattern 28");
        pattern28(5);
        System.out.println();
        System.out.println("pattern 30");
        pattern30(5);
        System.out.println();
        System.out.println("pattern 31");
        pattern31(4);
    }
    static void pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int col=1; col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int row=1; row<=n; row++){
            for(int col=1; col<= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int row = 1; row<=n;row++){
            for(int col=1; col<= n-row+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int row =1; row<=n;row++){
            for(int col =1; col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int row=1; row<=2*n;row++ ){
            int cols = row>=n? 2*n-row : row;
            for(int col= 1; col<=cols;col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void pattern6(int n){
        for(int row=1; row<=n;row++){
            for(int space = n-row ;space>=1;space--){
                System.out.print(" ");
            }
            for(int col = 1; col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int row =1; row<=n;row++){
            for(int space=1; space<=row;space++){
                System.out.print(" ");
            }
            for(int col = n-row+1; col>=1;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for(int row =1; row<=n;row++){
            for(int space = n-row;space>=1;space--){
                System.out.print(" ");
            }
            for(int col = 1; col<=row;col++){
                System.out.print("*");
            }
            for(int col2 =1;col2<row;col2++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for(int row=1; row<=n;row++){
            for(int space=1;space<row;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=n-row+1;col++){
                System.out.print("*");
            }
            for(int col2 = 1; col2<n-row+1;col2++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for(int row =1; row<=n;row++){
            for(int space = n-row;space>=1;space--){
                System.out.print("  ");
            }
            for(int col = 1; col<=row;col++){
                System.out.print("* ");
            }
            for(int col2 =1;col2<row;col2++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern11(int n){
        for(int row=1; row<=n;row++){
            for(int space=1;space<row;space++){
                System.out.print("  ");
            }
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            for(int col2 = 1; col2<n-row+1;col2++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern12(int n){
        for(int row =1; row<=2*n; row++){
            int totalspace = row>n? 2*n-row:row;
            for(int space = 1; space<=totalspace;space++){
                System.out.print(" ");
            }
            for(int col=1; col<=n-totalspace+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern13(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = row; space < n; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= (2 * row - 1); col++) {
                if (col== 1 || col == (2 * row - 1) || row == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern14(int n){
        for(int row=0; row<n;row++){
            for(int space =0; space <row;space++){
                System.out.print(" ");
            }
            for(int col = 0; col<(2*(n-row)-1);col++){
                if(col==0||col==(2*(n-row)-2)|| row==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    static void pattern15(int n){
        for(int row =1; row<=n;row++){
            for(int space =1; space<=n-row-1;space++){
                System.out.print(" ");
            }
            for(int col =1; col<=2*row+1;col++){
                if(col==1 || col==2*row){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for(int row=1; row<=2*n;row++){
            int newcol = row>=n? 2*n-row: row;
            for(int space = 1; space<=n-newcol; space++){
                System.out.print("  ");
            }
            for(int col=newcol; col>=1; col--){
                System.out.print(col+" ");
            }
            for (int col2 =2; col2<=newcol;col2++){
                System.out.print(col2+" ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int col1 = row >= n ? 2 * n - row : row;
            for (int col = 1; col <= n - col1; col++) {
                System.out.print(" ");
            }
            for (int col2 = 1; col2 <= col1; col2++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern30(int n){
        for(int row =1; row<=n; row++){
            for(int space = 1; space<= n-row;space++){
                System.out.print("  ");
            }
            for(int col=row; col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col2 = 2; col2<=row;col2++){
                System.out.print(col2+" ");
            }
            System.out.println();
        }

    }
    static void pattern31(int n){
        for(int row = 1 ; row<=2*n-1;row++) {

            for (int col = 1; col <= 2 * n - 1; col++) {
                int x = Math.min(Math.min(row,col),Math.min(2*n-row,2*n-col));
                System.out.print(n-x+1+" ");
            }
            System.out.println();
        }
    }

}

