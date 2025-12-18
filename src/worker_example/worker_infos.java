package worker_example;

public class worker_infos {
	
	public int number;
	
	public String name;

	public String surname;
	
	public int experiment;
	
	public double salary;
	
	public worker_infos() {
		
	}
		
	public worker_infos(int number, String name, String surname, int experiment, double salary) {
		
		this.number = number;
		this.name = name;
		this.surname = surname;
		this.experiment = experiment;
		this.salary = salary;
		
	}
	
	public void write () {
		
		System.out.println("*********** Worker ***********");
		System.out.println("Number     : " + number);
		System.out.println("Name       : " + name);
		System.out.println("Surname    : " + surname);
		System.out.println("Experiment : " + experiment);
		
		
	}
	
	public void add_money_to_salary(double added) {
		
		double first = salary;
		salary +=added;
		System.out.println("Your salary was " + first + " TL. Now it is " + salary + " TL.");
	}
	
	public void reboot (String operating_system, String who) {
		
		System.out.println(who + " is rebooting " + operating_system + " operating system now.");
		
	}
}
