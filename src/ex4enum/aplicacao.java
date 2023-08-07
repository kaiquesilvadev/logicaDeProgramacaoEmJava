package ex4enum;

import java.util.Date;

public class aplicacao {

	public static void main(String[] args) {
		// revisando aula sobre enumerados no curso do nelio 
		
		Pedido pedido = new Pedido(100, new Date(), OrdeStatus.AGUARDANDO_PAGAMENTO);
		
		System.out.println(pedido);

	}

}
