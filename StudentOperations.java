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
    
    public void displayStudents() throws StudentArrayEmptyException {
        if (students.isEmpty()) throw new StudentArrayEmptyException("No students to display.");

        for (Student student : students) {
            student.display();
        }
    }
    public void searchByPRN(int prn) throws InvalidPRNException, StudentNotFoundException {
        if (prn <= 0) throw new InvalidPRNException("Invalid PRN entered.");

        for (Student student : students) {
            if (student.getPRN() == prn) {
                student.display();
                return;
            }
        }
        throw new StudentNotFoundException("Student with PRN " + prn + " not found.");
    }

    public void updateStudent(int prn, String newName, String newBatch, float newCGPA)
            throws StudentNotFoundException, UpdateFailedException {
        for (Student student : students) {
            if (student.getPRN() == prn) {
                student.setName(newName);
                student.setBatch(newBatch);
                student.setCGPA(newCGPA);
                System.out.println("Student updated successfully.");
                return;
            }
        }
        throw new UpdateFailedException("Update failed: Student with PRN " + prn + " not found.");
        public void deleteStudent(int prn) throws StudentNotFoundException, DeleteFailedException {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getPRN() == prn) {
                students.remove(i);
                System.out.println("Student deleted successfully.");
                return;
            }
        }
        throw new DeleteFailedException("Delete failed: Student with PRN " + prn + " not found.");
    }
}
