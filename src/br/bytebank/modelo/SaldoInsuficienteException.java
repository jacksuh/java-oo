package br.bytebank.modelo;

public class SaldoInsuficienteException extends Exception{ //checked
	
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
