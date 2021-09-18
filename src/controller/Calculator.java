package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Calculator {


    public Label lblNub;

    public void btnClose(ActionEvent actionEvent) {


    }

    public void onNumberButtonClicked(ActionEvent actionEvent) {

        String buttonText = ((Button)actionEvent.getSource()).getText();

        lblNub.setText(buttonText);
        System.out.println(buttonText);



    }
}
