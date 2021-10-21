package org.samierfabien.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import org.samierfabien.models.MainModel;

import java.awt.*;

public class MainController {
    MainModel model;
    @FXML
    public Slider redSlider;
    @FXML
    public Slider greenSlider;
    @FXML
    public Slider blueSlider;
    @FXML
    public Pane colorPane;

    public MainController() { this.model = new MainModel(); }

    @FXML
    public void initialize() {
        addRedSliderListener();
        addGreenSliderListener();
        addBlueSliderListener();
    }

    public void addRedSliderListener() {
        redSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            model.setRed(newValue.intValue());
            setColorPaneStyle();
        });
    }

    public void addBlueSliderListener() {
        greenSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            model.setGreen(newValue.intValue());
            setColorPaneStyle();
        });
    }

    public void addGreenSliderListener() {
        blueSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            model.setBlue(newValue.intValue());
            setColorPaneStyle();
        });
    }

    public void setColorPaneStyle() {
        colorPane.setStyle("-fx-background-color: rgb("+model.getRed()+","+model.getGreen()+","+model.getBlue()+");");
    }
}
