public class Main {
    public static void main(String[] args) {
        // Create a Student model
        Student student = new Student("John Doe", 1, "A");

        // Create a StudentView
        StudentView view = new StudentView();

        // Create a StudentController
        StudentController controller = new StudentController(student, view);

        // Update the view
        controller.updateView();

        // Modify the student data
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("B");
        controller.updateView();
    }
}
