package br.com.erickfreire.analisedenotas;

import java.util.Scanner;

public class AnaliseDeNotas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int passou = 0;
		int falhou = 0;
		int contaEstudante = 1;
		int resultado;
		
		System.out.println("Programa que analisa quantos alunos passaram na disciplina: ");
		
		while(contaEstudante <= 10) {
			System.out.print("Digite 1 para passou ou 2 para falhou: ");
			resultado = entrada.nextInt();
			
			if(resultado == 1)
				passou = passou + 1;
			else
				falhou = falhou + 1;
			
			contaEstudante = contaEstudante + 1;
			
		}
		
		System.out.printf("Passou: %d%nFalhou: %d%n", passou, falhou);
		
		if(passou > 8)
			System.out.println("Bonus para o professor!");

	}

}
