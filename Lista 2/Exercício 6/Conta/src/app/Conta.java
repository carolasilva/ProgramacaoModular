package app;

public class Conta {
	private static int contContas = 0;
	private double saldo;
	private int numeroConta;
	
	public Conta () {
		setSaldo(0);
		numeroConta = ++contContas;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean estaEmChequeEspecial () {
		return saldo < 0;
	}
	
	public void realizaDeposito (double valor) {
		if (valor <= 0)
			System.out.println("Valor inválido para depósito!");
		else 
			setSaldo(getSaldo() + valor);
	}
	
	public void realizaTransferencia (Conta destino, double valor) {
		if (valor > 0) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Seu novo saldo é: R$" + this.getSaldo());
			destino.setSaldo(destino.getSaldo() + valor);
		}
		else 
			System.out.println("Valor inválido!");
	}
}
