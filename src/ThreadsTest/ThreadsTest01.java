package ThreadsTest;

public class ThreadsTest01{

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			Thread thread = new Thread(new PedidoProcessor(i));
			thread.start();
		}
	}
}

class PedidoProcessor implements Runnable {
	private int pedidoId;

	public PedidoProcessor(int pedidoId) {
		this.pedidoId = pedidoId;
	}

	@Override
	public void run() {
		System.out.println("Processando pedido " + pedidoId);
		// Simulando processamento do pedido
		try {
			Thread.sleep(2000); // Simula o tempo de processamento
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			return;
		}
		System.out.println("Pedido " + pedidoId + " processado com sucesso.");
	}
}