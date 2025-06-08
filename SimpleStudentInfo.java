public class SimpleStudentInfo {

    // Function to display student info
    public static void displayStudentInfo(String name, int rollNumber, String department, int semester) {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Department: " + department);
        System.out.println("Semester: " + semester);
        System.out.println("Semester: " + semester);
        System.out.println("Semester: " + semester);
    }

    public static void main(String[] args) {
        // Sample student data
        String name = "Prajwal K";
        int rollNumber = 101;
        String department = "Computer Science";
        int semester = 4;

        // Display info
        displayStudentInfo(name, rollNumber, department, semester);
}
}