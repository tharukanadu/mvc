package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import module.Student;
import view.tm.StudentTM;

import java.util.ArrayList;

public class StudentAllController {
    public AnchorPane studentAllForm;
    public TableView<StudentTM> tblStudent;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colEmail;
    public TableColumn colContact;
    public TableColumn colAddress;
    public TableColumn colNic;


    public void initialize(){
        colId.setCellValueFactory(new PropertyValueFactory<>("student_id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("student_name"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colContact.setCellValueFactory(new PropertyValueFactory<>("mobile_no"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colNic.setCellValueFactory(new PropertyValueFactory<>("nic"));

    }


    private void setAllStudent(ArrayList<Student> allItem) {
        ObservableList<StudentTM> oblist = FXCollections.observableArrayList();
        allItem.forEach(e -> {
            oblist.add(
                    new StudentTM(
                            e.getStudent_id(), e.getStudent_name(), e.getEmail(), e.getContact(), e.getAddress(),e.getNic_no()
                    ));
        });
        tblStudent.setItems(oblist);
    }

}
