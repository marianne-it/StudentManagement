package com.raven.model;

public class ModelStudent {
    private String studentNo;
    private String firstName;
    private String middleName;
    private String lastName;
    private String mobileNumber;
    private String email;
    private String dateOfBirth;
    private String placeOfBirth;
    private String program;
    private String academicYear;
    private String entryLevel; // This field represents the "year level"
    private String scholarType;

    // No-argument constructor
    public ModelStudent() {
    }

    // Constructor with all fields
    public ModelStudent(String studentNo, String firstName, String middleName, String lastName, String mobileNumber, String email, String dateOfBirth, String placeOfBirth, String program, String academicYear, String entryLevel, String scholarType) {
        this.studentNo = studentNo;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.program = program;
        this.academicYear = academicYear;
        this.entryLevel = entryLevel;
        this.scholarType = scholarType;
    }

    // Getters and Setters
    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getEntryLevel() {
        return entryLevel;
    }

    public void setEntryLevel(String entryLevel) {
        this.entryLevel = entryLevel;
    }
    
    public String getScholarType() {
            return entryLevel;
        }
    public void setScholarType(String scholarType) {
        this.scholarType = scholarType;
    }
}
