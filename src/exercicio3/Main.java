package exercicio3;

public class Main {

	public static void main(String[] args) {
		String primeiraString = "aaabccccdeeef";
		String segundaString =  "strings";
		String terceiraString =  "microsoft visual studio 2022";
		String quartaString = "abcedoftz";
		
		letraRepetida(primeiraString);
		letraRepetida(segundaString);
		letraRepetida(terceiraString);
		letraRepetida(quartaString);

	}

	public static void letraRepetida(String str) {
		String primeiroCaracter = null;
		
		do {
			try {
				primeiroCaracter = String.valueOf(str.charAt(0));
			} catch (Exception e) {
				System.out.println("_");
				break;
			}
			
			str = str.substring(1, str.length());
			
			if (str.contains(primeiroCaracter)) {
				str = str.replaceAll(primeiroCaracter, "");
			} else {
				System.out.println(primeiroCaracter);
				break;
			}
			
		} while (!false) ;
	}
}
