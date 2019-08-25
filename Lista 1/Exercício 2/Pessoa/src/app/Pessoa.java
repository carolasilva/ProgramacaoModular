package app;

public class Pessoa {
	private String nome;
	private String cpf;
	private int idade;
	private String sexo;
	
	public Pessoa () {
		this.nome = "Jane Doe";
		this.cpf = "00000000000";
		this.idade = 0;
		this.sexo = "Feminino";
	}
	
	public Pessoa(String nome, String cpf, int idade, String sexo) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setIdade(idade);
		this.setSexo(sexo);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (!nome.isEmpty())
			this.nome = nome;
		else
			System.out.println("Nome inválido!");
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		if (cpf.length() == 11)
			this.cpf = cpf;
		else
			System.out.println("Digite um CPF válido!");
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		if (eUmaIdadeValida(idade))
			this.idade = idade;
		else
			System.out.println("Digite uma idade válida!");
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		if (eUmSexoValido(sexo))
			this.sexo = sexo;
		else
			System.out.println("Digite um sexo válido! (Masculino ou Feminino)");
	}
	
	private boolean eUmaIdadeValida (int idade) {
		return (idade >= 0 && idade < 120);
	}
	
	private boolean eUmSexoValido (String sexo) {
		return (sexo.equalsIgnoreCase("feminino")) || (sexo.equalsIgnoreCase("masculino"));
	}
	
	public boolean eMaiorDeIdade () {
		return idade >= 18;
	}
}
