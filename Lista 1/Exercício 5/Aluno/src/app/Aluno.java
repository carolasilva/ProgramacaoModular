package app;

public class Aluno {
	private String nomeCompleto;
	private int matricula;
	private int cargaHorariaCursada;
	private String login;
	private static int codigoAlunos = 100;
	
	public Aluno(String nomeCompleto, int cargaHorariaCursada) {
		this.setNomeCompleto(nomeCompleto);
		this.setCargaHorariaCursada(cargaHorariaCursada);
		this.matricula = codigoAlunos++;
		this.login = this.buscaQuatroPrimeirosCaracteresNome() + this.buscaTresPrimeirosDigitosMatricula ();
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	public void setNomeCompleto(String nomeCompleto) {
		if (nomeCompleto.length() >= 3)
			this.nomeCompleto = nomeCompleto;
		else 
			System.out.println("Digite um nome válido!");
	}
	
	public int getCargaHorariaCursada() {
		return cargaHorariaCursada;
	}
	
	public void setCargaHorariaCursada(int cargaHorariaCursada) {
		if (cargaHorariaCursada >= 0)
			this.cargaHorariaCursada = cargaHorariaCursada;
		else
			System.out.println("Carga horária inválida!");
	}
	
	public int getMatricula () {
		return matricula;
	}

	public String getLogin () {
		return login;
	}
	
	private String buscaQuatroPrimeirosCaracteresNome () {
		return nomeCompleto.substring(0, 4).toLowerCase();
	}
	
	private String buscaTresPrimeirosDigitosMatricula () {
		return String.valueOf(matricula).substring(0, 3);
	}
}
