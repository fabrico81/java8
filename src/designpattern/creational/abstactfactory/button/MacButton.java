package designpattern.creational.abstactfactory.button;

import designpattern.creational.abstactfactory.button.Button;

/**
 * @author faber
 */

public class MacButton implements Button {

    @Override
    public void paint() {
        System.out.println("Mac Button");
    }
}
