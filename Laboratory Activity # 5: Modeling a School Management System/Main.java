package TeacherStudentAssignment;

import java.util.Scanner;
class Person {
	
	String name;
	int age;
	String gender;
	
	void displayInfo () {
		
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		
	}
	
	
}

class Student extends Course {
	
	
	int studentId;
	
	Student(String name,int age,String gender,int studentId){
		
		super.name = name;
		super.age = age;
		super.gender=gender;
		this.studentId=studentId;
		
	}
	
	void displayStudent() {
		
		System.out.println("--- Student Information ---");
		super.displayInfo();
		System.out.println("Student ID: "+studentId);
		
	}
	
}

class Teacher extends Course {
	
		String department;
		
		Teacher(String name,int age,String gender,String department,String [] cc1,String [] cn1,String [] cc2,String [] cn2){
			
			super.name = name;
			super.age = age;
			super.gender=gender;
			this.department=department;
			
				super.courseCode = cc1;
				super.courseCode= cc1;
				super.courseName= cn2;
				super.courseName= cn2;
				
			
			
		}
	
		void displayTeacher() {
			
			System.out.println("--- Teacher Information ---");
			super.displayInfo();
			System.out.println("Department: "+department+"\nCourses Handled: ");
			super.displayCourse();
			
			
		}
	
}

class Course extends Person {
	
	String [] courseCode;
	String [] courseName;
	
	void displayCourse(/*String cc1,String cn1,String cc2,String cc3*/) {
		
		System.out.println(courseCode[0]+" - "+courseName[0]);
		System.out.println(courseCode[1]+" - "+courseName[1]);
		
	}
	
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String [] coursec= {"CZ123","CZ067"};
		String [] coursen= {"Programming Fundamentals","Discrete Structure"};
		Student student = new Student("Mark Joshua",20,"Male",202411426);
		Teacher teacher = new Teacher("Mr. Juan Delacruz",37,"Male","Computer Studies",coursec,coursen,coursec,coursen);
		
		System.out.println("--- School Management System ---\n");
		System.out.println("1. Display Student Information.\n2. Display Teacher Information.\nInput Number....");
		String option = sc.nextLine();
		switch (option) {
			
		case "1" : student.displayStudent();
					break;
		case "2" : teacher.displayTeacher(); 
					break;
		
		
		}
		
		
	
	}

}
