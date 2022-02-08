package exercicio1;

public class Veiculo {
	private final String marca;
	private final String modelo;
	private final String placa;
	private String cor;
	private double preco;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	
	public Veiculo(String marca, String modelo, String placa, String cor, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.preco = preco;
	}	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public boolean isLigado() {
		return isLigado;
	}
	
	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}
	
	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}
	
	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public void ligar() {
		if (!isLigado) {
			this.isLigado = true;
		}
	}
	
	public void abastecer(int combustivel) {
		this.litrosCombustivel += combustivel;
		
		if (this.litrosCombustivel > 60) {
			this.litrosCombustivel = 60;
		}
	}
	
	public void acelerar() {
		if (!isLigado) {
			System.out.println("Carro não está ligado.");
		} else {
			this.velocidade += 20;
		}
	}
	
	public void frear() {
		if (this.velocidade == 0) {
			System.out.println("O veiculo já está parado.");
			
		} else {
			this.velocidade -= 20;
			
			if (this.velocidade < 0) {
				this.velocidade = 0;
			}
		}
	}
	
	public void pintar(String cor) {
		this.cor = cor;
	}
	
	public void desligar() {
		if (velocidade > 0) {
			System.out.println("O veículo não está parado.");
		} else if (!isLigado) {
			System.out.println("O veículo já foi desligado.");
		} else {
			isLigado = false;
		}
	}
}
