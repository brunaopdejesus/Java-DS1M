package imc;

public class Imc {

	public static void main(String[] args) {
	
	   float peso;
	   float altura;
	   float IMC;
	   
	   peso = 72;
	   altura = 1.64f;
	   IMC = peso / (altura * altura);
         
	   System.out.print("Resultado do IMC: ");
	   System.out.println(IMC);
	}
	
}
