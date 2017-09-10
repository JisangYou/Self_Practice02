
public class OperatorUnary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OperatorUnary operator = new OperatorUnary();
		operator.unary();
	}
	
	public void unary(){
		int intValue =- 10;
		int result =+ intValue;
		System.out.println(result);
		result = -intValue;
		System.out.println(result);
	}

}
