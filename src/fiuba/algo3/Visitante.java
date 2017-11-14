package fiuba.algo3;

import fiuba.algo3.celdas.CeldaBarrio;
import fiuba.algo3.celdas.CeldaSalida;
import fiuba.algo3.celdas.especiales.CeldaQuini6;

 public interface Visitante {
	public int visitar(CeldaBarrio barrio1);
	public int visitar(CeldaSalida salida);
	public int visitar(CeldaQuini6 quini);
}
