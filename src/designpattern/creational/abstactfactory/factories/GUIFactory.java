package designpattern.creational.abstactfactory.factories;

import designpattern.creational.abstactfactory.button.Button;
import designpattern.creational.abstactfactory.checkbox.Checkbox;

/**
 * @author faber
 */

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();
}
