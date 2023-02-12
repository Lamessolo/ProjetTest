package test.cicd.impl.models;

public class CollegeStudent implements  Student{

    private String firstname ;
    private String lastname;

    private String emailAddress;
    private StudentGrades studentGrades;

    public  CollegeStudent (){

    }

    public CollegeStudent(String firstname, String lastname, String emailAddress, StudentGrades studentGrades) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailAddress = emailAddress;
        this.studentGrades = studentGrades;
    }
    public String getFirstname() {return firstname;}

    public void setFirstname(String firstname) {this.firstname = firstname;}

    public String getLastname() {return lastname;}

    public void setLastname(String lastname) {this.lastname = lastname;}

    public StudentGrades getStudentGrades() {return studentGrades;}

    public void setStudentGrades(StudentGrades studentGrades) {this.studentGrades = studentGrades;}

    public String getEmailAddress() {return emailAddress;}

    public void setEmailAddress(String emailAddress) {this.emailAddress = emailAddress;}

    @Override
    public  String getFullName(){ return getFirstname() + " " + getLastname();}

    @Override
    public  String studentInformation(){ return getFirstname() + " " + getLastname();}
}
