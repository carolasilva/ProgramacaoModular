package app;

public class Aplicacao {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		System.out.println("Número da conta: " + conta1.getNumeroConta() + "\nSaldo: R$" + conta1.getSaldo());
		System.out.println("\n\nNúmero da conta: " + conta2.getNumeroConta() + "\nSaldo: R$" + conta2.getSaldo());
		
		conta1.realizaDeposito(90);
		System.out.println("\n\nNúmero da conta: " + conta1.getNumeroConta() + "\nSaldo: R$" + conta1.getSaldo());
		
		conta1.realizaDeposito(100);
		System.out.println("\n\nNúmero da conta: " + conta1.getNumeroConta() + "\nSaldo: R$" + conta1.getSaldo());
		
		conta1.realizaTransferencia(conta2, 40);
		
		System.out.println("\n\nNúmero da conta: " + conta1.getNumeroConta() + "\nSaldo: R$" + conta1.getSaldo() + "\nCheque especial: " + (conta1.estaEmChequeEspecial() == true ? "Sim" : "Não"));
		System.out.println("\n\nNúmero da conta: " + conta2.getNumeroConta() + "\nSaldo: R$" + conta2.getSaldo() + "\nCheque especial: " + (conta2.estaEmChequeEspecial() == true ? "Sim" : "Não"));
	}
}
