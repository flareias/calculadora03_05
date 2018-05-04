package br.calculadora.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestaCalculadoraV2 {

	@Test(expected=RuntimeException.class)
	public void qndMaisQDoisErro() {
		String parcela = "3,2,7";
		CalculadoraV2 calculadora = new CalculadoraV2();
		calculadora.soma(parcela);
	}

	@Test(expected=NumberFormatException.class)
	public void qndParcelaLiteralErro() {
		String parcela = "3,x";
		CalculadoraV2 calculadora = new CalculadoraV2();
		calculadora.soma(parcela);
	}
	
	@Test 
	public void qndParcelaVaziaErro() {
		String parcela = "";
		
		CalculadoraV2 calculadora = new CalculadoraV2();
		int resultObtido = calculadora.soma(parcela);
		
		assertEquals(0,resultObtido);
	}
	
	@Test 
	public void qndIntReturnSoma() {
		String parcela = "4,5";
		
		CalculadoraV2 calculadora = new CalculadoraV2();
		int resultObtido = calculadora.soma(parcela);
		
		assertEquals(4+5,resultObtido);
	}
	
}
