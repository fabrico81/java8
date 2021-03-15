package java8.certification.oca.chapter_6.exceptions;

import java.lang.Exception;

/**
 * @author faber
 */

public class NoMoreCarrotsException extends Exception{


    NoMoreCarrotsException(String ex){
        super(ex);
    }
}
