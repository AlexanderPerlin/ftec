
/*	Aluno: Alexander Perlin
 * 
 *	Algoritmo criado para representar Cifra de Cesar
 *	
 *	Percorre tabela ASCII de posição 97 até 122
 *	deslocando as letras conforme chave escolhida pelo usuário
 *	
 *	Mantém espaço, virgula, ponto final, interrogação e exclamação
 *	para garantir integridade da mensagem.
 *	
 *	Descriptografa conforme as regras acima
 *	
 */
import java.util.Scanner;

public class CryptCesar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String acumulador = "";
		System.out.println("Informe o texto a ser criptografado:\n ");
		String texto = (sc.nextLine().toLowerCase()); // passa texto para caixa baixa

		System.out.println("Informe a chave de deslocamento:\n ");
		int chave = sc.nextInt();

		if (chave > 25) { // evitar ultrapassar loop maximo
			System.out.println("Chave informada incorretamente\n");
			System.out.println("Execute o programa novamente");
			System.exit(0);
		}

		sc.close();

		int tamanhoTexto = texto.length();
		for (int c = 0; c < tamanhoTexto; c++) { // capturar numero tabela ASCII
			int numeroASCII = ((int) texto.charAt(c)) + chave;

			// Manter os seguintes caracteres
			if (texto.charAt(c) == 32 || texto.charAt(c) == 44    // virgula
									  || texto.charAt(c) == 46    // ponto final
					                  || texto.charAt(c) == 63 	  // interrogacao
					                  || texto.charAt(c) == 33) { // exclamacao

				int conversao = (int) texto.charAt(c);
				int conve = conversao;
				char conver = (char) conve; // conversão para caracteres e acumular
				acumulador += conver;
			}

			else if (numeroASCII > 122) { // loop pela tabela ASCII de a-z
				int conversao = (int) texto.charAt(c) + chave - 26;
				int conve = conversao;
				char conver = (char) conve;
				acumulador += conver;
			}

			else {
				int conversao = (int) texto.charAt(c) + chave;
				int conve = conversao;
				char conver = (char) conve;
				acumulador += conver;
			}
		}

		System.out.println("Criptografado    " + acumulador);

		texto = acumulador;
		acumulador = "";

		tamanhoTexto = texto.length();
		for (int c = 0; c < tamanhoTexto; c++) {
			int numeroASCII = ((int) texto.charAt(c)) - chave;

			if (texto.charAt(c) == 32 || texto.charAt(c) == 44    // virgula
					                  || texto.charAt(c) == 46    // ponto final
	                                  || texto.charAt(c) == 63 	  // interrogacao
	                                  || texto.charAt(c) == 33) { // exclamacao

				int conversao = (int) texto.charAt(c);
				int conve = conversao;
				char conver = (char) conve;
				acumulador += conver;
			}

			else if (numeroASCII < 97) {
				int conversao = (int) texto.charAt(c) - chave + 26;
				int conve = conversao;
				char conver = (char) conve;
				acumulador += conver;
			}

			else {
				int conversao = (int) texto.charAt(c) - chave;
				int conve = conversao;
				char conver = (char) conve;
				acumulador += conver;
			}
		}
		System.out.println("Descriptografado " + acumulador);
	}
}
