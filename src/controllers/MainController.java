package controllers;

import views.Mainwindow;

public class MainController {
    Mainwindow mainwindow;
    public MainController() {
        this.mainwindow = new Mainwindow();
        new ButtonsController(mainwindow);
        
    }

}
