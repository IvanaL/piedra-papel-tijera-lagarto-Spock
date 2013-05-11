package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {

	Forma forma;
	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
	public Mano(final Forma forma) {
		this.forma=forma;
	}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		switch(this.forma){
		case PIEDRA:	
			switch(otra.forma){
				case PIEDRA : return Resultado.EMPATA;
				case SPOCK:	 return Resultado.PIERDE;
				case PAPEL: return Resultado.PIERDE; 
				case LAGARTO: return Resultado.GANA; 
				case TIJERA: return Resultado.GANA;
				}
case SPOCK:		switch(otra.forma){
			case PIEDRA:  return Resultado.GANA; 
			case SPOCK:	 return Resultado.EMPATA; 
			case PAPEL: return Resultado.PIERDE; 
			case LAGARTO: return Resultado.PIERDE; 
			case TIJERA: return Resultado.GANA; 
			}
case PAPEL:		switch(otra.forma){
			case PIEDRA:  return Resultado.GANA; 
			case SPOCK:  return Resultado.GANA; 
			case PAPEL:	 return Resultado.EMPATA; 
			case LAGARTO:  return Resultado.PIERDE; 
			case TIJERA:  return Resultado.PIERDE; 
			}
case LAGARTO:	switch(otra.forma){
			case PIEDRA:  return Resultado.PIERDE; 
			case SPOCK:	 return Resultado.GANA; 
			case PAPEL: return Resultado.GANA; 
			case LAGARTO: return Resultado.EMPATA; 
			case TIJERA: return Resultado.PIERDE; 
			}

case TIJERA:	switch(otra.forma){
			case PIEDRA:  return Resultado.PIERDE; 
			case SPOCK:  return Resultado.PIERDE; 
			case PAPEL: return Resultado.GANA; 
			case LAGARTO: return Resultado.EMPATA; 
			case TIJERA: return Resultado.EMPATA; 
			}


}
return null;
}

	

}
