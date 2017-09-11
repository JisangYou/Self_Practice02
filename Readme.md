# 연산자 연습문제
- 직원들의 연봉을 근로소득세율,국민연금세율,건강보험료율을 적용하여 구하는 프로그램

```java
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

	public double calculateTax(double parammonthlySalary) {/*파라미터값도 변수. 적재적소에 파라미터변수값을 사용*/

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
```
- 편의상 변수이름은 한글로 함.
- calculateTax메소드는 근로소득세를 연산하는 메소드
- calculateNationalPension메소드는 국민연금세를 연산하는 메소드
- calculateHealthInsurance메소드는 건강보험세를 연산하는 메소드
- getMonthlySalary 메소드는 calculateTax,calculateNationalPension,calculateHealthInsurance메소드에서
리턴받은 값을 처리하는 메소드
- 각 메소드들로 부터 리턴받은 값들을 근로소득세,국민연금세,건강보험세에 담고 다 더함
-더한 값들은 total변수에 담아, monthlySalary변수에서 빼주고
return값으로 넘김
