package com.ronaldo.estruturadados.vetor.teste;

import com.ronaldo.estruturadados.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);		
		
		vetor.adicionar("elemento 1");
		vetor.adicionar("elemento 2");
		vetor.adicionar("elemento 3");
		
		System.out.println(vetor.busca("elemento 2"));
		System.out.println(vetor.busca("elemento 4"));

	}

}
