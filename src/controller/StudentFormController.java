package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import module.Student;
import view.tm.StudentTM;

import java.io.IOException;
import java.sql.SQLException;

public class StudentFormController {
    public JFXTextField txtid;
    public JFXTextField txtname;
    public JFXTextField txtemail;
    public JFXTextField txtaddress;
    public JFXTextField txtnic;
    public ImageView studentForm;
    public JFXTextField txtcontact;
    public JFXTextField searchid;
    public JFXButton selectAll;



    public void StudentDeleteBtn(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        if (new StudentController().deleteStudent(txtid.getText())) {
            new Alert(Alert.AlertType.CONFIRMATION, "Deleted").show();
        } else {
            new Alert(Alert.AlertType.WARNING, "Try Again").show();
        }
    }

    public void StudentUpdateBtn(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        Student student = new Student(
                txtid.getText(),
                txtname.getText(),
                txtemail.getText(),
                txtcontact.getText(),
                txtaddress.getText(),
                txtnic.getText()
        );
        if (new StudentController().updateStudent(student))
            new Alert(Alert.AlertType.CONFIRMATION,"Update").show();
        else
            new Alert(Alert.AlertType.WARNING,"Try again").show();

    }

    public void StudentSavebtn(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        Student student = new Student(
        txtid.getText(),
        txtname.getText(),
        txtemail.getText(),
        txtcontact.getText(),
        txtaddress.getText(),
        txtnic.getText()
        );
        if(new StudentController().saveStudent(student))
            new Alert(Alert.AlertType.CONFIRMATION,"Saved").show();
        else
            new Alert(Alert.AlertType.CONFIRMATION,"Try Again").show();
                setData(student);

    }
    void setData(Student student){
        txtid.setText(student.getStudent_id());
        txtname.setText(student.getStudent_name());
        txtemail.setText(student.getEmail());
        txtcontact.setText(student.getContact());
        txtaddress.setText(student.getAddress());
        txtnic.setText(student.getNic_no());
    }

    public void searchStudentOnAction(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        String search = searchid.getText();
        Student s1 = new StudentController().getStudent(search);
        if (s1==null){
            new Alert(Alert.AlertType.WARNING,"Empty Result Set");
        }else{
            setData(s1);
        }
    }

    public void StudentGetAllBtn(ActionEvent actionEvent) throws IOException {
        Parent load= FXMLLoader.load(getClass().getResource("../view/StudentAll.fxml"));
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }


   /* public void StudentGetAllBtn(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/StudentAll.fxml"));
        Parent load = loader.load();
        StudentDetailController controller = loader.getController();
        controller.setData(tm);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }*/
}

