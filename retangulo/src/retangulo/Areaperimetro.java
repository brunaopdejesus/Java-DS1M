package retangulo;

public class Areaperimetro {
	
   public static void main(String[] args) {
		
		float lmaior;
		float lmenor;
		float area;
		float perimetro;
			
		lmaior = 8;
		lmenor = 6;
		area = lmaior * lmenor;
		perimetro = lmaior + lmenor + lmaior + lmenor;
		
		System.out.print("Área do retângulo: ");
		System.out.println(area + " metros.");
		System.out.print("Perímetro do retângulo: ");
		System.out.println(perimetro + " metros.");
		
   }

}