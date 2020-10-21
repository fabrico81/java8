package designpattern.creational.abstactfactory.checkbox;

import designpattern.creational.abstactfactory.checkbox.Checkbox;

/**
 * @author faber
 */

public class MacCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("Mac Checkbox");
    }
}
