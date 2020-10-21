package designpattern.creational.abstactfactory.checkbox;

import designpattern.creational.abstactfactory.checkbox.Checkbox;

/**
 * @author faber
 */

public class WinCheckbox implements Checkbox {

    @Override
    public void paint() {

        System.out.println("Checkbox Button");
    }
}
