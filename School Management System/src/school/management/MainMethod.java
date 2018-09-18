package school.management;

import java.util.ArrayList;
import java.util.List;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher swathi = new Teacher(1, "Swathi", 9000);
		Teacher sherly = new Teacher(2, "Sherly", 10000);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(swathi);
		teacherList.add(sherly);
		
		Student vishnu = new Student(1, "Vishnu", 8);
		Student ashwin = new Student(2, "Ashwin", 12);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(vishnu);
		studentList.add(ashwin);
		
		School sch = new School(studentList, teacherList);
		
		Teacher raveena = new Teacher(3, "Raveena", 5000);
		sch.addTeacher(raveena);
		
		vishnu.payFees(3000);
		ashwin.payFees(4000);
		System.out.println("School has earned : $" + sch.getTotalMoneyEarned());
		
		System.out.println("-- Making School Pay Salary --");
		swathi.receiveSalary(swathi.getSalary());
		System.out.println("School has spent salary to : " + swathi.getName() + " and now has " + sch.getTotalMoneyEarned());
		System.out.println(swathi);
		System.out.println(vishnu);
		System.out.println(teacherList);
	}

}
