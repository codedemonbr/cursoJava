package metodosClassses;

public class Data {

	int dia;
	int mes;
	int ano;

	Data() {
//		this.ano = 1970;
//		this.mes = 1;
//		this.dia = 1;

		this(1, 1, 1970);
		
	}

	Data(int dia, int mes, int ano) {
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;

	}

	String obterDataFormatada() {
 
		final String formato = "%d/%d/%d";
		return String.format(formato, dia, mes, ano);
	}

	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}

}
