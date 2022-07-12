package controller;

import db.DBUtil;
import module.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentController {
    public boolean saveStudent(Student student) throws SQLException, ClassNotFoundException {
        Connection con = DBUtil.getInstance().getConnection();
        String query = "INSERT INTO student VALUES(?,?,?,?,?,?)";
        PreparedStatement pstm = con.prepareStatement(query);
        pstm.setObject(1, student.getStudent_id());
        pstm.setObject(2, student.getStudent_name());
        pstm.setObject(3, student.getEmail());
        pstm.setObject(4, student.getContact());
        pstm.setObject(5, student.getAddress());
        pstm.setObject(6, student.getNic_no());
        return pstm.executeUpdate() > 0;
    }


    public boolean updateStudent(Student student) throws SQLException, ClassNotFoundException {
        Connection connection = DBUtil.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("UPDATE student SET student_name=?,email=?,mobile_no=?,address=?,nic=? WHERE student_id=?");
        pstm.setObject(1, student.getStudent_name());
        pstm.setObject(2, student.getEmail());
        pstm.setObject(3, student.getContact());
        pstm.setObject(4, student.getAddress());
        pstm.setObject(5, student.getNic_no());
        pstm.setObject(6, student.getStudent_id());

        return pstm.executeUpdate() > 0;

    }

    public Student getStudent(String student_id) throws SQLException, ClassNotFoundException {
        PreparedStatement pstm = DBUtil.getInstance().getConnection().prepareStatement("SELECT * FROM student WHERE student_id=?");
        pstm.setObject(1, student_id);
        ResultSet rst = pstm.executeQuery();
        if (rst.next()) {
            return new Student(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6)

            );
        } else {
            return null;
        }
    }
    public static ArrayList<Student> getAllStudent() throws SQLException, ClassNotFoundException {
        PreparedStatement stm = DBUtil.getInstance().getConnection().prepareStatement("SELECT *FROM student");
        ResultSet rst = stm.executeQuery();
        ArrayList<Student> student = new ArrayList<>();
        while (rst.next()) {
            student.add(
                    new Student(
                            rst.getString(1),
                            rst.getString(2),
                            rst.getString(3),
                            rst.getString(4),
                            rst.getString(5),
                            rst.getString(6)

                    ));

        }
        return student;
    }

    public boolean deleteStudent(String student_id) throws SQLException, ClassNotFoundException {
        if (DBUtil.getInstance().getConnection().prepareStatement("DELETE  FROM student WHERE student_id='"+student_id+"'").executeUpdate()>0) {
            return true;
        }else{
            return false;
        }
    }
}
