package controllers;

import javax.swing.JButton;

import views.Mainwindow;

public class MainController {
    Mainwindow mainwindow;
    public MainController() {
        this.mainwindow = new Mainwindow();
        this.handleEvent();
    }
    private void handleEvent() {

        JButton calcButton = this.mainwindow.buttonPanel.buttons.get("Számít");
        JButton aboutButton = this.mainwindow.buttonPanel.buttons.get("Névjegy");
        JButton exitButton = this.mainwindow.buttonPanel.buttons.get("Kilépés");
        calcButton.addActionListener(e -> {
            System.out.println("Számít árnyékeljárás...");
        });
        aboutButton.addActionListener(e -> {
            System.out.println("Névjegy árnyékeljárás...");
        });
        exitButton.addActionListener(e -> {
            System.out.println("Kilépés árnyékeljárás...");
        });
    }
}
