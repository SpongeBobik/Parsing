package com.example.parsing;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField CityTextField;
    @FXML
    protected void onHelloButtonClick() throws IOException {
        //System.out.println(Weather.GetWeather(CityTextField.getText()));
        welcomeText.setText(Weather.GetWeather(CityTextField.getText()));
    }



}