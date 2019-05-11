package controller;

public class Main {
	public static void main(String[] args) {
		Jogador jogador = new Jogador();
		Equipe equipe = new Equipe();
		AssociacaoEsportiva associa = new AssociacaoEsportiva();
		
		jogador.nome  	= "thales";
		equipe.jogador 	= jogador;
		associa.equipe 	= equipe;

		System.out.println(associa.equipe.jogador.nome);
		System.out.println(equipe.jogador.nome);
		System.out.println(jogador.nome);
	}
}
