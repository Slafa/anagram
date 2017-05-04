public class Employee extends Person {
    //Attributter

    private String employeeNumber;
    private int salary;

    //Konstruktør
    public Employee(String employeeNumber, String socialSecurityNumber,
    String firstName, String familyName, int salary) {
        super(firstName,familyName,socialSecurityNumber);
        setEmployeeNumber(employeeNumber);
        setSalary(salary);
    }

    //tilgangsmetoder


    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }   

    public int getSalary() {
        return salary;
    }

    public String toString() {
        String retur = "(aNr " + getEmployeeNumber() + ") " + " (pNr " + getSocialSecurityNumber() + getFirstName()
            + " " + getFamilyName() 
            + ") Lønn: " + getSalary();
        return retur;
    }
}