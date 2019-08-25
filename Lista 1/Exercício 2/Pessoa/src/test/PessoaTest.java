package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import app.Pessoa;

class PessoaTest {
	private static Pessoa pessoaTestada;
	
	@BeforeEach
	void setUp() throws Exception {
		pessoaTestada = new Pessoa();
	}
	
	@Test
	void testeEMaiorDeIdade() {
		assertFalse("O método de teste se a pessoa é maior de idade retornou verdadeiro para uma pessoa de 0 anos",
				pessoaTestada.eMaiorDeIdade());
	}

	@Test
	void testeSetters() {
		pessoaTestada.setNome("");
		assertEquals("O método setNome alterou o nome ao ser passado um parâmetro vazio", "Jane Doe", pessoaTestada.getNome());
		
		pessoaTestada.setCpf("1110002220");
		assertEquals("O método setCpf alterou o CPF ao ser passado cpf de apenas 10 dígitos", "00000000000", pessoaTestada.getCpf());
		
		pessoaTestada.setIdade(180);
		assertEquals("O método setIdade alterou a idade ao ser passada idade de 180 anos", 0, pessoaTestada.getIdade());
		
		pessoaTestada.setSexo("f");
		assertEquals("O método setSexo alterou o sexo ao ser passado apenas 'f'", "Feminino", pessoaTestada.getSexo());
	}
}
