package exercicio1;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class Teste {
//	1) Faça uma Programa que receba a idade e o 
//	estado civil(C - casado, S - solteiro, V - viúvo 
//	e D – desquitado ou separado) de 20 pessoas. 
//	Calcule e imprima:
//		a) a quantidade de pessoas casadas;
//		b) a quantidade de pessoas solteiras;
//		c) a média das idades das pessoas viúvas;
//		d) a porcentagem de pessoas desquitadas ou separadas dentre todas as pessoas analisadas.
	public static void main(String[] args) {
		String estadoCivil;
		int contSolteiro=0, contCasado=0, contViuvo=0, contSeparado=0,contIdade;
		int idade;
		float mediaIdades,porcentagemSeparadas;
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite a Idade: ");
			idade = entrada.nextInt();
			System.out.println("Digite o Estado Civil: C - casado, S - solteiro, V - viúvo e D – Separado");
			estadoCivil = entrada.next();
			
			if(estadoCivil.equals("C")){
				contCasado++; // contSolteiro= contSolteiro+1;
			}else{
				if(estadoCivil.equals("S")){ //
					contSolteiro++;
				}else{
					if(estadoCivil.equals("V")){
						contViuvo++;
					}else{
						if(estadoCivil.equals("D")){
							contSeparado++;
						}
					}
				}
			}
		}
		System.out.println("Quantidade de pessoas Casadas: " + contCasado);
		System.out.println("Quantidade de Pessoas Solteiras: " + contSolteiro);
		System.out.println("Médias idade viúvas: " + (contViuvo/5));
		System.out.println("Porcentagem pessoas separadas: " + (contSeparado));
	}

	public static int divisao(int x, int y) {
		// a recursividade é interrompida quando y for igual a 0
		Scanner entrada = new Scanner(System.in);
		if (y == 0) {
			System.out.println("Digite um número: ");
			y = entrada.nextInt();
			return divisao(x, y);
		} else {
			return x / y; // efetua uma nova chamada recursiva
		}
	}
}
