package controller;

import db.DBUtil;
import module.Course;
import module.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CourseController {
    public boolean saveCourse(Course course) throws SQLException, ClassNotFoundException {
        Connection con = DBUtil.getInstance().getConnection();
        String query = "INSERT INTO course VALUES(?,?,?,?,?)";
        PreparedStatement pstm = con.prepareStatement(query);

        pstm.setObject(1, course.getCourse_id());
        pstm.setObject(2, course.getCourse_name());
        pstm.setObject(3, course.getCost());
        pstm.setObject(4, course.getDuration());
        pstm.setObject(5, course.getSubject_id());
        return pstm.executeUpdate() > 0;

    }
}
