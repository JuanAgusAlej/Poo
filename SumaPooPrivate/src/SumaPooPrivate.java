
public class SumaPooPrivate {

	private
	int a = 5;
	int b = 5;
	
	public
	int FuncSuma() {
		return this.a + this.b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SumaPooPrivate sumador = new SumaPooPrivate();
		
		System.out.println("el valor de a es "+ sumador.a);
		System.out.println("el valor de b es "+ sumador.b);
		sumador.a = 30;
		sumador.b = 74;
		
		System.out.println("El valos de la suma es " + sumador.FuncSuma());
		System.out.println("el valor de a es "+ sumador.a);
		System.out.println("el valor de b es "+ sumador.b);
	
	}

}
