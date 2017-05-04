public class Student extends Person{
    //Attributter

    private String studentNumber;
    private int credits;

    //Konstruktør
    public Student(String studentNumber, String socialSecurityNumber,
            String firstName, String familyName, int credits) {
        super(firstName,familyName,socialSecurityNumber);
        setStudentNumber(studentNumber);
        setCredits(credits);
    }

    //tilgangsmetoder


    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }   

    public int getCredits() {
        return credits;
    }

    public String toString() {
        String retur = "(sNr " + getStudentNumber() + ") "+ " (pNr " + getSocialSecurityNumber() + getFirstName()
            + " " + getFamilyName() 
            + ") Studiepoeng: " + getCredits();
        return retur;
    }
}
