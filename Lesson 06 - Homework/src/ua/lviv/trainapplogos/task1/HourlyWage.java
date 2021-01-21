package ua.lviv.trainapplogos.task1;

public class HourlyWage extends Worker implements Salary {
	
	HourlyWage() {}
	
	HourlyWage(String name) {
		super.setName(name);
	}
	
	public String getName() {
		return super.getName();
	}
	
	@Override
	public double salary(int days, int hoursPerDay) {	
		System.out.println("This method is acceptable for hourly wage workers only!");
		return 0;
	}

	@Override
	public double salary(int hours) {
		return (hours * 10);
	}
}
