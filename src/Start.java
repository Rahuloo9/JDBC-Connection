import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.out.println("Hello Student  Management App ");

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

while (true) {
	System.out.println("PRESS 1 TO ADD  Student");
	System.out.println("PRESS 2 TO Delete  Student");
	System.out.println("PRESS 3 TO Display  Student");
	System.out.println("PRESS 4 TO Exit  App");
	int c=Integer.parseInt(br.readLine());
	if(c==1) {
		//Add Student Data
		System.out.println("Enter Student Name ");
		
		String name=br.readLine();
		
		System.out.println("Enter Student Phone Number ");
		
		String phone=br.readLine();
		
		System.out.println("Enter Student City  ");
		
		String city=br.readLine();
	
		Student s=new Student(name,phone,city);
		
		boolean ans=StudentDao.InsertStudentDB(s);
		
		if(ans) {
			System.out.println("Student Addeded Successfully...");
		}else {
			System.out.println("Somthing wrong");
		}
		System.out.println(s);
		
	}else if(c==2) {
		// delete student data
		System.out.println("Enter Student  id  to Delete ");
		int userId=Integer.parseInt(br.readLine());
		boolean f=StudentDao.deleteStudent(userId);
		if(f) {
			System.out.println("Delete.....");
		}
		else {
			System.out.println("Somthing is wrong...");
		}
	}else if(c==3) {
		// display student data
		StudentDao.showAllStudent();
		
	}else if(c==4) {
		// exit student data 
     break;
	}
	else {
		
		System.out.println("");
		
		}
	
}
                        System.out.println("Thank You for Using My  Application......");
                        System.out.println("See you Soon .....by..by.");
	}

}
