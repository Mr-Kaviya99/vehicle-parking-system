package lk.ijse.oop.controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ParkingSystem {
    public JFXComboBox cmbVehicle;
    public JFXComboBox cmbDriver;
    public Label lblParkingSlotNumb;
    public Label lblDateTime;

    public void btnParkVehicleOnAction(ActionEvent actionEvent) {

    }

    public void OnDeliverySwiftOnAction(ActionEvent actionEvent) {

    }

    public void ManagementLoginOnAction(ActionEvent actionEvent) throws IOException {
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("view/ManagementLogin.fxml")));
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
