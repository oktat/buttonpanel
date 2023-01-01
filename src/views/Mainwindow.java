package views;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class Mainwindow extends JFrame {

    public HeadPanel headPanel;
    public BodyPanel bodyPanel;

    public Mainwindow() {
        initApp();
    }

    private void initApp() {
        this.initComponent();
        this.addComponent();
        this.initWindow();
    }

    private void initComponent() {
        this.headPanel = new HeadPanel();
        this.bodyPanel = new BodyPanel();
    }

    private void addComponent() {
        this.add(this.headPanel);
        this.add(this.bodyPanel);
    }

    private void initWindow() {
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
