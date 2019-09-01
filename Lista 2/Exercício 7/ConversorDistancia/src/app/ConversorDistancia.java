package app;

public final class ConversorDistancia {
	public static final double TAXA_DE_PES_PARA_METROS = 0.3048;
	public static final double TAXA_DE_PES_PARA_POLEGADAS = 12;
	public static final double TAXA_DE_METROS_PARA_CENTIMETROS = 100;
	private ConversorDistancia() {}
	public static double converterPesParaMetros(double valor) {
		return valor * TAXA_DE_PES_PARA_METROS;
	}

	public static double converterPesParaPolegadas(double valor) {
		return valor * TAXA_DE_PES_PARA_POLEGADAS;
	}

	public static double converterPesParaCentimetros(double valor) {
		return (valor * TAXA_DE_PES_PARA_METROS) * TAXA_DE_METROS_PARA_CENTIMETROS;
	}

	public static double converterPolegadasParaMetros(double valor) {
		return (valor / TAXA_DE_PES_PARA_POLEGADAS) * TAXA_DE_PES_PARA_METROS;
	}

	public static double converterPolegadasParaPes(double valor) {
		return valor / TAXA_DE_PES_PARA_POLEGADAS;
	}

	public static double converterPolegadasParaCentimetros(double valor) {
		return ((valor / TAXA_DE_PES_PARA_POLEGADAS) * TAXA_DE_PES_PARA_METROS) * TAXA_DE_METROS_PARA_CENTIMETROS;
	}

	public static double converterMetrosParaPes(double valor) {
		return valor / TAXA_DE_PES_PARA_METROS;
	}

	public static double converterMetrosParaPolegadas(double valor) {
		return (valor / TAXA_DE_PES_PARA_METROS) * TAXA_DE_PES_PARA_POLEGADAS;
	}

	public static double converterMetrosParaCentimetros(double valor) {
		return valor * TAXA_DE_METROS_PARA_CENTIMETROS;
	}

	public static double converterCentimetrosParaMetros(double valor) {
		return valor / TAXA_DE_METROS_PARA_CENTIMETROS;
	}

	public static double converterCentimetrosParaPes(double valor) {
		return (valor / TAXA_DE_METROS_PARA_CENTIMETROS) / TAXA_DE_PES_PARA_METROS;
	}

	public static double converterCentimetrosParaPolegadas(double valor) {
		return ((valor / TAXA_DE_METROS_PARA_CENTIMETROS) / TAXA_DE_PES_PARA_METROS) * TAXA_DE_PES_PARA_POLEGADAS;
	}
}
