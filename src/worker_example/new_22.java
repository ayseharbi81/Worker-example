package worker_example;

import java.util.Scanner;

public class new_22 {

	public static void main(String[] args) {
		
		System.out.println("     ********* Welcome *********\n");

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("No         : ");
		int no = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Name       : ");
		String Name = scanner.nextLine();
		
		System.out.print("Surname    : ");
		String Surname = scanner.nextLine();
		
		System.out.print("Experiment : ");
		int Experiment = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Salary     : ");
		double Salary = scanner.nextDouble();
		scanner.nextLine();
		
		
		worker_infos worker1 = new worker_infos(no, Name, Surname, Experiment, Salary);
				
		
		String process = "\n\n1) Show worker infos.\n"
				+ "2) Increase the salary.\n"
				+ "3) Reboot.";
		
		System.out.println(process);
	
		System.out.print("Choose the process you wanna do: ");
		int a = scanner.nextInt();
		scanner.nextLine();
		
		switch (a) {
			case 1: 
				worker1.write();
			break;
			case 2: 
				System.out.print("Please write how much you wanna increase the salary: ");
				double b = scanner.nextDouble();
				scanner.nextLine();	
				worker1.add_money_to_salary(b);
			break;
			case 3: 
				System.out.println("Who will reboot the system: ");
				String who = scanner.nextLine(); 
			
				System.out.print("Please write the operating system that you wanna reboot: ");
				String operating_system = scanner.nextLine();				
				worker1.reboot(operating_system, who);
			break;

			default:
				System.out.println("You choosed a wrong option. You have to enter the system again.");
			break;
		}
		
		
		}
		
		
	}


