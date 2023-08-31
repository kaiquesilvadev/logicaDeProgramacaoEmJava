package Exception;

public class RuntimeException2 {

	public static void main(String[] args) {

		// criar minhas proprias exception

		divisao(1, 0);
	}

	public static int divisao(int a, int b) {
		if (b == 0) {
			throw new RuntimeException(" argumento ilegal, não pode ser 0");// exception personalizada
		}
		return 0;
	}
}
