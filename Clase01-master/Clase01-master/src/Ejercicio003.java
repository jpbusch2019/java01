
public class Ejercicio003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sueldo=0;
		float d1=0;
		float d2=0;
		float d3=0;
		float sb=0;
		
		sueldo = 2500;
		
		d1 = sueldo * 0.10f;
		d2 = sueldo * 0.05f;
		d3 = (sueldo - d1 - d2)*0.03f;
		sb = sueldo - d1 - d2 - d3;
		
		System.out.println("Sueldo "+ sueldo);
		System.out.println("d1 "+ d1);
		System.out.println("d2 "+ d2);
		System.out.println("d3 "+ d3);
		System.out.println("Sueldo neto "+ sb);
	}

}
