package lk.ijse.oop.controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class ManagementForm {
    public JFXComboBox cmbProcess;
    public TableView tblManagementForm;

    public void addVehicleOnActioon(ActionEvent actionEvent) throws IOException {
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("view/AddVehicleForm.fxml")));
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void addDriverOnAction(ActionEvent actionEvent) throws IOException {
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("view/AddDriverForm.fxml")));
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void logOutOnAction(ActionEvent actionEvent) {
    }
}
