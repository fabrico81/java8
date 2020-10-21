package java8.codility;

public class Staircase {


    static public void main(String [] args){
       //staircase(6);
//       christmasTree(6);
        emptyChristmasTree();

    }

    static private void staircase(int n){
        for( int i = 0; i<n; i++){
            for(int j=1; j<=n+1; j++){

                System.out.print(j <= n-i ? " " : " #");
            }
            System.out.println("");
        }
    }

    static private void christmasTree (int n){
        for (int i = 0; i < n; i++){
            int diff = 0;
            for (int j = 0; j <= n; ++j){
                diff = n - i;
                if (j <= diff ||  i < (j+1)-n) {
                    System.out.print(" ");
                }
                else {
                    System.out.print(" *");
                }
            }
            System.out.println("");
        }
    }

    static private void emptyChristmasTree() {

        int n = 6;
        for (int i = 0; i <= n; i++) {
            if (i < n - i) {

                System.out.printf(" " + "\n");
            } else {

            }
        }
    }
}
