public class StudentProfile{
    String firstName;
    String lastName;
    int expectedYearToGraduate;
    double GPA;
    String declaredMajor;
    public StudentProfile(String firstName,
                          String lastName,
                          int expectedYearToGraduate,
                          double GPA,
                          String declaredMajor){
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
        this.expectedYearToGraduate = expectedYearToGraduate;
        this.declaredMajor = declaredMajor;      
        }
    public void expectedYear(){
        this.expectedYearToGraduate = this.expectedYearToGraduate + 1;
    }

}
