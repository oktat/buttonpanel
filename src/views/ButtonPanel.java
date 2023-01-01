package views;

import java.util.HashMap;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ButtonPanel extends JPanel{
    public HashMap<String, JButton> buttons;
    public ButtonPanel() {
        this.initPanel();
    }
    public void addButton(String text) {
        JButton button = new JButton(text);
        this.add(button);
        this.buttons.put(text, button);        
    }
    private void initPanel() {
        this.buttons = new HashMap<>();
        this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        this.setBorder(new EmptyBorder(0, 10, 0, 10));
    }
}
