package app;

public class Aplicacao {
	public static void main(String[] args) {
		System.out.println("Convertendo 19 pés para metros: " + ConversorDistancia.converterPesParaMetros(19));
		System.out.println("Convertendo 19 polegadas para centímetros: " + ConversorDistancia.converterPolegadasParaCentimetros(19));
		System.out.println("Convertendo 19 centímetros para polegadas: " + ConversorDistancia.converterCentimetrosParaPolegadas(19));
		System.out.println("Convertendo 19 metros para pés: " + ConversorDistancia.converterMetrosParaPes(19));
	}
}
