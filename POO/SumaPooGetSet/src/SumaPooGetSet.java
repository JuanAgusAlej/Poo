
public class SumaPooGetSet {

	private
	int a ;
	int b ;
	
	public
	void setA (int aInput){
		this.a = aInput;
	}
	
	int getA (){
		return this.a;
	}
	
	void setB (int bInput){
		this.b = bInput;
	}
	
	int getB(){
		return this.b;
	}
	int FunSuma () {
		return this.a + this.b ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumaPooGetSet sumador = new SumaPooGetSet();
		
		sumador.setA(54);
		sumador.setB(54);
		
		System.out.println("La Variable A vale: " + sumador.getA());
		System.out.println("La Variable B vale: " + sumador.getB());
		System.out.println("La suma es "+ sumador.FunSuma());
		
		
	}

}
