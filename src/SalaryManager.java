
public class SalaryManager {

	

	public static void main(String[] args) {
		SalaryManager sal = new SalaryManager();

		System.out.println("Result:" + sal.getMonthlySalary(20000000));
	}

	public double getMonthlySalary(int YearlySalary) {

		double monthlySalary = YearlySalary / 12;
		System.out.println("Monthly salary original:" + monthlySalary);

		double �ٷμҵ漼 = calculateTax(monthlySalary); // �� Ŭ������ �ִ� method�� �����Ӱ� ��밡���ϴ�.
		double ���ο��ݼ� = calculateNationalPension(monthlySalary);
		double �ǰ����輼 = calculateHealthInsurance(monthlySalary);
		double total = �ٷμҵ漼 +���ο��ݼ� + �ǰ����輼;
		
		System.out.println("Tax per month:"+�ٷμҵ漼);
		System.out.println("NationalPension per month:"+���ο��ݼ�);
		System.out.println("HealthInsurance per month:"+�ǰ����輼);
		
		monthlySalary -= total;

		return monthlySalary;
	}

	public double calculateTax(double parammonthlySalary) {/*�Ķ���Ͱ��� ����. ���� ���������� ����ؼ� �����ϰ� ��������, �������ҿ� �Ķ���ͺ������� ����ϱ�*/

		double �ٷμҵ漼 = parammonthlySalary * 0.125;

		return �ٷμҵ漼;
	}

	public double calculateNationalPension(double parammonthlySalary) {

		double ���ο��ݼ� = parammonthlySalary * 0.081;

		return ���ο��ݼ�;
	}

	public double calculateHealthInsurance(double parammonthlySalary) {

		double �ǰ����輼 = parammonthlySalary * 0.135;

		return �ǰ����輼;
	}

}
