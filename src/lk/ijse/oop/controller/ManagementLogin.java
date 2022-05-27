package lk.ijse.oop.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ManagementLogin {
    public JFXTextField txtUsername;
    public JFXTextField txtPassword;

    public void btnCancelOnAction(ActionEvent actionEvent) {

    }

    public void btnLogInOnAction(ActionEvent actionEvent) throws IOException {
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("view/ManagementForm.fxml")));
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
