package views;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class HeadPanel extends JPanel {
    JLabel headLabel;
    public HeadPanel() {
        this.headLabel = new JLabel("Háromszög területének számítása");
        this.add(this.headLabel);
    }    
}
