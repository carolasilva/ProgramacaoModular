package app;

public class Aplicacao {
	public static void main(String[] args) {
		System.out.println("Convertendo 19 p�s para metros: " + ConversorDistancia.converterPesParaMetros(19));
		System.out.println("Convertendo 19 polegadas para cent�metros: " + ConversorDistancia.converterPolegadasParaCentimetros(19));
		System.out.println("Convertendo 19 cent�metros para polegadas: " + ConversorDistancia.converterCentimetrosParaPolegadas(19));
		System.out.println("Convertendo 19 metros para p�s: " + ConversorDistancia.converterMetrosParaPes(19));
	}
}
