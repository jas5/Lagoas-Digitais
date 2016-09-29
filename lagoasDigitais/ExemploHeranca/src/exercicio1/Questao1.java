package exercicio1;

import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		int x,y,soma;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		x = entrada.nextInt();
		System.out.println("Digite um número: ");
		y = entrada.nextInt();
		
		soma = x+y;
		
		System.out.println("Soma: "+soma);
	}
}
