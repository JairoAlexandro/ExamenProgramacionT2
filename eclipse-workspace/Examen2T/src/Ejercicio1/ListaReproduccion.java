package Ejercicio1;

import java.util.List;

public interface ListaReproduccion {
	// Métodos consultables
	String getNombre();

	List<Cancion> getCanciones();

	Integer getNumeroCanciones();

	// Método modificable
	void setNombre(String nombre);

	// Representación como cadena
	@Override
	String toString();

	// Criterio de igualdad
	@Override
	boolean equals(Object o);

	@Override
	int hashCode();
}
