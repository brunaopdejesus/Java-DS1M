package circunferencia;

public class Circulo {
	
	public static void main(String[] args) {
		
		float raio;
		final float PI;
		float area;
		
		raio = 5;
		PI = 3.14f;
		area = PI * (raio * raio);
				
		System.out.print("Área: ");
	    System.out.println(area);
	    System.out.print("Raio do círculo: ");
	    System.out.println(raio);	
	    System.out.print("PI: ");
	    System.out.println(PI);	
	}

}
