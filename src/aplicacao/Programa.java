package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import util.Calculador;

public class Programa {

	
	
	public static void main(String[] args) {
		/*método estático: aplicação no próprio programa*/		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculador calc = new Calculador();//objeto instanciado
		
		System.out.print("Entre com o valor do raio: ");
		double raio = sc.nextDouble();
		
		double c = calc.circunferencia(raio);
		double v = calc.volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n ", v);
		System.out.printf("PI valor: %.2f%n", calc.PI);
		
		sc.close();;

	}
	 

}
