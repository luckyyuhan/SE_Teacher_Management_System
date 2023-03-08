
import Basic.Administrator;
import Basic.ClassDirector;
import Util.Controller;
import Util.RequirementWriter;
import Util.TeacherListWriter;

import java.io.IOException;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws IOException {
        Controller controller = new Controller();
        ClassDirector classDirector = controller.getCourseDirector();
        Administrator administrator = controller.getAdministrator();

        System.out.println("\nPart Time Teacher Management System\n");
        System.out.println("***************************************");


        Scanner scanner = new Scanner(System.in);
        boolean temp = true;
        while (temp) {
            System.out.println("\nPlease choose your identity:\n1.Course Director  \n2.Administrator  \n3.Others to Quit");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    classDirector.formulateRequirement(scanner, controller);
                    break;
                case 2:
                    administrator.manageDatabase(scanner, controller);
                    break;
                case 3:
                    temp = false;
            }
            RequirementWriter.writeRequirement(controller.getRequirement());
            TeacherListWriter.writeTeacherList(controller.getTeacherList());
        }

        scanner.close();
    }
}