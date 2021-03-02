package temperatura;

public class Celsius_fahrenheit {
	
	public static void main(String[] args) {
		
		float celsius;
		float fixo1;
		float fixo2;
		float fixo3;
		float fahrenheit;
		
		celsius = 23.5f;
		fixo1 = 9;
		fixo2 = 160;
		fixo3 = 5;
		fahrenheit = (fixo1 * celsius + fixo2) / fixo3;
		
		System.out.print("Graus em Cº: ");
		System.out.println(celsius + " ºC.");
		System.out.print("Graus em Fahrenheit: ");
		System.out.println(fahrenheit + " ºF.");
	}

}
