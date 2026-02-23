import java.util.Scanner;

import com.tka.service.AdminService;
import com.tka.service.StudentService;
import com.tka.service.TeacherService;

public class App {

	public static void main(String[] args) {
			
		 AdminService adminService = new AdminService();
	        TeacherService teacherService = new TeacherService();
	        StudentService studentService = new StudentService();

	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            System.out.println("\n==== Institute Management System ====");
	            System.out.println("1. Admin Login");
	            System.out.println("2. Teacher Login");
	            System.out.println("3. Student Login");
	            System.out.println("4. Exit");

	            int ch = sc.nextInt();

	            switch (ch) {
	                case 1: adminService.loginAdmin(); break;
	                case 2: teacherService.loginTeacher(); break;
	                case 3: studentService.loginStudent(); break;
	                case 4: return;
	                default: System.out.println("Invalid Option");
	            }
	            sc.close();
	        }
	}
		
}
