package java8.codility;

public class Staircase {


    static public void main(String [] args){
//        staircase(6);
        christmasTree(4);
    }

    static private void staircase(int n){
        for( int i = 0; i<n; i++){
            for(int j=1; j<=n; j++){

                System.out.print(j < n-i ? " " : " #");
            }
            System.out.println("");
        }
    }

    static private void christmasTree (int n){
        for (int i = 0; i < n; i++){
            for (int j = 1; j <= n+1; j++){
                if(j <= n-i ){
                    System.out.print(" ");
                }else{
                    System.out.print(" *");
                }
            }
            System.out.println("");
        }
    }
}
