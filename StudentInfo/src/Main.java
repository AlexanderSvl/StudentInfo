import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
		
	public static void main(String args[]) {
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter student name:");
		String personName = scan.nextLine();
		
		System.out.println("Enter student age:");
		Integer personAge = Integer.parseInt(scan.nextLine());
		System.out.println();
		
		Student s1 = new Student(personAge, personName);
		
		while (true) {
			System.out.println("Enter command:");
			System.out.println("1 - Add grade/s;");
			System.out.println("2 - Add interest/s;");
			System.out.println("3 - Print average grade;");
			System.out.println("4 - Print interests;");
			System.out.println("5 - Print grades;");
			System.out.println("6 - Say hello;");
			System.out.println("7 - End;");
			
			System.out.println();
			String command = scan.nextLine();
			System.out.println();
			
			if(command.equals("1")) {
				System.out.println("Enter how many grades you want to add:");
				Integer elementsLength = scan.nextInt();

				System.out.println("Enter grade/s to add:");
				
				Double[] grades = new Double[elementsLength];
				Double temp = 0.00;
				
				for (int i = 0; i < elementsLength; i++) {
					temp = scan.nextDouble();
					
					if(temp >= 2.00 && temp <= 6.00) {
						grades[i] = temp;
						scan.nextLine();
					}
					else {
						System.out.println("Invalid grade! Please, try again.");
						i--;
					}					
				}
				
				s1.AddGrades(grades);

				System.out.println();
				System.out.println("Grades added.");
				System.out.println();
			}
			else if(command.equals("2")) {
				System.out.println("Enter how many interests you want to add:");
				Integer elementsLength = scan.nextInt();

				System.out.println("Enter interests/s to add:");
				
				String[] interests = new String[elementsLength];

				for (int i = 0; i < elementsLength; i++) {
					interests[i] = scan.next();
					scan.nextLine();
				}
				
				s1.AddInterests(interests);

				System.out.println();
				System.out.println("Interests added.");
				System.out.println();
			}
			else if(command.equals("3")) {
				System.out.println(s1.PrintAverageGrade());
				System.out.println();
			}
			else if(command.equals("4")) {
				System.out.println(s1.PrintInterests());
				System.out.println();
			}
			else if(command.equals("5")) {
				System.out.println(s1.PrintGrades());
				System.out.println();
			}
			else if(command.equals("6")) {
				System.out.println(s1.SayHello());
				System.out.println();
			}
			else if(command.equals("7")) {
				System.out.println("End.");
				break;
			}
		}
		
	}
}