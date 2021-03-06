package school.management;

import java.util.List;

public class School {
	private List<Student> students;
	private List<Teacher> teachers;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	

	public School(List<Student> students, List<Teacher> teachers)
	{
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent =  0;
	}


	public List<Student> getStudents() {
		return students;
	}


	public void addStudent(Student student) {
		students.add(student);
	}


	public List<Teacher> getTeachers() {
		return teachers;
	}


	public void addTeacher(Teacher teacher)
	{
		teachers.add(teacher);
	}


	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}


	public static void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned += moneyEarned;
	}


	public int getTotalMoneySpent() {
		return totalMoneyEarned;
	}


	public void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned -= moneySpent;
	}
	
}
