package br.com.stefanini.projetoprova.main;

import java.util.Scanner;

import br.com.stefanini.projetoprova.model.Prova;

public class ExecucaoProva {

	public static void main(String[] args) {
		int nota =0;
		String resposta1, resposta2, resposta3, resposta4;
		Scanner ler = new Scanner(System.in);
		Prova p = new Prova(1,"Prova sobre Star Wars");
		
		System.out.println("Bem vindo a "+ p.getNomeProva() + ", começa"
				+ " agora sua avaliação!");
		
		System.out.println("Pergunta 1: Em Star Wars, os Jedi são.. \n"
				+ "A) Os mocinhos. \n"
				+ "B) Os vilões. \n"
				+ "C) São Neutros. \n"
				+ "D) Nenhuma das anteriores.");
		System.out.print("Sua Resposta:");
		resposta1 = ler.next();
		if(resposta1.equalsIgnoreCase("A")) {
			nota = nota + 1;
			System.out.println("Resposta Correta!");
		}else {
			System.out.println("Resposta Errada :(");
		}
		
		System.out.println(" ");
		
		System.out.println("Pergunta 2: Em Star Wars, os Sith são.. \n"
				+ "A) Os mocinhos. \n"
				+ "B) Os vilões. \n"
				+ "C) São Neutros. \n"
				+ "D) Nenhuma das anteriores.");
		System.out.print("Sua Resposta:");
		resposta2 = ler.next();
		if(resposta2.equalsIgnoreCase("B")) {
			nota = nota + 1;
			System.out.println("Resposta Correta!");
		}else {
			System.out.println("Resposta Errada :(");
		}
		
		System.out.println("");
		
		System.out.println("Pergunta 3: Em Star Wars, Corruscant é um... \n"
				+ "A) Vilão. \n"
				+ "B) Lugar. \n"
				+ "C) Planeta. \n"
				+ "D) Nenhuma das anteriores.");
		System.out.print("Sua Resposta:");
		resposta3 = ler.next();
		if(resposta3.equalsIgnoreCase("C")) {
			nota = nota + 1;
			System.out.println("Resposta Correta!");
		}else {
			System.out.println("Resposta Errada :(");
		}
		
		System.out.println("");
		
		System.out.println("Pergunta 4: Em Star Wars, os Mandalorianos são Jedi. \n"
				+ "A) Verdade. \n"
				+ "B) Mentira. \n"
				+ "C) São Sith. \n"
				+ "D) Nenhuma das anteriores.");
		System.out.print("Sua Resposta:");
		resposta4 = ler.next();
		if(resposta4.equalsIgnoreCase("B")) {
			nota = nota + 1;
			System.out.println("Resposta Correta!");
		}else {
			System.out.println("Resposta Errada :(");
		}
		
		p.setNota(nota);
		
		System.out.println("Prova finalizada.");
		System.out.println("Sua nota foi de: "+ p.getNota() + " ponto[s], Parabens.");
		ler.close();
	}
}
