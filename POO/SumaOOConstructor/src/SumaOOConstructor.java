import java.util.Scanner;

public class SumaOOConstructor {

	private
	int a;
	int b;
	
	public  
	SumaOOConstructor() {
		
	}
	SumaOOConstructor(int a, int b) {
		this.a= a;
		this.b = b;
	}

	void setA(int a1) {
		this.a = a1;
	}
	void setB(int b1) {
		this.b=b1;
	}
	int getA() {
		return this.a;
	}
	int getB() {
		return this.b;
	}
	
	int FunSuma( ) {
		
		return this.a + this.b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("\nIngresa el valor a:\n");
		int a = teclado.nextInt();		
		
		System.out.print("\nIngresa el valor a:\n");
		int b = teclado.nextInt();
		
		SumaOOConstructor SumaOO = new SumaOOConstructor(a,b);
		
		System.out.print("\nEl valor de a es "+ SumaOO.getA());
		System.out.print("\nEl valor de b es "+ SumaOO.getB());
		System.out.print("\nla suma de "+ SumaOO.getA()+" + "+SumaOO.getB()+" es igual a " + SumaOO.FunSuma());
		
	}


}
