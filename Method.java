package methods;
 class Employee {
	double basicPay;
	double hra;
	double da;
	double incentive;
	
	public double getTotalSalary(){
		return basicPay + hra + da;
	}
	
	public double getTotalSalaryWithIncentive() {
		return basicPay+hra+da+incentive+2000;
	}
	
	void displayValues(){
		System.out.println("Basic Pay: " + basicPay);
		System.out.println("HRA: " + hra);
		System.out.println("DA: " + da);
	}
}

public class Method {


		public static void main(String[] args) {
			
			Employee employee = new Employee();

			employee.basicPay = 10000;
			employee.hra = 8000;
			employee.da = 2000;
            employee.incentive=10000;
			
			employee.displayValues();
			System.out.println("Total salary " + employee.getTotalSalary());
			System.out.println("Salary With Incentives "+ employee.getTotalSalaryWithIncentive());;
			
			
		}

	}

