 import java.util.ArrayList;

public class Westerdals {
    private ArrayList<Student> studentList;
    private ArrayList<Employee> employeeList;

    public Westerdals() {
        studentList = new ArrayList<Student>();
        employeeList = new ArrayList<Employee>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void showAll() {
        for (Student s : studentList) {
            System.out.println(s);
        }

        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }
}



