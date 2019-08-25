package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import app.Data;

class DataTest {
	@Test
	public void testAdicionaDias_numMesmoMes() {
		adicionaHelper(15, 2, 2050, 4, 19, 2, 2050);
	}

	private void adicionaHelper(int dia1, int mes1, int ano1, int adiciona,  int dia2, int mes2, int ano2) {
		Data real = new Data (dia1, mes1, ano1);
		real.adicionaDias(adiciona);
		Data esperado = new Data(dia2, mes2, ano2);
		assertEquals(esperado, real, "data apos " + adiciona + " dias");
	}
}
