import java.util.Scanner;

public class Alumno {

	private
		String name;
		int age;
		double note;
	public 
	Alumno() {
		this.name = "Juan" ;
		this.note = 8.25;
		this.age = 23;
	}
	Alumno(String nameInput, double noteInput, int ageInput) {
		this.name = nameInput ;
		this.note = noteInput;
		this.age = ageInput;
	}
	double getNote () {
		return this.note;
	}
	int getAge () {
		return this.age;
	}
	String getName () {
		return this.name;
	}
	void setNote (double noteInput) {
		this.note = noteInput;
	}
	void setAge (int ageInput) {
		this.age = ageInput;
	}
	void setName (String nameInput) {
		this.name = nameInput;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Se creara un Almuno, presionar Y para continuar o N para cancelar");
		char continuarChar = teclado.next().charAt(0);
		while (continuarChar != 'y' && continuarChar != 'Y' && continuarChar != 'n' &&continuarChar != 'N' ) {
			System.out.println("Ingresar  Y para continuar o N para salir");
			continuarChar = teclado.next().charAt(0);
		}
		if(continuarChar == 'y' ||continuarChar == 'Y' ) {			
			Alumno alum1 = new Alumno();
			System.out.println("Nombre: " + alum1.getName() );
			System.out.println("Edad: " + alum1.getAge() );
			System.out.println("Promedio: " + alum1.getNote());
			System.out.println("Ingresar nueva edad: ");
			int egeInput;
			do {
			while (!teclado.hasNextInt()) {
				System.out.println("Ingresar un numer ");
				teclado.next();
			}
			egeInput = teclado.nextInt();
			if(egeInput <1) {
				System.out.println("Ingreasa un numero mayor a 1");
			}
			}while(egeInput < 1);
			System.out.println("Se modificara la edad de " + alum1.getAge() + " a " + egeInput + "(Y / N)" );
			continuarChar = teclado.next().charAt(0);
			while (continuarChar != 'y' && continuarChar != 'Y' && continuarChar != 'n' &&continuarChar != 'N' ) {
				System.out.println("Ingresar  Y para modificar o N para dejar como esta ");
				continuarChar = teclado.next().charAt(0);
			}
			if(continuarChar == 'y' || continuarChar == 'Y') {
				alum1.setAge(egeInput);
			}
			System.out.println("Ingresar nuevo promedio: ");
			double noteInput;
			do {
			while ((!teclado.hasNextDouble())) {
				System.out.println("Ingresar un numer con coma ");
				teclado.next();
			}
			noteInput = teclado.nextDouble();			
			if(noteInput<0) {
				System.out.println("Ingreasa un numero mayor a 0");
			}
			}while(noteInput < 0);
			System.out.println("Se modificara el promedio de " + alum1.getNote() + " a " + noteInput + "(Y / N)" );
			continuarChar = teclado.next().charAt(0);
			while (continuarChar != 'y' && continuarChar != 'Y' && continuarChar != 'n' &&continuarChar != 'N' ) {
				System.out.println("Ingresar  Y para modificar o N para dejar como esta ");
				continuarChar = teclado.next().charAt(0);
			}
			if(continuarChar == 'y' || continuarChar == 'Y') {
				alum1.setNote(noteInput);
			}
			System.out.println("Desea cargar otro alumno (Y/N)");
			continuarChar = teclado.next().charAt(0);
			while (continuarChar != 'y' && continuarChar != 'Y' && continuarChar != 'n' &&continuarChar != 'N' ) {
				System.out.println("Ingresar  Y para modificar o N para dejar como esta ");
				continuarChar = teclado.next().charAt(0);
			}
		}
		if(continuarChar == 'y' ||continuarChar == 'Y' )
		{
			Alumno alum2 = new Alumno("Ana", 9.25,22);
			System.out.println("Nombre: " + alum2.getName() );
			System.out.println("Edad: " + alum2.getAge() );
			System.out.println("Promedio: " + alum2.getNote());
			System.out.println("Ingresar nueva edad: ");
			
		}
		teclado.close();
	}

}
