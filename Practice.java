//Mark Ewert
//Dec 8, 2020

public class Practice{

    public static void main(String[] args){
        int[][] nums = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
            };
        System.out.println("row 2: " + sumRow(nums, 2));
        System.out.println("col 0: " + sumColumn(nums, 0));
        System.out.println("all:  " + sumAll(nums));
        System.out.println("rect (0, 0), (1, 2):  " + sumRect(nums, 0, 0, 1, 2));
    }

    public static int sumRow(int[][] a, int row){
        int sum = 0;
        for (int c = 0; c < a[0].length; c++){
            sum += a[row][c];
        }
        return sum;
    }

    public static int sumColumn(int[][] a, int col){
        int sum = 0;
        for (int r = 0; r < a.length; r++){
          sum += a[r][col];
        }
        return sum;
    }
    
    public static int sumAll(int[][] a){
        int sum = 0;
        for (int r = 0; r < a.length; r++){
            for (int c = 0; c < a[0].length; c++){
              sum += a[r][c];
            }
        }
        return sum;
    }
    
     public static int sumRect(int[][] a, int r1, int c1, int r2, int c2){
        int sum = 0;
        for (int r = r1; r <= r2; r++){
            for (int c = c1; c <= c2; c++){
              sum += a[r][c];
            }
        }
        return sum;
    }
}
