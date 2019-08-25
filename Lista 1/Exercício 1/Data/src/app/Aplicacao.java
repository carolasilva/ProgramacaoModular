package app;

public class Aplicacao {
	public static void main(String[] args) {
		Data dataAntiga = new Data (5, 6, 1999);
		System.out.println("A data adicionada foi: " + dataAntiga.getDia() + "/" + dataAntiga.getMes() + "/" + dataAntiga.getAno());
		
		Data dataAtual = new Data();
		System.out.println("A data adicionada pelo construtor sem parâmetros foi: " + dataAtual.getDia() + "/" + dataAtual.getMes() + "/" + dataAtual.getAno());
		System.out.println("Dia da semana:  " + dataAtual.diaDaSemana());
		
		dataAtual.adicionaDias(6);
		System.out.println("A data atual acrescida de 6 dias é: " + dataAtual.getDia() + "/" + dataAtual.getMes() + "/" + dataAtual.getAno());
		
		dataAtual.adicionaDias(67);
		System.out.println("A nova data acrescida de 67 dias é: " + dataAtual.getDia() + "/" + dataAtual.getMes() + "/" + dataAtual.getAno());
		
		dataAtual.adicionaDias(386);
		System.out.println("A nova data acrescida de 386 dias é: " + dataAtual.getDia() + "/" + dataAtual.getMes() + "/" + dataAtual.getAno());
		
	}
}
