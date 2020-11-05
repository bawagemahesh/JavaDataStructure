import java.util.*;

public class MarioPeroblem {

    public static void main(String[] args) {
        /*ist<List<Integer>> tokens = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextLine() ) {
            while (scanner.hasNext() || scanner.next().equals('t')) {
                tokens.add(Collections.singletonList(scanner.nextInt()));
            }
            if(scanner.next().equals('t'))
                System.exit(0);
        }
        scanner.close();
        System.out.println(tokens);
*/
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();

        int twoD[][]=new int[rows][columns];

        for(int i=0; i<rows;i++)
        {
            for(int j=0; j<columns;j++)
            {
                twoD[i][j]=sc.nextInt();
            }
        }
        int n = columns, m = rows;
        wrapper(twoD, n, m);
}


    static int LIP(int dp[][], int mat[][], int n,
                   int m, int x, int y)
    {
        // If value not calculated yet.
        if (dp[x][y] < 0) {
            int result = 0;

            // If reach bottom left cell, return 1.
            if (x == n - 1 && y == m - 1)
                return dp[x][y] = 1;

            if (x == n - 1 || y == m - 1)
                result = 1;


            if (x + 1 < n && mat[x][y] < mat[x + 1][y])
                result = 1 + LIP(dp, mat, n, m, x + 1, y);

            // If value greater than left cell.
            if (y + 1 < m && mat[x][y] < mat[x][y + 1])
                result = Math.max(result, 1 + LIP(dp, mat, n, m, x, y + 1));

            dp[x][y] = result;
        }

        return dp[x][y];
    }

    static int wrapper(int mat[][], int n, int m)
    {
        int dp[][] = new int[10][10];
        for (int i = 0; i < 10; i++)
            Arrays.fill(dp[i], -1);
        return LIP(dp, mat, n, m, 0, 0);
    }

    /* Driver program to test above function */

}

