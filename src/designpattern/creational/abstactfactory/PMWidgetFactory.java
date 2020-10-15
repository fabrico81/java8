package designpattern.creational.abstactfactory;

/**
 * @author faber
 */

public abstract class PMWidgetFactory {

    public void createScrollBar(){
        System.out.println("create scrollbar PM");
    }

    public void createWindows() {
        System.out.println("create windows PM");
    }
}
