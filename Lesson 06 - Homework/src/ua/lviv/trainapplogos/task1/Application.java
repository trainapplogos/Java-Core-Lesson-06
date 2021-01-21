package ua.lviv.trainapplogos.task1;

public class Application {
	
	static void getHourlyWage(String name, HourlyWage s, int hours) {
		System.out.println("Hourly wage for " + name + " for " + hours + " hours at $10 per hour is equal $" + s.salary(hours));
	} 
	
	static void getSalary(String name, MonthlySalary s, int days, int hoursPerDay) {
		System.out.println("Monthly salary for " + name + " for " + days + " days with " + hoursPerDay + " hours per day at $10 per hour is equal $" + s.salary(days, hoursPerDay));	
	}
	
	public static void main(String[] args) {
		
		HourlyWage firstWorker = new HourlyWage("Ivan"); // погодинний працівник
		MonthlySalary secondWorker = new MonthlySalary("Petro");

		getHourlyWage(firstWorker.getName(), firstWorker, 148);
		getSalary(secondWorker.getName(), secondWorker, 24, 8);
		
	}

}
