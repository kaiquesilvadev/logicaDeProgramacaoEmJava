package Optional;

import java.util.Optional;

class Conclusao {

	private String nome;

	public Conclusao(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static void main(String[] args) {
		Conclusao x = new Conclusao("kaique");

		// Optional<String> optional = Optional.empty(); // retorna um optional fazio

		// Optional<String> optional2 = Optional.of(x.nome);//retorna o valor do
		// optional

		Optional<String> optional3 = Optional.ofNullable(x.nome);// retorna um optional se ouver um, se não retornar um
																	// optional vario

		// System.out.println(optional3.orElse("vazio"));// orElse faz um teste , se
		// existir algo presente no optional retorna senao retorna o que estiver no
		// orElse

		// System.out.println(optional3.get());// get retorna o valor dentro do optional
		teste(x);
		teste2(optional3);

	}

	public static String teste(Conclusao Conclusao) {
		System.out.println(Optional.ofNullable(Conclusao).map(x -> x.nome.length() > 6));// map mapea e retorna se esta
																							// presente ou não
		return "";
	}

	public static void teste2(Optional<String> Conclusao) {
		Conclusao.filter(x -> x.equals("kaique")).ifPresent(x -> System.out.println("verdadeiro"));// método filter é
																									// usado para
																									// verificar se o
																									// valor contido no
																									// Optional atende a
																									// uma determinada
																									// condição.
	}

}
