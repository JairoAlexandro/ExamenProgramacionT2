package Ejercicio1;

import java.util.List;

public class AlbumImpl implements Album {
	// Propiedades
	private String nombre;
	private String id;
	private Integer popularidad;
	private Integer añoPublicacion;
	private String tipoAlbum;
	private List<Cancion> canciones;
	private List<Artista> artistas;
	private List<String> generos;
	private List<String> urlImagenes;

	// Constructores
	public AlbumImpl(String nombre, String id, Integer popularidad, Integer añoPublicacion, String tipoAlbum,
			List<Cancion> canciones, List<Artista> artistas, List<String> generos, List<String> urlImagenes) {
		this.nombre = nombre;
		this.id = id;
		this.popularidad = popularidad;
		this.añoPublicacion = añoPublicacion;
		this.tipoAlbum = tipoAlbum;
		this.canciones = canciones;
		this.artistas = artistas;
		this.generos = generos;
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

	public Integer getAñoPublicacion() {
		return añoPublicacion;
	}

	public String getTipoAlbum() {
		return tipoAlbum;
	}

	public List<Cancion> getCanciones() {
		return canciones;
	}

	public List<Artista> getArtistas() {
		return artistas;
	}

	public List<String> getGeneros() {
		return generos;
	}

	public List<String> getUrlImagenes() {
		return urlImagenes;
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

		// R3: La URL de todas las imágenes del álbum deben comenzar por "http"
		for (String url : urlImagenes) {
			if (!url.startsWith("http")) {
				throw new IllegalArgumentException("La URL de las imágenes debe comenzar por 'http'.");
			}
		}
	}

	// Representación como cadena
	@Override
	public String toString() {
		return nombre + " (" + id + ")";
	}

	// Criterio de igualdad
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof AlbumImpl))
			return false;
		AlbumImpl album = (AlbumImpl) o;
		return id.equals(album.id);
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
