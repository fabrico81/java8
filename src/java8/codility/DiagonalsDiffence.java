package java8.codility;

public class DiagonalsDiffence {


    static public void main(String [] args){

        int [][]m ={
                {11, 2, 4},
                {4, 5, 6},
                {10, 8, -12}};

        Integer diagonalDifferent = diagonalsDifference(m);
        System.out.println("Different: = " + Math.abs(diagonalDifferent));

    }

    static Integer diagonalsDifference(int m[] []){

        int sumOfDiagonal1 = 0;
        for (int i = 0, j = 0; i< m.length && j < m.length; i++, j++) {
            sumOfDiagonal1 = sumOfDiagonal1 + m[i][j];
        }

        //Logic to calculate sum of diagonal2
        int sumOfDiagonal2=0;
        for (int i=0,j=m.length-1 ; i<m.length && j>=0 ; i++, j--) {
            sumOfDiagonal2= sumOfDiagonal2 + m[i][j];
        }
        return Math.abs(sumOfDiagonal1 - sumOfDiagonal2);
    }
}
