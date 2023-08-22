
public class SumaPoo {

	int a =5;
	int b = 5;
	int FuncSuma() {
		return this.a + this.b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumaPoo sumador = new SumaPoo();
		int suma = 0;
		suma = sumador.FuncSuma();
		System.out.println("La suma es " + suma);
	}

}
