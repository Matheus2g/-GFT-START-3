package exercicio4;

public class Main {

	public static void main(String[] args) {
	
		int num1 = 15485448;
		int num2 = 2195498;
		int num3 = 12;
		int num4 = 98716549;
		int num5 = 1654891;

		
		inverte(num1);
		inverte(num2);
		inverte(num3);
		inverte(num4);
		inverte(num5);
	}
	
	public static void inverte(int numero) {
		
		int i = 0;

		while (numero > 0) {
			 i *= 10;
			 i += (numero % 10);
			 numero /= 10;
		} 
			 
		System.out.printf("O número invertido é: %d.\n", i);
	}
}
