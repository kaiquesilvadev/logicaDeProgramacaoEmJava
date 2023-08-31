package ex2OBJ;

public class Account {

	private int Number;

	private String holder;

	private double balance;

	public Account(int number, String holder) {
		this.Number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double balance) {
		this.Number = number;
		this.holder = holder;
		deposito(balance);
	}

	public int getNumber() {
		return Number;
	}

	/*
	 * public void setNumber(int number) { Number = number; } comentei esse
	 * modificador para seguir a lógica do exercicío que o número da conta não pode
	 * ser alterada
	 */

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	/*
	 * public void setBalance(double balance) { this.balance = balance; }comentei
	 * esse modificador para seguir a lógica do exercicío que o saldo da conta não
	 * pode ser modificado livremente e sim através de métodos "saque e depósito"
	 */

	public void deposito(double amount) {
		this.balance += amount;
	}

	public void saque(double amount) {

		this.balance -= amount + 5.00;
	}

	@Override
	public String toString() {
		return "conta [número :" + Number + ", titular :" + holder + ", saldo :" + balance + "]";
	}

}
