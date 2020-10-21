package designpattern.creational.abstactfactory.button;

import designpattern.creational.abstactfactory.button.Button;

/**
 * @author faber
 */

public class WinButton implements Button {
    @Override
    public void paint() {

        System.out.println("Window Button");
    }
}
