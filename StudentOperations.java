import java.util.*;

class StudentOperations {
    ArrayList<Student> students;

    public StudentOperations() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) throws StudentAlreadyExistsException, DuplicatePRNException {
        for (Student s : students) {
            if (s.getPRN() == student.getPRN()) {
                throw new DuplicatePRNException("Student with PRN already exists.");
            }
        }
        students.add(student);
        System.out.println("Student added.");
    }
