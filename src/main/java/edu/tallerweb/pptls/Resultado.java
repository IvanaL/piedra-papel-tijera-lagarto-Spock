package edu.tallerweb.pptls;

/**
 * Los posibles resultados del juego
 */
public enum Resultado {

	GANA(0), EMPATA(1), PIERDE(2);
	private Integer valor;


private Resultado(final Integer valor) {
	this.valor= valor;
}

public Integer getValor() {
	return this.valor;
}

public void setValor(Integer valor) {
	this.valor = valor;
}
}
