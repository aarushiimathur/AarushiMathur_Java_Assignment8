# Student Management System

This is a simple **Student Management System** built in Java. The system allows you to add, display, search, update, and delete student records. Each student has a name, PRN, batch, and CGPA. The system provides a menu-driven interface for managing the records.

---

##  Features

1. **Add Student** - Allows you to add a new student record by entering their name, PRN, batch, and CGPA.
2. **Display Students** - Displays the list of all students in the system.
3. **Search by PRN** - Allows you to search for a student by their PRN and displays the student details.
4. **Update Student** - Allows you to update the details (name, batch, CGPA) of an existing student using their PRN.
5. **Delete Student** - Allows you to delete a student record using their PRN.
6. **Exit** - Exits the program.

---

## Project Structure

The project consists of the following Java files:

1. **Main.java** - The entry point of the program with the menu and user interaction.
2. **Student.java** - Represents a student with attributes (name, PRN, batch, CGPA), constructors, and methods.
3. **StudentOperations.java** - Contains all the business logic and CRUD operations.
4. **CustomExceptions.java** - Defines all the custom exceptions used across the application.

---

## Custom Exceptions

This program uses several **custom exception classes** to ensure clean error handling and better user feedback.

### Add Student
- `DuplicatePRNException` - Thrown when a student with the same PRN already exists.
- `StudentAlreadyExistsException` - General exception for duplicate student addition.

###  Display Students
- `StudentArrayEmptyException` - Thrown if there are no students to display.

### Search by PRN
- `InvalidPRNException` - Thrown when the PRN entered is invalid (e.g., zero or negative).
- `StudentNotFoundException` - Thrown if no student matches the provided PRN.

###  Update Student
- `StudentNotFoundException` - Thrown when trying to update a student who doesn't exist.
- `UpdateFailedException` - Thrown if something goes wrong during update operation.

### Delete Student
- `StudentNotFoundException` - Thrown when trying to delete a student who doesn't exist.
- `DeleteFailedException` - Thrown if the deletion operation fails unexpectedly.

---
