package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardFormController {
    public AnchorPane dashBoardForm;

    public void studentbtn(ActionEvent actionEvent) throws IOException {
        Parent load= FXMLLoader.load(getClass().getResource("../view/StudentForm.fxml"));
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void courseBtnOnAction(ActionEvent actionEvent) throws IOException {
        Parent load= FXMLLoader.load(getClass().getResource("../view/CourseForm.fxml"));
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
}
