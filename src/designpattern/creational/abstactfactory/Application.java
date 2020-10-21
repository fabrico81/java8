package designpattern.creational.abstactfactory;

import designpattern.creational.abstactfactory.button.Button;
import designpattern.creational.abstactfactory.checkbox.Checkbox;
import designpattern.creational.abstactfactory.factories.GUIFactory;

/**
 * @author faber
 *
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */

public class Application {


    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}



