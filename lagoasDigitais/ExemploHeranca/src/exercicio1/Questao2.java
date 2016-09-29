package exercicio1;

import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x;
		System.out.println("Digite um número");
		x = ler.nextInt();
		verSeEhMaiorQueZero(x);
	}
	
	public static void verSeEhMaiorQueZero(int num){
		Scanner ler = new Scanner(System.in);
		int xTemp=num;
		if(xTemp>0){
			System.out.println("Maior que zero");
		}else{
			System.out.println("Digite um número");
			xTemp = ler.nextInt();
			verSeEhMaiorQueZero(num);
		}
		
	}
}
