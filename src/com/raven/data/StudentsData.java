package com.raven.data;

public class StudentsData {

    public static Iterable<Object[]> STUDENTS;
    private String firstName;
    private final String middleName;
    private final String lastName;
    private final String mobileNumber;
    private final String email;
    private final String dateOfBirth; 
    private final String placeOfBirth;
    private final String studentNumber;
    private final String program;
    private final String academicYear;
    private final String entryLevel;

    // Constructor
    public StudentsData(String firstName, String middleName, String lastName, String mobileNumber, 
                        String email, String dateOfBirth, String placeOfBirth, String studentNumber, 
                        String program, String academicYear, String entryLevel) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.studentNumber = studentNumber;
        this.program = program;
        this.academicYear = academicYear;
        this.entryLevel = entryLevel;
    }

    // Getter and Setter Methods
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    // Repeat for all other fields...

    @Override
    public String toString() {
        return "Student Data {" +
                "First Name='" + firstName + '\'' +
                ", Middle Name='" + middleName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", Mobile Number='" + mobileNumber + '\'' +
                ", Email='" + email + '\'' +
                ", Date of Birth='" + dateOfBirth + '\'' +
                ", Place of Birth='" + placeOfBirth + '\'' +
                ", Student Number='" + studentNumber + '\'' +
                ", Program='" + program + '\'' +
                ", Academic Year='" + academicYear + '\'' +
                ", Entry Level='" + entryLevel + '\'' +
                '}';
    }

    public String getemail() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getfirstName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getmiddleName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getlastName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getmobileNumber() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getdateOfBirth() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getstudentNumber() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getplaceOfBirth() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getacademicYear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getprogram() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getentryLevel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
