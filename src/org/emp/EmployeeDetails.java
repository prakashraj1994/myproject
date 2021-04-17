package org.emp;

import java.util.Scanner;

public class EmployeeDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee Id");
		int empId = sc.nextInt();
		System.out.println("Employee Id is " + empId);

		System.out.println("\nEnter Employee Email");
		String empEmail = sc.next();
		System.out.println("Employee Email Id is " + empEmail);

		System.out.println("\nEnter Employee Phone No");
		long empPhoneno = sc.nextLong();
		System.out.println("Employee Phone Number is " + empPhoneno);

		System.out.println("\nEnter Employee Salary");
		float empSalary = sc.nextFloat();
		System.out.println("Employee Salary is " + empSalary);

		System.out.println("\nEnter Employee Gender");
		String empGender = sc.next();
		System.out.println("Employee Gender is " + empGender);

		System.out.println("\nEnter Employee City");
		String empCity = sc.next();
		System.out.println("Employee City is " + empCity);

	}
}
