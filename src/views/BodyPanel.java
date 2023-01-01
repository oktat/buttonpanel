package views;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class BodyPanel extends JPanel {

    public Buttons buttons;
    public BaseInput baseInput;
    public HeightInput heightInput;
    public AreaInput areaInput;    

    public BodyPanel() {
        initApp();
    }

    private void initApp() {
        this.initComponent();
        this.addComponent();
        this.initPanel();
    }

    private void initComponent() {
        this.buttons = new Buttons();
        this.baseInput = new BaseInput();
        this.heightInput = new HeightInput();
        this.areaInput = new AreaInput();
    }

    private void addComponent() {
        this.add(this.baseInput);
        this.add(this.heightInput);
        this.add(this.buttons);
        this.add(this.areaInput);
    }

    private void initPanel() {
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
    }
  
}
