package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.Conta;

class ContaTest {
	
	public static Conta conta;
	@BeforeEach
	void setUp() {
		conta = new Conta();
	}
	
	@Test
	void testaChequeEspecial () {
		assertFalse("O método de teste se a conta está em cheque especial retornou verdadeiro para o saldo R$0.00",
				conta.estaEmChequeEspecial());
	}
	
	@Test
	void testaDeposito () {
		conta.realizaDeposito(-9);
		assertEquals("O método realizaDeposito permitiu um depósito negativo", 0.0, conta.getSaldo(), 0.000001);
	}
	
	@Test
	void testaTransferencia() {
		Conta contaDestino = new Conta();
		conta.realizaTransferencia(contaDestino, -9);
		assertEquals("O método realizaTransferencia permitiu uma transferência negativa", 0.0, conta.getSaldo(), 0.000001);
		
		conta.realizaTransferencia(contaDestino, 98);
		assertEquals("O método realizaTransferencia não retirou o dinheiro da conta origem", -98.0, conta.getSaldo(), 0.000001);
		
		conta.realizaTransferencia(contaDestino, 98);
		assertEquals("O método realizaTransferencia não adicionou o dinheiro na conta destino", 196.0, contaDestino.getSaldo(), 0.000001);
	}
}
