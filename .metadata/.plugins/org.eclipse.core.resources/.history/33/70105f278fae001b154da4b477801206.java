/*
 * Conceitos base para comunicação Diffie-Hellman.
 * 
 * - Esta ferramenta serve somente para troca de chaves entre as partes
 *   não sendo responsável pela criptografia da mensagem.
 *   
 * - As partes devem ter em negociação dois números em comum: Um inteiro e outro Primo.
 * 
 * - Cada uma das partes deve escolher um número secreto, que não será compartilhado.
 * 	 
 * Fórmula:
 * 
 * gx(mod n)
 * 
 * g = número inteiro definido entre as partes
 * x = g é elevado ao expoente secreto defido individualmente
 * n = número primo definido entre as partes
 */


import java.math.BigInteger;
import java.util.Scanner;
public class Chave {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Definir inteiro em comum");
		int i = sc.nextInt();
		
		System.out.println("Definir primo em comum");
		int p = sc.nextInt();
		
		System.out.println("Definir expoente secreto");
		int x = sc.nextInt();
		sc.close();
		
		BigInteger exp = BigInteger.valueOf(i).pow(x);
		BigInteger chave = exp.mod(BigInteger.valueOf(p));

		System.out.println(chave);
		
	

	}

}
