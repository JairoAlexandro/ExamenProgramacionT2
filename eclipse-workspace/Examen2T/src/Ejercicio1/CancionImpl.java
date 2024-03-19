package Ejercicio1;

import java.util.List;

public class CancionImpl implements Cancion {
	// Propiedades
	private String nombre;
	private String id;
	private Double duracion;
	private Integer numeroPista;
	private Integer popularidad;
	private List<Artista> artistas;
	private String urlPreescucha;

	// Constructores
	public CancionImpl(String nombre, String id, Double duracion, Integer numeroPista, Integer popularidad,
			List<Artista> artistas, String urlPreescucha) {
		this.nombre = nombre;
		this.id = id;
		this.duracion = duracion;
		this.numeroPista = numeroPista;
		this.popularidad = popularidad;
		this.artistas = artistas;
		this.urlPreescucha = urlPreescucha;
	}

	// Métodos consultables
	public String getNombre() {
		return nombre;
	}

	public String getId() {
		return id;
	}

	public Double getDuracion() {
		return duracion;
	}

	public Integer getNumeroPista() {
		return numeroPista;
	}

	public Integer getPopularidad() {
		return popularidad;
	}

	public List<Artista> getArtistas() {
		return artistas;
	}

	public String getUrlPreescucha() {
		return urlPreescucha;
	}

	// Métodos modificables
	public void setPopularidad(Integer popularidad) {
		this.popularidad = popularidad;
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

		// R3: La URL de preescucha debe comenzar por "http"
		if (!urlPreescucha.startsWith("http")) {
			throw new IllegalArgumentException("La URL de preescucha debe comenzar por 'http'.");
		}
	}

	// Representación como cadena
	@Override
	public String toString() {
		StringBuilder artistasStr = new StringBuilder();
		for (int i = 0; i < artistas.size(); i++) {
			artistasStr.append(artistas.get(i).getNombre());
			if (i < artistas.size() - 1) {
				artistasStr.append(", ");
			}
		}
		return nombre + " [" + artistasStr.toString() + "]";
	}
}
