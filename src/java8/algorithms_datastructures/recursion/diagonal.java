package java8.algorithms_datastructures.recursion;


/**
 * @author faber
 */

class GFG {


    public static void diagonal(int n) {
        String matrix [][] = new String [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(((i == j) || (i+j) == (n-1)) ? matrix[i][j] = "x" : "  ");
            System.out.println();
        }
    }

    public static void column (int n) {
        String matrix [] [];
    }


    public static void main(String args[]) {

        diagonal(4);

    }
}

