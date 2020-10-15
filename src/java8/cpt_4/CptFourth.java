package java8.cpt_4;

public class CptFourth {



    public static void main(String args[]) {
//        printEven();
//        printAlphabet();
        printPitagoricTable();

    }
    public static void printEven(){
        int i=0;
        while (true) {
            i++;
            if(i > 10)
                break;
            if((i % 2) != 0)
                continue;
            System.out.println("i = " + i);
        }
    }

    public static void printAlphabet(){

        for (int i=0; i<26; i++){
            char  c = (char) ('a' +i);
            System.out.println( c);
        }
    }

    public static void printPitagoricTable(){

        for (int i = 1; i <= 10; ++i){
            for(int j = 1; j<=10; ++j){
                System.out.print(i*j + "\t");
            }
            System.out.println("");
        }
    }
}
