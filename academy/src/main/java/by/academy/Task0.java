package by.academy;

import java.util.Scanner;

public class Task0 {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string: ");
		String month=sc.next();
				
			/*	if (sc.hasNextInt()) {
			int str=sc.nextInt();
		System.out.println("Your string is: +str");}
		
		String str=sc.next();
	*/	
		month=month.toLowerCase();
		switch (month) {
		case "������":
			System.out.println("1 �����");
			break;
		case "�������":
			System.out.println("2 �����");
			break;
		case "����":
			System.out.println("3 �����");
		case "������":
			System.out.println("4 �����");
			break;
		case "���":
			System.out.println("5 �����");
		case "����":
			System.out.println("6 �����");
			
			default:
			System.out.println("��� �� �����");
		}
		
				
		sc.close();
		
		
		
	}
	}

}
