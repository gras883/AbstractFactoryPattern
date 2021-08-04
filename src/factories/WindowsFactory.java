package factories;


import Button.*;
import checkboxes.Checkbox;
import checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
