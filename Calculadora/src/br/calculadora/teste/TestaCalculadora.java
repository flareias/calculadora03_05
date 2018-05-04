package br.calculadora.teste;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestaCalculadora {

	@Test
	public void qndDoisIntReturnSoma() {
		int a = 2;
		int b = 3;
		Calculadora calculadora = new Calculadora();
		
		int resultadoObtido = calculadora.soma(a,b);
		assertEquals(2+3, resultadoObtido);
	}

}
