import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StudentOperations operations = new StudentOperations();
        int choice;
        do {
            System.out.println("\n1. Add Student\n2. Display Students\n3. Search by PRN\n4. Update Student\n5. Delete Student\n6. Exit");
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(scan.nextLine());
        try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Name: ");
                        String name = scan.nextLine();
                        System.out.print("Enter PRN: ");
                        int prn = Integer.parseInt(scan.nextLine());
                        System.out.print("Enter Batch: ");
                        String batch = scan.nextLine();
                        System.out.print("Enter CGPA: ");
                        float cgpa = Float.parseFloat(scan.nextLine());
                        operations.addStudent(new Student(name, prn, batch, cgpa));
                        break;
                    case 2:
                        operations.displayStudents();
                        break;
                    case 3:
                        System.out.print("Enter PRN to search: ");
                        int searchPrn = Integer.parseInt(scan.nextLine());
                        operations.searchByPRN(searchPrn);
                        break;
                    case 4:
                        System.out.print("Enter PRN to update: ");
                        int updatePrn = Integer.parseInt(scan.nextLine());
                        System.out.print("Enter New Name: ");
                        String newName = scan.nextLine();
                        System.out.print("Enter New Batch: ");
                        String newBatch = scan.nextLine();
                    case 5:
                        System.out.print("Enter PRN to delete: ");
                        int deletePrn = Integer.parseInt(scan.nextLine());
                        operations.deleteStudent(deletePrn);
                        break;
                        System.out.print("Enter New CGPA: ");
                        float newCGPA = Float.parseFloat(scan.nextLine());
                        operations.updateStudent(updatePrn, newName, newBatch, newCGPA);
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (choice != 6);
    }
}
