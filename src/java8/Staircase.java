package java8;

public class Staircase {


    static public void main(String [] args){
        staircase(6);
    }

    static private void staircase(int n){
        for( int i = 0; i<n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(j < n-i ? " " : "#");
            }
            System.out.println("");
        }
    }
}
