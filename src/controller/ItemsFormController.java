package controller;

import db.CrudUtil;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;
import java.sql.SQLException;

public class ItemsFormController {

    @FXML
    private TextField txtItCode;

    @FXML
    private TextField txtItName;

    @FXML
    private TextField txtPrice;

    @FXML
    private Button btnSv;


    public void SaveOnAction(javafx.event.ActionEvent actionEvent) {

    }
}
