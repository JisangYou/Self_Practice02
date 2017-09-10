
public class OperatorComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OperatorComparision operator = new OperatorComparision();
		operator.comparision();
		operator.comparision2();
	}

	public void comparision() {

		int intValue1 = 1;
		int intValue2 = 2;
		int intValue3 = 1;

		System.out.println(intValue1 == intValue2);
		System.out.println(intValue1 == intValue3);

		System.out.println(intValue1 != intValue2);
		System.out.println(intValue1 != intValue3);
	}

	public void comparision2() {

		char charValue = 'a';
		System.out.println(97==charValue);
		int intValue = 1;
		double doubleValue = 1.0;
		System.out.println(intValue == doubleValue);
		
		
		boolean booleanValue1= true;
		boolean booleanValue2= false;
		
		System.out.println(booleanValue1 == booleanValue2);
		
	}
}



























