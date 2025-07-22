package entityclassassignment1;

import java.util.Scanner;

public class StudentDetails {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Student[] students = new Student[3];

	        for (int i = 0; i < 3; i++) {
	            System.out.println("Enter details for Student " + (i + 1) + ":");
	            System.out.print("Name: ");
	            String name = sc.nextLine();
	            System.out.print("Roll Number: ");
	            int rollNo = Integer.parseInt(sc.nextLine());
	            System.out.print("Course: ");
	            String course = sc.nextLine();

	            students[i] = new Student(name, rollNo, course);
	            System.out.println();
	        }

	        System.out.println("Student Details:");
	        for (Student s : students) {
	            s.display();
	        }

	        sc.close();
	    }
	}

