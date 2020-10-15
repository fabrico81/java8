package designpattern.creational.factory;

/**
 * @author faber
 */

public class FactoryMain {

    static public void main(String arg[]){

        OperatingSystemFactory operatingSystemFactory = new OperatingSystemFactory();

        OS obj = operatingSystemFactory.getInstance("Android");
        obj.spec();
    }
}
