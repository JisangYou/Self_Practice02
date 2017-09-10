
public class OperatorConditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OperatorConditional operator = new OperatorConditional();
		operator.condition();
	}

	public void condition() {
		boolean x = true;
		boolean y = true;
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println("-----");

		x = false;
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println("-----");

		y = false;
		System.out.println(x && y);
		System.out.println(x || y);

	}

}
