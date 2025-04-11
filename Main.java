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
