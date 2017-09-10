
public class OperatorCompound {

	int intValue = 10;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var =5;
		OperatorCompound comp = new OperatorCompound();
		System.out.println(comp.plus(var));
		System.out.println(comp.sub(var));
		System.out.println(comp.mul(var));
		System.out.println(comp.div(var));
		System.out.println(comp.rem(var));
		
	}

	public int plus(int var) {

		intValue += var;
		
		return intValue;
	}

	public int sub(int var) {

		intValue -= var;
		
		return intValue;
	}

	public int mul(int var) {

		intValue *= var;
		
		return intValue;
	}

	public int div(int var) {

		intValue /= var;
		
		return intValue;
	}

	public int rem(int var) {

		intValue %= var;
		
		return intValue;
	}

}
