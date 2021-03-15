package java8.certification.oca.chapter_6.exceptions;

/**
 * @author faber
 */

public class CheckException {

    public static String exceptions() {
        String result = "";
        String v = null;
        try {
            try {
                result += "before ";
                v.length();
                result += "after ";
            } catch (NullPointerException e) {
                result += "catch ";
                throw new RuntimeException();
            } finally {
                result += "finally ";
                throw new Exception();
            }
        } catch (Exception e) {
            result += "done ";
        }
        return result;
    }

    public static void eatCarrot() throws NoMoreCarrotsException {

        try {
            throw new NoMoreCarrotsException("");

        }catch (NoMoreCarrotsException e){

        }


    }

    public static void bad() {
        try {
            eatCarrot();
        }catch (NoMoreCarrotsException e){

        }
    }

    public static void main (String args []) {
        System.out.println(exceptions());
        bad();
    }
}
