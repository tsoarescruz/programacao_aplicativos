import java.io.*;
import java.util.Scanner;
import java.util.Formatter;

public class calculaconsumo {

	public static void main(String[] args)  throws IOException{
	//Algoritmo "Calcula Consumo"
	// Disciplina   : [Programação de Aplicativos]
	// Descrição   : Calcular o consumo de um aparelho elétrico ou eletroeletrônico
	// Autor(a)    :  Andre Luiz Silva Botelho
	// Data atual  : 18/03/2016
	//Var

	// Seção de Declarações das variáveis
	int potencia, temp; 
	double consumo, preco;
	Scanner sc = new Scanner(System.in);
	//Inicio
	// Seção de Comandos, procedimento, funções, operadores, etc...

	System.out.println("digite a potencia do aparelho");
	potencia = Integer.parseInt(sc.nextLine());;
	System.out.println("digite quantas horas por dia o aparelho permanece ligado:");
	temp = Integer.parseInt(sc.nextLine());
	consumo = potencia * temp / 1000;
	System.out.println("digite quantos dias por semana o aparelho permanece ligado:");
	temp = Integer.parseInt(sc.nextLine());;
	temp = temp * 4;
	temp = temp + 2;
	consumo = consumo * temp;
	temp = 0;
	while (( temp != 1) && (temp != 2)) {
		System.out.println("Qual sua operadora de energia elétrica?");
		System.out.println("digite 1 para Light ou digite 2 para Ampla");
	    temp = Integer.parseInt(sc.nextLine());;
	};

	if (temp == 1 ) {
	   preco = consumo * 0.57981 ;  // tarifa sem icms
	}else{
	     preco = consumo * 0.5915;
	};

	System.out.printf("%s%2.2f%s%2.2f%s\n","Este aparelho consome " , consumo," kw/h ao custo de R$ ",preco," por mês.");

	System.out.println("o custo médio de produção desta energia consumida é:");
	preco = consumo * 0.24;
	System.out.printf("%s%2.2f%s\n", "R$ ", preco," reais se produzida em usina hidrelétrica.");
	preco = consumo * 0.36;
	System.out.printf("%s%2.2f%s\n"," R$ ", preco," reais se produzida em usina termoeletrica a carvão, nuclear ou gas natural.");
	preco = consumo * 0.42;
	System.out.printf("%s%2.2f%s\n"," R$ ", preco," reais se produzida em usina eólica.");
	preco = consumo * 0.30;
	System.out.printf("%s%2.2f%s\n"," R$ ", preco," reais se produzida em usina de biomassa e.");
	preco = consumo * 0.555;
	System.out.printf("%s%2.2f%s\n"," R$ ", preco," reais se produzida em usina solar.");

	//fimalgoritmo
	sc.close();
	}
}