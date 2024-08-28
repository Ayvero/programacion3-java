package ejercicio5;

public class Main {
	public static void main(String[] args) {
        // Ejemplo de uso
        Lista<Integer> lista1 = new Lista<>();
        lista1.insertFront(3);
        lista1.insertFront(1);
        lista1.insertFront(4);

        Lista<Integer> lista2 = new Lista<>();
        lista2.insertFront(2);
        lista2.insertFront(3);
        lista2.insertFront(4);

        Lista<Integer> listaResultado = interseccionListasDesordenadas(lista1, lista2);
        System.out.println("Lista resultado: " + listaResultado);
    }
}




