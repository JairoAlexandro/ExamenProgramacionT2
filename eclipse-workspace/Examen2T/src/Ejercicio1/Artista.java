package Ejercicio1;

import java.util.List;

public interface Artista {
	// Métodos consultables
	String getNombre();

	String getId();

	Integer getPopularidad();

	List<String> getGeneros();

	List<String> getPremios();

	List<String> getUrlImagenes();

	// Métodos modificables
	void setPopularidad(Integer popularidad);

	void setPremios(List<String> premios);

	void setUrlImagenes(List<String> urlImagenes);

	// Restricciones
	void verificarRestricciones() throws IllegalArgumentException;
}
