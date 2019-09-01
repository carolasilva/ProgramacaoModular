package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import app.Data;

class DataTest {
	public static Data data;
	
	@Test
	public void testAdicionaDias_numMesmoMes() {
		adicionaHelper(15, 2, 2050, 4, 19, 2, 2050);
	}

	@Test
	public void testAdicionaDias_numMesmoAno() {
		adicionaHelper(15, 2, 2050, 65, 21, 4, 2050);
	}
	
	@Test
	public void testAdicionaDias_emAnosDiferentes() {
		adicionaHelper(15, 2, 2050, 1369, 15, 11, 2053);
	}
	
	@Test
	public void testDiaDaSemana() {
		data = new Data (5, 6, 1999);
		assertEquals("Sábado", data.diaDaSemana());
	}
	
	@Test
	public void testProximoDia_numMesmoMes() {
		helperProximoDia(30, 8, 2019, 31, 8, 2019);
	}
	
	@Test
	public void testProximoDia_numMesmoAno() {
		helperProximoDia(31, 8, 2019, 1, 9, 2019);
	}
	
	@Test
	public void testProximoDia_emAnosDiferentes() {
		helperProximoDia(31, 12, 2019, 1, 1, 2020);
	}
	
	@Test
	public void testDiasNoMes_31Dias() {
		helperDiasNoMes(3, 1, 2019, 31);
	}
	
	@Test
	public void testDiasNoMes_30Dias() {
		helperDiasNoMes(8, 9, 2019, 30);
	}
	
	@Test
	public void testDiasNoMes_FevereiroBissexto() {
		helperDiasNoMes(2, 2, 2020, 29);
	}
	
	@Test
	public void testDiasNoMes_FevereiroNaoBissexto() {
		helperDiasNoMes(22, 2, 2019, 28);
	}
	
	@Test 
	public void testAnoBissexto_true() {
		data = new Data(2, 2, 2020);
		assertTrue(data.eAnoBisexto());
	}
	
	@Test 
	public void testAnoBissexto_false() {
		data = new Data(2, 2, 2019);
		assertFalse(data.eAnoBisexto());
	}

	@Test
	public void testDataPorExtenso() {
		data = new Data(15, 11, 1889);
		assertEquals("15 de novembro de 1889", data.dataPorExtenso());
	}
	private void adicionaHelper(int dia1, int mes1, int ano1, int adiciona,  int dia2, int mes2, int ano2) {
		Data real = new Data (dia1, mes1, ano1);
		real.adicionaDias(adiciona);
		Data esperado = new Data(dia2, mes2, ano2);
		assertEquals(esperado.getDia(), real.getDia(), "data apos " + adiciona + " dias");
		assertEquals(esperado.getMes(), real.getMes(), "data apos " + adiciona + " dias");
		assertEquals(esperado.getAno(), real.getAno(), "data apos " + adiciona + " dias");
	}
	
	private void helperDiasNoMes (int dia, int mes, int ano, int esperado) {
		Data data = new Data (dia, mes, ano);
		assertEquals (esperado, data.diasNoMes(), "existem no mês de " + mes + " do ano de " + ano);
	}
	
	private void helperProximoDia (int dia, int mes, int ano, int dia2, int mes2, int ano2) {
		data = new Data(dia, mes, ano);
		data.proximoDia();
		Data esperado = new Data(dia2, mes2, ano2);
		
		assertEquals(esperado.getDia(), data.getDia(), "proxima data depois de " + dia + "/" + mes + "/" + ano);
		assertEquals(esperado.getMes(), data.getMes(), "proxima data depois de " + dia + "/" + mes + "/" + ano);
		assertEquals(esperado.getAno(), data.getAno(), "proxima data depois de " + dia + "/" + mes + "/" + ano);
	}
	
}
