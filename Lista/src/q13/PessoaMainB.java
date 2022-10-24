package q13;

import java.util.Scanner;

public class PessoaMainB {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		
		Scanner ler = new Scanner(System.in);
		String[] armazena = new String[3];
		
		for (int i = 0; i < armazena.length; i++) {
			armazena[i] = p.Nome = ler.nextLine();
			armazena[i] = p.Cpf = ler.nextLine();
			armazena[i] = p.dataN = ler.nextLine();
			
		}
		for (int i = 0; i < armazena.length; i++) {
			System.out.println(armazena[i]);
		}
		
	}

}
