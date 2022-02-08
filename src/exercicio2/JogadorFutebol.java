package exercicio2;

import java.time.LocalDate;
import java.time.Period;

public class JogadorFutebol {

	private String nome;
	private Posicao posicao;
	private LocalDate dataNascimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Posicao getPosicao() {
		return posicao;
	}
	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}
	
	public void imprimirDados() {
		System.out.println("Nome: " + this.nome + "\nPosição: " + this.posicao + "\ndata de nascimento : " + this.dataNascimento);
	}
	
	public Integer calculaIdade() {
		LocalDate diaDeHoje = LocalDate.now();
		Period period = Period.between(diaDeHoje, this.dataNascimento);
		return Math.abs(period.getYears());
	}
	
	public Integer quantoTempoFaltaParaSeAposentar() {
		int idade = calculaIdade();
		if(Posicao.DEFESA.equals(this.posicao)) {
			if(idade < 40) {
				return 40 - idade;
			}
			return 0;
		} else if (Posicao.MEIA.equals(this.posicao)) {
			if(idade < 38) {
				return 38 - idade;
			}
			return 0;
		} else {
			if(idade < 35) {
				return 35 - idade;
			}
			return 0;
		}
	}
}
