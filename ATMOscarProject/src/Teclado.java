import java.util.Scanner;

public class Teclado {
	private Scanner entrada; 


	public Teclado() {
		entrada = new Scanner(System.in);
	} 

	
	public int obtenerEntrada() {
		return entrada.nextInt(); 
	} 
}