package ejercicio1;


import java.util.Iterator;

public class Lista<T> implements Iterable<T> {
	    private Nodo<T> inicio;
	    private int tamaño;

	    public Lista() {
	        inicio = null;
	        tamaño = 0;
	    }
	    
	 // Método para obtener el índice de un elemento en la lista
	    public int indexOf(T elemento) {
	        Nodo<T> actual = inicio;
	        int indice = 0;
	        while (actual != null) {
	            if (actual.dato.equals(elemento)) {
	                return indice;
	            }
	            actual = actual.siguiente;
	            indice++;
	        }
	        return -1; // Si el elemento no se encuentra en la lista
	    }

	    // Método para insertar al frente de la lista
	    public void insertFront(T dato) {
	        Nodo<T> nuevoNodo = new Nodo<>(dato);
	        if (isEmpty()) {
	            inicio = nuevoNodo;
	        } else {
	            nuevoNodo.siguiente = inicio;
	            inicio = nuevoNodo;
	        }
	        tamaño++;
	    }

	    // Método para extraer el primer elemento de la lista
	    public T extractFront() {
	        if (isEmpty()) {
	            return null;
	        } else {
	            T datoExtraido = inicio.dato;
	            inicio = inicio.siguiente;
	            tamaño--;
	            return datoExtraido;
	        }
	    }

	    // Método para verificar si la lista está vacía
	    public boolean isEmpty() {
	        return tamaño == 0;
	    }

	    // Método para obtener el tamaño de la lista
	    public int size() {
	        return tamaño;
	    }

	    // Método para obtener el elemento en la posición index
	    public T get(int index) {
	        if (index < 0 || index >= tamaño) {
	            return null;
	        } else {
	            Nodo<T> actual = inicio;
	            for (int i = 0; i < index; i++) {
	                actual = actual.siguiente;
	            }
	            return actual.dato;
	        }
	    }

	    // Método para representar la lista como una cadena de caracteres
	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("[");
	        Nodo<T> actual = inicio;
	        while (actual != null) {
	            sb.append(actual.dato.toString());
	            if (actual.siguiente != null) {
	                sb.append(", ");
	            }
	            actual = actual.siguiente;
	        }
	        sb.append("]");
	        return sb.toString();
	    }

		



    // Implementación de Iterable
    @Override
    public Iterator<T> iterator() {
        return new ListaIterator();
    }

    // Clase interna para el iterador personalizado
    private class ListaIterator implements Iterator<T> {
        private Nodo<T> actual;

        public ListaIterator() {
            actual = inicio;
        }

        @Override
        public boolean hasNext() {
            return actual != null;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new IllegalStateException("No hay más elementos en la lista");
            }
            T dato = actual.dato;
            actual = actual.siguiente;
            return dato;
        }
    }
}


