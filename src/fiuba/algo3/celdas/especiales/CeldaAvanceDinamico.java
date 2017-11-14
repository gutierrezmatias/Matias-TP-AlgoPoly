package fiuba.algo3.celdas.especiales;



import fiuba.algo3.Dado;
import fiuba.algo3.Jugador;
import fiuba.algo3.Visitante;
import fiuba.algo3.celdas.Celda;

public class CeldaAvanceDinamico implements Celda {
	
	@Override
	public void recibirJugador(Jugador unJugador) {
		
	}
	
	public int calcularAvance(Jugador unJugador, Dado dado1, Dado dado2) {
		int resta = 2;
		int totalTiro = dado1.getValor() + dado2.getValor();
		if(totalTiro <= 6) {
			return totalTiro - resta;
		}
		else if (totalTiro > 6 && totalTiro <= 10) {
			return unJugador.obtenerDinero() % totalTiro;
		}
		return totalTiro - unJugador.getCantidadDePropiedades();
	}

	@Override
	public void sacarJugador(Jugador jugador) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int accept(Visitante visitor) {
		// TODO Auto-generated method stub
		return 0;
	}
		
}
