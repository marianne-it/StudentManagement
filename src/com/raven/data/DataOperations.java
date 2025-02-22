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
            String query = "SELECT student_no, first_name, middle_name, last_name, mobile_number, email, " +
                           "date_of_birth, place_of_birth, program, academic_year, entry_level FROM students";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                students.add(new ModelStudent(
                    resultSet.getString("student_no"),
                    resultSet.getString("first_name"),
                    resultSet.getString("middle_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("mobile_number"),
                    resultSet.getString("email"),
                    resultSet.getString("date_of_birth"),
                    resultSet.getString("place_of_birth"),
                    resultSet.getString("program"),
                    resultSet.getString("academic_year"),
                    resultSet.getString("entry_level")
                ));
            }
        } catch (SQLException e) {
            System.err.println("Error fetching student data: " + e.getMessage());
        }
        return students;
    }

    // Add a new student
    public void addStudent(ModelStudent student) {
        String sql = "INSERT INTO students (student_no, first_name, middle_name, last_name, mobile_number, email, " +
                     "date_of_birth, place_of_birth, program, academic_year, entry_level) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

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

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete a student by studentNo
    public void deleteStudent(String studentNo) {
        String sql = "DELETE FROM students WHERE student_no = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, studentNo);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update student details
    public void updateStudent(ModelStudent student) {
        String sql = "UPDATE students SET first_name = ?, middle_name = ?, last_name = ?, mobile_number = ?, email = ?, " +
                     "date_of_birth = ?, place_of_birth = ?, program = ?, academic_year = ?, entry_level = ? WHERE student_no = ?";

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
            pstmt.setString(11, student.getStudentNo());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Fetch a student by their student number
    public ModelStudent getStudentByNumber(String studentNumber) {
        ModelStudent student = null;
        String query = "SELECT student_no, first_name, middle_name, last_name, mobile_number, email, " +
                       "date_of_birth, place_of_birth, program, academic_year, entry_level " +
                       "FROM students WHERE student_no = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, studentNumber);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                student = new ModelStudent(
                    resultSet.getString("student_no"),
                    resultSet.getString("first_name"),
                    resultSet.getString("middle_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("mobile_number"),
                    resultSet.getString("email"),
                    resultSet.getString("date_of_birth"),
                    resultSet.getString("place_of_birth"),
                    resultSet.getString("program"),
                    resultSet.getString("academic_year"),
                    resultSet.getString("entry_level")
                );
            }
        } catch (SQLException e) {
            System.err.println("Error fetching student by number: " + e.getMessage());
        }
        return student;
    }
}
