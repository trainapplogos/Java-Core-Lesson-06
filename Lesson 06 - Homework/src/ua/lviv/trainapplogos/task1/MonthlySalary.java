package ua.lviv.trainapplogos.task1;

public class MonthlySalary extends Worker implements Salary {
	
	MonthlySalary() {};
	
	MonthlySalary(String name) {
		super.setName(name);
	}
	
	public String getName() {
		return super.getName();
	}
	
	@Override
	public double salary(int days, int hoursPerDay) {
		return (days * hoursPerDay * 10);
	}

	@Override
	public double salary(int hours) {	
		System.out.println("Error! This method is acceptable for monthly salary workers only!");
		return 0;
	}

	
	
}
