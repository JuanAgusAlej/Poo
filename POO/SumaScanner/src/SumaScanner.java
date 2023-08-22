import java.util.Scanner;

public class SumaScanner {

	private
	int a;
	int b;
	int suma;
	
	public 
	
	void setA (int aInput) {
		this.a = aInput;
	}
	void setB (int bInput) {
		this.b = bInput;
	}
	
	int getA () {
		return this.a;
	}
	int getB () {
		return this.b;
	}
	int getSuma () {
		return this.suma;
	}
	
	void FuncSuma ( ) {
		this.suma = this.a + this.b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			SumaScanner sumador = new SumaScanner();
			Scanner teclado = new Scanner(System.in);
			System.out.println("ingrese un numero entero: \n");
			int a = teclado.nextInt();
			System.out.println("ingrese un numero entero: \n");
			int b = teclado.nextInt();
			
			sumador.setA(a);
			sumador.setB(b);
			
			sumador.FuncSuma();
			
			System.out.println("El valor de la suma es "+sumador.getSuma());
			teclado.close();
		
	}

}
