package exercicio1;

public class Main {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo("Camaro", "Spider", "FLG2918", "Azul", 10000);
		
		veiculo.acelerar();
		
		veiculo.ligar();
		veiculo.acelerar();
		System.out.println("Velocidade atual do carro: " + veiculo.getVelocidade() + "Km/h");
		veiculo.desligar();

		veiculo.abastecer(70);
		System.out.println("Litros de Combustivel: " + veiculo.getLitrosCombustivel() + "L");
		
		veiculo.frear();
		veiculo.frear();
		System.out.println("Velocidade atual do carro: " + veiculo.getVelocidade() + "Km/h");
		
		veiculo.pintar("branco");
		System.out.println("Cor do carro: " + veiculo.getCor());
		veiculo.desligar();
		System.out.println("Carro ligado: " + veiculo.isLigado());

	}

}
