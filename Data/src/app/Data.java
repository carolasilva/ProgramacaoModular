package app;

import java.time.LocalDate;

public class Data {
	private int dia, mes, ano;
	
	public Data (int dia, int mes, int ano) {
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
	}
	
	public Data () {
		LocalDate localDate = LocalDate.now();
		this.setDia(localDate.getDayOfMonth());
		this.setMes(localDate.getMonthValue());
		this.setAno(localDate.getYear());
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}

	private boolean mesEFevereiro () {
		return this.getMes() == 2;
	}
	
	private boolean mesTemTrintaDias() {
		return (mes == 4) || (mes == 6) || (mes == 9) || (mes == 11);
	}
	
	private boolean estaNoUltimoDiaDoAno() {
		return (mes == 12) && (dia == 31);
	}
	
	public int diasNoMes() {
		if (mesEFevereiro()) {
			if (eAnoBisexto()) 
				return 29;
			else
				return 28;
		}
		else if (mesTemTrintaDias())
			return 30;
		else
			return 31;
	}
	
	private boolean anoEDivisivelPor (int divisor) {
		return (ano % divisor) == 0;
	}
	
	private boolean eAnoBisexto() {
		return (anoEDivisivelPor(4) && !anoEDivisivelPor(100)) || (anoEDivisivelPor(400));
	}

	private boolean estaNoUltimoDiaDoMes() {
		return dia == diasNoMes();
	}
	
	public void proximoDia () {
		if (estaNoUltimoDiaDoAno()) {
			dia = 1;
			mes = 1;
			ano++;
		}
		else if (estaNoUltimoDiaDoMes()) {
			mes++;
			dia = 1;
		}
		else {
			dia++;
		}
	}
	
	public void adicionaDias(int dias) {
		while (dias > 0) {
			proximoDia();
			dias--;
		}
	}
	
	public String diaDaSemana() {
		LocalDate localDate = LocalDate.of(ano, mes, dia);
		switch (localDate.getDayOfWeek().getValue()) {
			case 1:
				return "Segunda-feira";
			case 2:
				return "Terça-feira";
			case 3:
				return "Quarta-feira";
			case 4:
				return "Quinta-feira";
			case 5:
				return "Sexta-feira";
			case 6: 
				return "Sábado";
			case 7:
				return "Domingo";
			default:
				return "Dia inexistente";
		}
	}
}
