package controllers;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import views.InputPanel;
import views.Mainwindow;

public class ButtonsController {
    Mainwindow mainwindow;
    public ButtonsController(Mainwindow mainwindow) {
        this.mainwindow = mainwindow;
        this.handleEvent();
    }
    private void handleEvent() {

        JButton calcButton = this.mainwindow.bodyPanel.buttons.buttons.get("Számít");
        JButton aboutButton = this.mainwindow.bodyPanel.buttons.buttons.get("Névjegy");
        JButton exitButton = this.mainwindow.bodyPanel.buttons.buttons.get("Kilépés");
        calcButton.addActionListener(e -> {
            onClickCalcButton();
            
        });
        aboutButton.addActionListener(e -> {
            this.onClickAboutButton();
        });
        exitButton.addActionListener(e -> {
            this.onClickExitButton();
        });
    }
    private void onClickCalcButton() {
        InputPanel baseInput = this.mainwindow.bodyPanel.baseInput;
        InputPanel heightInput = this.mainwindow.bodyPanel.heightInput;
        InputPanel areaInput = this.mainwindow.bodyPanel.areaInput;

        double base = Double.parseDouble(baseInput.getValue());
        double height = Double.parseDouble(heightInput.getValue());
        Double area = this.calcTriangleArea(base, height);
        areaInput.setValue(area.toString());
    }
    private Double calcTriangleArea(double base, double height) {
        return base * height / 2;
    }
    private void onClickAboutButton() {
        String content = "Sallai András\n2023-01-01";
        JOptionPane.showMessageDialog(mainwindow, content, "Névjegy", 1);
    }
    private void onClickExitButton() {
        System.exit(0);
    }
}
