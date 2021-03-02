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
		
		System.out.println(area);
		
		System.out.println(perimetro);
   }

}