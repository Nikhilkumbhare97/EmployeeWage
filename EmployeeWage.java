//Welcome to Employee Wage Computation Program
public class EmployeeWage {

   public static void main (String[] args) {
		//Constants
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int WAGE_PER_HR = 20;
		int DAYS_IN_MONTH = 20;
		int MAX_HRS = 100;
		//Variables
		int empHrs = 0;
		int dailyWage = 0;
		int days = 1;
		int hours = 0;
		int monthlyWage = 0;
		//Computation
		while (days <= DAYS_IN_MONTH && hours != MAX_HRS) {
			int empCheck = (int) Math.floor(Math.random() *10) % 3;
			switch (empCheck)
			{
				case 1:
					//Employee is Full Time
					empHrs=8;
					break;
				case 2:
					//Employee is Part Time
					empHrs=4;
					break;
				default:
					//Employee is Absent
					empHrs=0;
			}
			System.out.println("Day "+days);
			days = days+1;
			hours = hours+empHrs;
			dailyWage = empHrs * WAGE_PER_HR;
			System.out.println("Daily Employee Wage "+dailyWage);
			monthlyWage = monthlyWage+empHrs*WAGE_PER_HR;
		}
		System.out.println("Monthly Employee Wage "+monthlyWage);
	}
}
