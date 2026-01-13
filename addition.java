package lambda;

import java.util.Scanner;

public class addition {


	   public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter age: ");
	        int age = sc.nextInt();

	        System.out.print("Enter salary: ");
	        double salary = sc.nextDouble();

	        System.out.println("\nName: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Salary: " + salary);
	    }
	}


output

Enter name: priscilla
Enter age: 70
Enter salary: 100000

Name: priscilla
Age: 70
Salary: 100000.0



