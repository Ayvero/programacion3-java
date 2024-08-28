package ejercicio7;

public class Lista<T> {
	
    private Nodo<T> inicio;
    private Nodo<T> fin;
    private int tama�o;

    public Lista() {
        inicio = null;
        fin = null;
        tama�o = 0;
    }

    public void insertFront(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (isEmpty()) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            nuevoNodo.siguiente = inicio;
            inicio.anterior = nuevoNodo;
            inicio = nuevoNodo;
        }
        tama�o++;
    }

    public void insertBack(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (isEmpty()) {
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else {
            fin.siguiente = nuevoNodo;
            nuevoNodo.anterior = fin;
            fin = nuevoNodo;
        }
        tama�o++;
    }

    public T extractFront() {
        if (isEmpty()) {
            return null;
        } else {
            T datoExtraido = inicio.dato;
            inicio = inicio.siguiente;
            if (inicio != null) {
                inicio.anterior = null;
            } else {
                fin = null;
            }
            tama�o--;
            return datoExtraido;
        }
    }

    public T extractBack() {
        if (isEmpty()) {
            return null;
        } else {
            T datoExtraido = fin.dato;
            fin = fin.anterior;
            if (fin != null) {
                fin.siguiente = null;
            } else {
                inicio = null;
            }
            tama�o--;
            return datoExtraido;
        }
    }

    public boolean isEmpty() {
        return tama�o == 0;
    }

    public int size() {
        return tama�o;
    }

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

    public String toStringReversed() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Nodo<T> actual = fin;
        while (actual != null) {
            sb.append(actual.dato.toString());
            if (actual.anterior != null) {
                sb.append(", ");
            }
            actual = actual.anterior;
        }
        sb.append("]");
        return sb.toString();
    }
}

