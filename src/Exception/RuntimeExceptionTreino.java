package Exception;

import java.io.File;
import java.io.IOException;

public class RuntimeExceptionTreino {
	public static void main(String[] args) {
		// checked e uncheched

		try {
			criaNovoarquivo();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void criaNovoarquivo() throws IOException {//avisa para quem chamar o método que existe uma extensões
		File file = new File("arquivo\\teste.txt");

		try {
			file.createNewFile();

		} catch (IOException e) {
			e.printStackTrace();// emprime o caminho do erro e mostra onde esta
			throw e;// força quem chamar o método a tratar passives extensões
		}
	}
}
