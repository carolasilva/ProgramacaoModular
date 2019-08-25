package app;

public class Aplicacao {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Pessoa carol = new Pessoa("Carolina", "12078571652", 20, "feminino");
		
		System.out.println("A pessoa padrão é: ");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("CPF: " + pessoa.getCpf());
		System.out.println("Idade: " + pessoa.getIdade());
		System.out.println("Sexo: " + pessoa.getSexo());
		System.out.println("Maior de idade: " + (pessoa.eMaiorDeIdade() == true ? "Verdadeiro" : "Falso"));
		
		System.out.println("A pessoa Carol é: ");
		System.out.println("Nome: " + carol.getNome());
		System.out.println("CPF: " + carol.getCpf());
		System.out.println("Idade: " + carol.getIdade());
		System.out.println("Sexo: " + carol.getSexo());
		System.out.println("Maior de idade: " + (carol.eMaiorDeIdade() == true ? "Verdadeiro" : "Falso"));
		

	}

}
