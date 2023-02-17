
public class Ejercicio002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x=5;
		byte y=2;
		byte aux=0;
		
		System.out.println("Valor inicial de x " + x);
		System.out.println("Valor inicial de y " + y);
		
		aux = x;
		x=y;
		y=aux;
		
		System.out.println("Valor final de x " + x);
		System.out.println("Valor final de y " + y);
		
		
	}

}
