package app;

public class Aplicacao {

	public static void main(String[] args) {
		Aluno aluno = new Aluno ("Carolina Alves", 0);
		
		System.out.println("Nome completo: " + aluno.getNomeCompleto());
		System.out.println("Carga hor�ria cursada: " + aluno.getCargaHorariaCursada());
		System.out.println("Matr�cula: " + aluno.getMatricula());
		System.out.println("Login: " + aluno.getLogin());
		
		Aluno aluno2 = new Aluno ("Jane Doe", 10);
		
		System.out.println("\n\nNome completo: " + aluno2.getNomeCompleto());
		System.out.println("Carga hor�ria cursada: " + aluno2.getCargaHorariaCursada());
		System.out.println("Matr�cula: " + aluno2.getMatricula());
		System.out.println("Login: " + aluno2.getLogin());
	}

}
