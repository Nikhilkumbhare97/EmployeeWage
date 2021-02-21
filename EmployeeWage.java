//Welcome to Employee Wage Computation Program
public class EmployeeWage {

   public static void main (String[] args) {
		//Constants
		int IS_FULL_TIME = 1;
		int WAGE_PER_HR = 20;
		//Variables
		int empHrs = 0;
		int dailyWage = 0;
		//Computation
		int empCheck = (int) Math.floor(Math.random() *10) % 2;
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is Present");
			empHrs=8;
		}else {
			System.out.println("Employee is Absent");
			empHrs=0;
		}dailyWage = empHrs * WAGE_PER_HR;
		System.out.println("Daily Employee Wage "+dailyWage);
	}
}
