//Welcome to Employee Wage Computation Program
public class EmployeeWage {

   public static void main (String[] args) {
		//Constants
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int WAGE_PER_HR = 20;
		//Variables
		int empHrs = 0;
		int dailyWage = 0;
		//Computation
		int empCheck = (int) Math.floor(Math.random() *10) % 3;
		switch (empCheck)
		{
			case 1:
				System.out.println("Employee is Present Full Time");
				empHrs=8;
				break;
			case 2:
				System.out.println("Employee is Present Part Time");
				empHrs=4;
				break;
			default:
				System.out.println("Employee is Absent");
				empHrs=0;
		}dailyWage = empHrs * WAGE_PER_HR;
		System.out.println("Daily Employee Wage "+dailyWage);
	}
}
