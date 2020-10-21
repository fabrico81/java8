package designpattern.creational.abstactfactory.factories;

import designpattern.creational.abstactfactory.button.WinButton;
import designpattern.creational.abstactfactory.checkbox.WinCheckbox;

/**
 * @author faber
 */

public class WinFactory implements GUIFactory {

    @Override
    public WinButton createButton() {
        return new WinButton();
    }

    @Override
    public WinCheckbox createCheckbox() {
        return new WinCheckbox();
    }
}
