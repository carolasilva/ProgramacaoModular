package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.Aluno;

class AlunoTest {

	public static Aluno aluno;
	
	@BeforeEach
	void setUp() {
		aluno = new Aluno ("Teste", 100);
	}

	@Test
	void testLogin() {
		assertEquals("test100", aluno.getLogin());
	}
}
