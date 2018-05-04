package br.calculadora.teste;

public class CalculadoraV2 {

	public int soma(String parcela) {
		int resultado=0;
		String[] arrayNumeros = parcela.split (",");
		
		if(arrayNumeros.length > 2)
			throw new RuntimeException("dados invalidos");
	
		for(String numero:arrayNumeros){
			if(!numero.isEmpty())
				resultado += Integer.parseInt(numero);
		}
		return resultado;
	}

}
