package java8.certification.oca.chapter_6.exceptions;


/**
 * @author faber
 */

public class Dog {

    private String breed;


    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static boolean checkBreed(String breed) throws NoMoreCarrotsException {

        try {

            if(breed == null) {
                throw new NoMoreCarrotsException("");
            }


        }catch(NoMoreCarrotsException e){




        }



        finally {
            return false;
        }
    }
}
