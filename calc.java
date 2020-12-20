package com.company;

import java.util.Scanner;

public class file {
	public static void main(String[] args) {
		while (true) {
			String invalid = "\nInvalid number...";
			Scanner input = new Scanner(System.in);
			Integer question;
			System.out.print("\n\n1.add, 2.minus, 3.divide, 4.multiply, 5.exit: ");
			question = input.nextInt();
			if (question.equals(1)) {
				int num1;
				System.out.print("\nnum1: ");
				num1 = input.nextInt();
				int num2;
				System.out.print("num2: ");
				num2 = input.nextInt();
				int total = (num1 + num2);
				System.out.print(total);
			}
			if (question.equals(2)) {
				int num1;
				System.out.print("\nnum1: ");
				num1 = input.nextInt();
				int num2;
				System.out.print("num2: ");
				num2 = input.nextInt();
				int total = (num1 - num2);
				System.out.print(total);
			}
			if (question.equals(3)) {
				int num1;
				System.out.print("\nnum1: ");
				num1 = input.nextInt();
				int num2;
				System.out.print("num2: ");
				num2 = input.nextInt();
				int total = (num1 / num2);
				System.out.print(total);
			}
			if (question.equals(4)) {
				int num1;
				System.out.print("\nnum1: ");
				num1 = input.nextInt();
				int num2;
				System.out.print("num2: ");
				num2 = input.nextInt();
				int total = (num1 * num2);
				System.out.print(total);
			}
			if (question.equals(5)) {
				System.exit(1);
			}
		}
	}
}
