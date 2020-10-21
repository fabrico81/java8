package designpattern.creational.abstactfactory.factories;

import designpattern.creational.abstactfactory.button.MacButton;
import designpattern.creational.abstactfactory.checkbox.MacCheckbox;
import designpattern.creational.abstactfactory.factories.GUIFactory;

/**
 * @author faber
 */

public class MacFactory implements GUIFactory {
    @Override
    public MacButton createButton() {
        return new MacButton();
    }

    @Override
    public MacCheckbox createCheckbox() {
        return new MacCheckbox();
    }
}
