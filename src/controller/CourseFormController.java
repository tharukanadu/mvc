package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import module.Course;
import module.Student;

import java.sql.SQLException;

public class CourseFormController {
    public JFXTextField txtId;
    public JFXTextField txtDuration;
    public JFXTextField txtSubjectId;
    public JFXTextField txtCost;
    public JFXTextField txtName;
    public TableView tblCourse;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colCost;
    public TableColumn colDuration;
    public TableColumn colSubject;
    public TableColumn colDelete;
    public AnchorPane courseForm;


    public void courseSavebtn(ActionEvent actionEvent) throws SQLException, ClassNotFoundException {
        Course course = new Course(
                txtId.getText(),
                txtName.getText(),
                Double.parseDouble(txtCost.getText()),
                txtDuration.getText(),
                txtSubjectId.getText()
        );
        if (new CourseController().saveCourse(course))
            new Alert(Alert.AlertType.CONFIRMATION, "Saved").show();
        else
            new Alert(Alert.AlertType.CONFIRMATION, "Try Again").show();
        
    }
}

