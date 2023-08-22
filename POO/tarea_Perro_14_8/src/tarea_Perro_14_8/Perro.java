package tarea_Perro_14_8;

import java.util.Scanner;

public class Perro {
	private
	 String name;
	public
	Perro() {
		this.name = "Spike";
	}
	Perro(String name){
		this.name = name;
	}
	
	void SetName(String name){
		this.name = name;
	}
	
	String GetName(){
		return this.name;
	}
	String Ladrar(){
		return "Gua gua"; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro perro = new Perro();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("El perro se llama " + perro.GetName());
		
		System.out.println("Ingrese el nombre del perro: ");
		String name = teclado.nextLine();
		Perro perroDos = new Perro(name);
		
		System.out.println("El perro se llama " + perroDos.GetName());
		System.out.println("El perro ladra "+ perroDos.Ladrar());
		

		
		
		
	}

}
