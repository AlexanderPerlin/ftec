public class Encript {

	public static void main(String[] args) {
		

		String acumulador = "";
		int chave = 0;
		String texto = "fbqmpahldfm";
	
	for (int i=1; i<26; i++) {
		chave = i;
		
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

		System.out.println(acumulador + "\n");
		acumulador = "";
		
	}
	}
}
		