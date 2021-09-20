package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Calculator {

    private boolean startScreen;
    private boolean decimalDisplay;

    private double firstValue;
    private double secondValue;
    private double output;
    private String operator = "";

    @FXML
    public Label lblNub;



    @FXML
    public void onNumberButtonClicked(ActionEvent actionEvent) {

        if (!startScreen && !decimalDisplay){
            lblNub.setText("");
        }
        String buttonText = ((Button)actionEvent.getSource()).getText();
        lblNub.setText(lblNub.getText() + buttonText);
        startScreen = true;

    }

    public void onZeroClicked(ActionEvent actionEvent) {
        if (!startScreen && !decimalDisplay){
            lblNub.setText("");
        }
        lblNub.setText(lblNub.getText() + "0");
    }

    @FXML
    public void displayClean (){

        lblNub.setText("0");
        startScreen = false;
        decimalDisplay = false;
        operator = "";

    }

    @FXML
    public void onOperatorButtonClicked(ActionEvent actionEvent) {


        String buttonForOperators = ((Button)actionEvent.getSource()).getText();
        if (!buttonForOperators.equals("=")){
            if (!operator.equals("")){
                return;
            }
            operator = buttonForOperators;
            firstValue = Double.parseDouble(lblNub.getText());
            lblNub.setText("");
        }
        else {
            if (operator.equals("")){
                return;
            }
            secondValue = Double.parseDouble(lblNub.getText());
            //method call to evaluate and calculate the results based on the operator used.
            evaluateValues(firstValue, secondValue, operator);
            operator = "";
        }
        startScreen = true;

    }


    @FXML
    private void backspaceValues(){
        String text = lblNub.getText();
        if (text.isEmpty()){
            lblNub.setText("0");
        }else {
            lblNub.setText(text.substring(0, text.length() - 1));
        }
    }


    public void evaluateValues(double firstValue, double secondValue, String operator){
        switch (operator){
            case "+":
                lblNub.setText(firstValue + secondValue + "");
                break;
            case "-":
                lblNub.setText(firstValue - secondValue + "");
                break;
            case "×":
                lblNub.setText(firstValue * secondValue + "");
                break;
            case "÷":
                if (secondValue == 0){
                    lblNub.setText("Math Error");
                    break;
                }
                lblNub.setText(firstValue / secondValue + "");
                break;
            default:
        }
    }


    public void clearDisplay(ActionEvent actionEvent) {

        lblNub.setText("");
    }
}
