package java8.cpt_6;

/**
 * Example super builder
 */

public class JavaBook extends Book {

    JavaBook (){
        super();
//        super("Builder called on java book");
        System.out.println("This is a java book");

    };

    public static void main(String [] args){
        new JavaBook();
    }
}
