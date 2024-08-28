package ejercicio1;

public class Main_lista {
	
	    public static void main(String[] args) {
	        Lista<Integer> lista = new Lista<>();
	        lista.insertFront(3);
	        lista.insertFront(2);
	        lista.insertFront(1);
	        
	        System.out.println("Lista: " + lista); // Imprime: Lista: [1, 2, 3]
	        System.out.println("Tamaño de la lista: " + lista.size()); // Imprime: Tamaño de la lista: 3
	        
	        int elementoExtraido = lista.extractFront();
	        System.out.println("Elemento extraído: " + elementoExtraido); // Imprime: Elemento extraído: 1
	        System.out.println("Lista después de extraer el primer elemento: " + lista); // Imprime: Lista después de extraer el primer elemento: [2, 3]
	        
	        System.out.println("Elemento en la posición 1: " + lista.get(1)); // Imprime: Elemento en la posición 1: 3
	    }
	}



