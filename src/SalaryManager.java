
public class SalaryManager {

	

	public static void main(String[] args) {
		SalaryManager sal = new SalaryManager();

		System.out.println("Result:" + sal.getMonthlySalary(20000000));
	}

	public double getMonthlySalary(int YearlySalary) {

		double monthlySalary = YearlySalary / 12;
		System.out.println("Monthly salary original:" + monthlySalary);

		double 근로소득세 = calculateTax(monthlySalary); // 한 클래스에 있는 method는 자유롭게 사용가능하다.
		double 국민연금세 = calculateNationalPension(monthlySalary);
		double 건강보험세 = calculateHealthInsurance(monthlySalary);
		double total = 근로소득세 +국민연금세 + 건강보험세;
		
		System.out.println("Tax per month:"+근로소득세);
		System.out.println("NationalPension per month:"+국민연금세);
		System.out.println("HealthInsurance per month:"+건강보험세);
		
		monthlySalary -= total;

		return monthlySalary;
	}

	public double calculateTax(double parammonthlySalary) {/*파라미터값도 변수. 굳이 전역변수를 사용해서 복잡하게 하지말고, 적재적소에 파라미터변수값을 사용하기*/

		double 근로소득세 = parammonthlySalary * 0.125;

		return 근로소득세;
	}

	public double calculateNationalPension(double parammonthlySalary) {

		double 국민연금세 = parammonthlySalary * 0.081;

		return 국민연금세;
	}

	public double calculateHealthInsurance(double parammonthlySalary) {

		double 건강보험세 = parammonthlySalary * 0.135;

		return 건강보험세;
	}

}
