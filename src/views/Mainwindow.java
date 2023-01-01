package views;

import javax.swing.JFrame;

public class Mainwindow extends JFrame {
    public ButtonPanel buttonPanel;
    public Mainwindow() {
        initApp();
    }
    private void initApp() {
        this.initComponent();
        this.setComponent();
        this.addComponent();
        this.initWindow();
    }
    private void initComponent() {
        this.buttonPanel = new ButtonPanel();    
    }
    private void setComponent() {
        this.buttonPanel.addButton("Számít");
        this.buttonPanel.addButton("Névjegy");
        this.buttonPanel.addButton("Kilépés");
    }
    private void addComponent() {
        this.add(this.buttonPanel);
    }
    private void initWindow() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);
    }
    
    
}
