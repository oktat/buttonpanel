package views;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class InputPanel extends JPanel {
    private JLabel label;
    private JTextField field;

    public InputPanel() {
        this.initComponent();
        this.initPanel();
        this.addComponent();
    }
    public InputPanel(JLabel label) {
        this.label = label;
    }
    public void setText(String text) {
        this.label.setText(text);
    }
    public String getText() {
        return this.label.getText();
    }
    public void setValue(String value) {
        this.field.setText(value);
    }
    public String getValue() {
        return this.field.getText();
    }
    private void initComponent() {
        this.label = new JLabel("InputPanel");
        this.field = new JTextField();
        this.label.setBorder(new EmptyBorder(0, 0, 0, 10));
        this.label.setPreferredSize(new Dimension(90, 25));
    }
    private void addComponent() {
        this.add(label);
        this.add(field);
    }
    private void initPanel() {
        this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        this.setBorder(new EmptyBorder(5, 10, 5, 10));
    }
}
