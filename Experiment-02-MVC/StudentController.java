
import java.util.Scanner;

// Controller: connects Model and View
public class StudentController {
    private final Student model;
    private final StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void updateStudent(String name, String rollNumber) {
        model.setName(name);
        model.setRollNumber(rollNumber);
    }

    public void showStudent() {
        view.displayStudentDetails(
            model.getName(), model.getRollNumber()
        );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        String rollNumber = scanner.nextLine();

        Student model = new Student("", "");
        StudentView view = new StudentView();
        StudentController controller =
            new StudentController(model, view);

        controller.updateStudent(name, rollNumber);
        controller.showStudent();

        scanner.close();
    }
}
