package java8.cpt_6.inheritance;

public interface Developer {

    default void software(String language){
        System.out.println("I am programing in " + language);
    }
}
