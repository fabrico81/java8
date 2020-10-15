package designpattern.creational.abstactfactory;

/**
 * @author faber
 */

public class MotifWidgetFactory implements Widget{

    public void createScrollBar(){
        System.out.println("create scrollbar motif");
    }

    public void createWindows() {
        System.out.println("create windows motif");
    }

    @Override
    public void createProductA() {
        
    }

    @Override
    public void createProductB() {

    }
}
