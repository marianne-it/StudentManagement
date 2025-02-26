package com.raven.data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.raven.model.ModelStudent;

public class DataOperations {

    // Fetch all students
    public List<ModelStudent> getAllStudents() {
        List<ModelStudent> students = new ArrayList<>();
        try (Connection connection = DatabaseConnection.getConnection()) {
            String query = "SELECT StudentNo, firstName, middleName, lastName, mobileNo, email, dob, placeOfBirth, program, academicYear, entryLevel, scholarType FROM students";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                students.add(new ModelStudent(
                    resultSet.getString("StudentNo"),
                    resultSet.getString("firstName"),
                    resultSet.getString("middleName"),
                    resultSet.getString("lastName"),
                    resultSet.getString("mobileNo"),
                    resultSet.getString("email"),
                    resultSet.getString("dob"),
                    resultSet.getString("placeOfBirth"),
                    resultSet.getString("program"),
                    resultSet.getString("academicYear"),
                    resultSet.getString("entryLevel"),
                    resultSet.getString("scholarType")
                ));
            }
        } catch (SQLException e) {
            System.err.println("Error fetching student data: " + e.getMessage());
        }
        return students;
    }

    // Fetch the 30 most recent students
    public List<ModelStudent> getRecentStudents() {
        List<ModelStudent> students = new ArrayList<>();

        try (Connection con = DatabaseConnection.getConnection()) {
            String query = "SELECT StudentNo, firstName, middleName, lastName, program, entryLevel, email FROM students ORDER BY created_at DESC LIMIT 30";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
            ModelStudent student = new ModelStudent();
            student.setStudentNo(rs.getString("StudentNo"));
            student.setFirstName(rs.getString("firstName"));
            student.setMiddleName(rs.getString("middleName"));
            student.setLastName(rs.getString("lastName"));
            student.setProgram(rs.getString("program"));
            student.setEntryLevel(rs.getString("entryLevel"));
            student.setEmail(rs.getString("email"));
            students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }


    // Add a new student
    public void addStudent(ModelStudent student) {
        String sql = "INSERT INTO students (StudentNo, firstName, middleName, lastName, mobileNo, email, dob, placeOfBirth, program, academicYear, entryLevel, scholarType) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, student.getStudentNo());
            pstmt.setString(2, student.getFirstName());
            pstmt.setString(3, student.getMiddleName());
            pstmt.setString(4, student.getLastName());
            pstmt.setString(5, student.getMobileNumber());
            pstmt.setString(6, student.getEmail());
            pstmt.setString(7, student.getDateOfBirth());
            pstmt.setString(8, student.getPlaceOfBirth());
            pstmt.setString(9, student.getProgram());
            pstmt.setString(10, student.getAcademicYear());
            pstmt.setString(11, student.getEntryLevel());
            pstmt.setString(12, student.getScholarType());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error adding student: " + e.getMessage());
        }
    }

    // Delete a student by StudentNo
    public void deleteStudent(String studentNo) {
        String sql = "DELETE FROM students WHERE StudentNo = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, studentNo);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error deleting student: " + e.getMessage());
        }
    }

    // Update student details
    public void updateStudent(ModelStudent student) {
        String sql = "UPDATE students SET firstName = ?, middleName = ?, lastName = ?, mobileNo = ?, email = ?, dob = ?, placeOfBirth = ?, program = ?, academicYear = ?, entryLevel = ?, scholarType = ? WHERE StudentNo = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, student.getFirstName());
            pstmt.setString(2, student.getMiddleName());
            pstmt.setString(3, student.getLastName());
            pstmt.setString(4, student.getMobileNumber());
            pstmt.setString(5, student.getEmail());
            pstmt.setString(6, student.getDateOfBirth());
            pstmt.setString(7, student.getPlaceOfBirth());
            pstmt.setString(8, student.getProgram());
            pstmt.setString(9, student.getAcademicYear());
            pstmt.setString(10, student.getEntryLevel());
            pstmt.setString(11, student.getScholarType());
            pstmt.setString(12, student.getStudentNo());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error updating student: " + e.getMessage());
        }
    }

    // Fetch a student by their StudentNo
    public ModelStudent getStudentByNumber(String studentNo) {
        ModelStudent student = null;
        String query = "SELECT StudentNo, firstName, middleName, lastName, mobileNo, email, dob, placeOfBirth, program, academicYear, entryLevel, scholarType FROM students WHERE StudentNo = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, studentNo);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                student = new ModelStudent(
                    resultSet.getString("StudentNo"),
                    resultSet.getString("firstName"),
                    resultSet.getString("middleName"),
                    resultSet.getString("lastName"),
                    resultSet.getString("mobileNo"),
                    resultSet.getString("email"),
                    resultSet.getString("dob"),
                    resultSet.getString("placeOfBirth"),
                    resultSet.getString("program"),
                    resultSet.getString("academicYear"),
                    resultSet.getString("entryLevel"),
                    resultSet.getString("scholarType")
                );
            }
        } catch (SQLException e) {
            System.err.println("Error fetching student by number: " + e.getMessage());
        }
        return student;
    }
}
