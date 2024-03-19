package Ejercicio1;

import java.util.List;

public interface Cancion {
	// Métodos consultables
	String getNombre();

	String getId();

	Double getDuracion();

	Integer getNumeroPista();

	Integer getPopularidad();

	List<Artista> getArtistas();

	String getUrlPreescucha();

	// Método modificable
	void setPopularidad(Integer popularidad);

	// Restricciones
	void verificarRestricciones() throws IllegalArgumentException;
}
