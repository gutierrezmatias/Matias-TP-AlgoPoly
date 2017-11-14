package fiuba.algo3.celdas;

import fiuba.algo3.Jugador;
import fiuba.algo3.Visitante;
public interface Celda {

	void recibirJugador(Jugador unJugador);
	
	void sacarJugador(Jugador jugador);
	
	public int accept(Visitante visitor);

}
