package ejercicio5;


	import java.util.*;

	public class Lista {

	    public static <T extends Comparable<T>> Lista<T> interseccionListasDesordenadas(Lista lista1, Lista<T> lista2) {
	        Lista<T> listaResultado = new Lista<>();

	        // Convertimos ambas listas a conjuntos para eliminar duplicados
	        Set<T> setLista1 = new HashSet<>();
	        Set<T> setLista2 = new HashSet<>();

	        for (T elemento : lista1) {
	            setLista1.add(elemento);
	        }

	        for (T elemento : lista2) {
	            setLista2.add(elemento);
	        }

	        // Iteramos sobre el conjunto de una de las listas y comprobamos si los elementos
	        // están en el otro conjunto. Si lo están, los añadimos a la lista resultado.
	        for (T elemento : setLista1) {
	            if (setLista2.contains(elemento)) {
	                listaResultado.insertFront(elemento);
	            }
	        }

	        // Ordenamos la lista resultado
	        listaResultado.sort();

	        return listaResultado;
	    }

	    
