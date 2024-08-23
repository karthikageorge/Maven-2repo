package methods;

public class Multi_Div_Sub {
	static int a=20,b=30,c;
	public static void displaymul() {
		c=a*b;
		System.out.println("Multiplication= "+c);
		
	}
	public static void displaydiv() {
		c=b/a;
		System.out.println("Division="+c);
		
	}
	public static void dispalysub() {
		c=b-a;
		System.out.println("Substration="+c);
	}

	public static void main(String[] args) {
		Multi_Div_Sub.displaymul();
		Multi_Div_Sub.displaydiv();
		Multi_Div_Sub.dispalysub();

	}

}
