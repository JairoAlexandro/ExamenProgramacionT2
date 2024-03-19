package Ejercicio1;

import java.util.List;

public interface Album {
	// Métodos consultables
	String getNombre();

	String getId();

	Integer getPopularidad();

	Integer getAñoPublicacion();

	String getTipoAlbum();

	List<Cancion> getCanciones();

	List<Artista> getArtistas();

	List<String> getGeneros();

	List<String> getUrlImagenes();

	// Restricciones
	void verificarRestricciones() throws IllegalArgumentException;

	// Representación como cadena
	@Override
	String toString();

	// Criterio de igualdad
	@Override
	boolean equals(Object o);

	@Override
	int hashCode();
}
