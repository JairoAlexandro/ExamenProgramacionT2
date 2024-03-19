package Ejercicio1;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ListaReproduccionImpl implements ListaReproduccion {
	// Propiedades
	private String nombre;
	private List<Cancion> canciones;

	// Constructores
	public ListaReproduccionImpl(String nombre) {
		this.nombre = nombre;
		this.canciones = new ArrayList<>();
	}

	// Métodos consultables
	public String getNombre() {
		return nombre;
	}

	public List<Cancion> getCanciones() {
		return canciones;
	}

	public Integer getNumeroCanciones() {
		return canciones.size();
	}

	// Métodos modificables
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Representación como cadena
	@Override
	public String toString() {
		return nombre + " (" + canciones.size() + " canciones)";
	}

	// Criterio de igualdad
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof ListaReproduccionImpl))
			return false;
		ListaReproduccionImpl that = (ListaReproduccionImpl) o;
		return canciones.equals(that.canciones);
	}

	@Override
	public int hashCode() {
		return Objects.hash(canciones);
	}

	// Metodos Ejercicio1

	public ListaReproduccion getSublistaArtista(String artista) {
		ListaReproduccion lista = new ListaReproduccionImpl(artista);
		for (Cancion c : canciones) {
			for (Artista a : c.getArtistas()) {
				if (a.getNombre().equalsIgnoreCase(artista)) {
					this.canciones.add(c);
				}
			}
		}
		return lista;
	}

	public void muestraFotosArtistas() {
		for (Cancion c : canciones) {
			for (Artista a : c.getArtistas()) {
				if (!a.getUrlImagenes().isEmpty()) {
					Imagenes.show(a.getNombre(), a.getUrlImagenes().get(0));

				}
			}
		}
	}

	public List<Cancion> getcancionesPorArtista(String idArtista) {
		List<Cancion> cancionesArtista = new ArrayList<Cancion>();
		for (Cancion c : canciones) {
			for (Artista a : c.getArtistas()) {
				if (a.getId().equalsIgnoreCase(idArtista) && !cancionesArtista.contains(c)) {
					cancionesArtista.add(c);
				}
			}
		}
		return cancionesArtista;
	}

	public Map<String, List<Artista>> artistasPorGenero() {
		Map<String, List<Artista>> artistasPorGenero = new Hashtable<String, List<Artista>>();
		List<Artista> artis = new ArrayList<Artista>();
		for (Cancion c : canciones) {
			for (Artista a : c.getArtistas()) {
				for (String g : a.getGeneros()) {
					if (!artistasPorGenero.containsKey(g)) {
						artis = new ArrayList<Artista>();
						artis.add(a);
						artistasPorGenero.put(g, artis);
					} else {
						artistasPorGenero.get(g).add(a);
					}
				}
			}
		}
		return artistasPorGenero;
	}
}
