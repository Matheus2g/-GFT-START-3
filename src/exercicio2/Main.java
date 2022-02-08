package exercicio2;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		JogadorFutebol jogador = new JogadorFutebol();
		jogador.setNome("Matheus");
		jogador.setPosicao(Posicao.DEFESA);
		jogador.setDataNascimento(LocalDate.of(1990, 3, 15));
		
		jogador.imprimirDados();
		System.out.println("Jogador tem " + jogador.calculaIdade() + " anos");
		System.out.println("E falta " + jogador.quantoTempoFaltaParaSeAposentar() + " anos para se aposentar");
		
		System.out.println("-------------------------------------------------------------------------");
		
		JogadorFutebol jogador2 = new JogadorFutebol();
		jogador2.setNome("Matheus");
		jogador2.setPosicao(Posicao.ATACANTE);
		jogador2.setDataNascimento(LocalDate.of(1990, 3, 15));
		
		jogador2.imprimirDados();
		System.out.println("Jogador tem " + jogador2.calculaIdade() + " anos");
		System.out.println("E falta " + jogador2.quantoTempoFaltaParaSeAposentar() + " anos para se aposentar");
		
		System.out.println("-------------------------------------------------------------------------");
		
		JogadorFutebol jogador3 = new JogadorFutebol();
		jogador3.setNome("Matheus");
		jogador3.setPosicao(Posicao.MEIA);
		jogador3.setDataNascimento(LocalDate.of(1990, 3, 15));
		
		jogador3.imprimirDados();
		System.out.println("Jogador tem " + jogador3.calculaIdade() + " anos");
		System.out.println("E falta " + jogador3.quantoTempoFaltaParaSeAposentar() + " anos para se aposentar");
	}

}
