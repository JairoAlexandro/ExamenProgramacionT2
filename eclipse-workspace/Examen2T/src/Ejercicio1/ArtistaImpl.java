package Ejercicio1;

import java.util.List;

public class ArtistaImpl implements Artista {
	// Propiedades
	private String nombre;
	private String id;
	private Integer popularidad;
	private List<String> generos;
	private List<String> premios;
	private List<String> urlImagenes;

	// Constructores
	public ArtistaImpl(String nombre, String id, Integer popularidad, List<String> generos, List<String> premios,
			List<String> urlImagenes) {
		this.nombre = nombre;
		this.id = id;
		this.popularidad = popularidad;
		this.generos = generos;
		this.premios = premios;
		this.urlImagenes = urlImagenes;
	}

	// Métodos consultables
	public String getNombre() {
		return nombre;
	}

	public String getId() {
		return id;
	}

	public Integer getPopularidad() {
		return popularidad;
	}

	public List<String> getGeneros() {
		return generos;
	}

	public List<String> getPremios() {
		return premios;
	}

	public List<String> getUrlImagenes() {
		return urlImagenes;
	}

	// Métodos modificables
	public void setPopularidad(Integer popularidad) {
		this.popularidad = popularidad;
	}

	public void setPremios(List<String> premios) {
		this.premios = premios;
	}

	public void setUrlImagenes(List<String> urlImagenes) {
		this.urlImagenes = urlImagenes;
	}

	// Restricciones
	public void verificarRestricciones() throws IllegalArgumentException {
		// R1: El id debe contener 22 caracteres
		if (id.length() != 22) {
			throw new IllegalArgumentException("El ID debe contener exactamente 22 caracteres.");
		}

		// R2: La popularidad debe estar comprendida entre 0 y 100, ambos inclusive
		if (popularidad < 0 || popularidad > 100) {
			throw new IllegalArgumentException("La popularidad debe estar comprendida entre 0 y 100.");
		}

		// R3: La URL de todas las imágenes del artista deben comenzar por "http"
		for (String url : urlImagenes) {
			if (!url.startsWith("http")) {
				throw new IllegalArgumentException("La URL de las imágenes debe comenzar por 'http'.");
			}
		}
	}
}
