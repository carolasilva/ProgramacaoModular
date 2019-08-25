package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.ConversorDistancia;

class ConversorDistanciaTest {
	public static ConversorDistancia conversor;
	@BeforeEach
	void setUp() {
		conversor = new ConversorDistancia();
	}
	
	@Test
	void testPesParaMetros() {
		assertEquals(5.1816, ConversorDistancia.converterPesParaMetros(17), 0.001);
	}
	
	@Test
	void testPesParaPolegadas() {
		assertEquals(204, ConversorDistancia.converterPesParaPolegadas(17), 0.001);
	}
	
	@Test
	void testPesParaCentimetros() {
		assertEquals(518.16, ConversorDistancia.converterPesParaCentimetros(17), 0.001);
	}
	
	@Test
	void testPolegadasParaMetros() {
		assertEquals(0.4318, ConversorDistancia.converterPolegadasParaMetros(17), 0.001);
	}
	
	@Test
	void testPolegadasParaPes() {
		assertEquals(1.41667, ConversorDistancia.converterPolegadasParaPes(17), 0.001);
	}
	
	@Test
	void testPolegadasParaCentimetros() {
		assertEquals(43.1801016, ConversorDistancia.converterPolegadasParaCentimetros(17), 0.001);
	}
	
	@Test
	void testMetrosParaPes() {
		assertEquals(55.774409449, ConversorDistancia.converterMetrosParaPes(17), 0.001);
	}
	
	@Test
	void testMetrosParaPolegadas() {
		assertEquals(669.291, ConversorDistancia.converterMetrosParaPolegadas(17), 0.001);
	}
	
	@Test
	void testMetrosParaCentimetros() {
		assertEquals(1700, ConversorDistancia.converterMetrosParaCentimetros(17), 0.001);
	}
	
	@Test
	void testCentimetrosParaPes() {
		assertEquals(0.557743, ConversorDistancia.converterCentimetrosParaPes(17), 0.001);
	}
	
	@Test
	void testCentimetrosParaPolegadas() {
		assertEquals(6.69291, ConversorDistancia.converterCentimetrosParaPolegadas(17), 0.001);
	}
	
	@Test
	void testCentimetrosParaMetros() {
		assertEquals(0.17, ConversorDistancia.converterCentimetrosParaMetros(17), 0.001);
	}
}
