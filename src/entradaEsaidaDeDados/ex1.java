package entradaEsaidaDeDados;

public class ex1 {

	public static void main(String[] args) {
	
		                          //Para escrever na tela um texto qualquer
		
		
		//Sem quebra de linha ao final:
		System.out.print("Bom dia!");
		
		//Com quebra de linha ao final:
		System.out.println("Bom dia!");

		
		/*Para escrever o conteúdo de uma variável
		com ponto flutuante*/
		
		//Suponha uma variável tipo double declarada e iniciada:
		double x = 10.35784;  //%n = quebra de linha(independente de plataforma)
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		/*ATENÇÃO:
		Para considerar o separador de decimais como ponto, ANTES da declaração do Scanner, faça:
		Locale.setDefault(Locale.US);*/
		
		/*Para concatenar vários elementos em um
		mesmo comando de escrita*/
		
		//Regra geral para print e println:
		//elemento1 + elemento2 + elemento3 + ... + elementoN
		System.out.println("RESULTADO = " + x + " METROS");
		
		//---------------------------------------------------------------------------------------------------------------------------------
		//Scanner
		
		/*Para fazer entrada de dados, crie um objeto do tipo
		"Scanner" da seguinte forma:  Scanner sc = new Scanner(System.in);
		não esqueça de importar o leitor de dados vc pode apertar a tecla ctrl + shift + o , e depois verifique la em cima se esta importado corretamente 
		(import java.util.Scanner;)
		faça sc.close() quando não precisar mais do objeto sc*/
		
		//Para ler uma palavra (texto sem espaços) -> x = sc.next();
		
		// Para ler um número inteiro -> x = sc.nextInt();
		
		// Para ler um número com ponto flutuante -> x = sc.nextDouble();
		
		//x = sc.nextDouble(); -> x = sc.next().charAt(0);
		
		                                          // ATENÇÃO: quebra de linha pendente
		
		/*Quando você usa um comando de leitura diferente do nextLine() e dá alguma quebra de linha, essa
		quebra de linha fica "pendente" na entrada padrão. Se você então fizer um nextLine(), aquela quebra de linha pendente
		será absorvida pelo nextLine(). */
		
		                                          //Solução:
			//Faça um nextLine() extra antes de
			//fazer o nextLine() de seu
			//interesse.
		
		
		//ex 
		/*int x;
		String s1, s2, s3;
		x = sc.nextInt();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);*/
		
		//------------------------------------------------------------------------------------------------------------------------------
		
		                                            //Algumas funções matemáticas em Java
		
		//Exemplo						Significado
		//A = Math.sqrt(x); 			Variável A recebe a raiz quadrada de x
		//A = Math.pow(x, y); 			Variável A recebe o resultado de x elevado a y
		//A = Math.abs(x); 				Variável A recebe o valor absoluto de x
	}

}
