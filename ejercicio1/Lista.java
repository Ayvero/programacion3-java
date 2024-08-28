package ejercicio1;


import java.util.Iterator;

public class Lista<T> implements Iterable<T> {
	    private Nodo<T> inicio;
	    private int tama�o;

	    public Lista() {
	        inicio = null;
	        tama�o = 0;
	    }
	    
	 // M�todo para obtener el �ndice de un elemento en la lista
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

	    // M�todo para insertar al frente de la lista
	    public void insertFront(T dato) {
	        Nodo<T> nuevoNodo = new Nodo<>(dato);
	        if (isEmpty()) {
	            inicio = nuevoNodo;
	        } else {
	            nuevoNodo.siguiente = inicio;
	            inicio = nuevoNodo;
	        }
	        tama�o++;
	    }

	    // M�todo para extraer el primer elemento de la lista
	    public T extractFront() {
	        if (isEmpty()) {
	            return null;
	        } else {
	            T datoExtraido = inicio.dato;
	            inicio = inicio.siguiente;
	            tama�o--;
	            return datoExtraido;
	        }
	    }

	    // M�todo para verificar si la lista est� vac�a
	    public boolean isEmpty() {
	        return tama�o == 0;
	    }

	    // M�todo para obtener el tama�o de la lista
	    public int size() {
	        return tama�o;
	    }

	    // M�todo para obtener el elemento en la posici�n index
	    public T get(int index) {
	        if (index < 0 || index >= tama�o) {
	            return null;
	        } else {
	            Nodo<T> actual = inicio;
	            for (int i = 0; i < index; i++) {
	                actual = actual.siguiente;
	            }
	            return actual.dato;
	        }
	    }

	    // M�todo para representar la lista como una cadena de caracteres
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

		



    // Implementaci�n de Iterable
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
                throw new IllegalStateException("No hay m�s elementos en la lista");
            }
            T dato = actual.dato;
            actual = actual.siguiente;
            return dato;
        }
    }
}


