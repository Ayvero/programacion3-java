package ejercicio1;

public class Main_lista {
	
	    public static void main(String[] args) {
	        Lista<Integer> lista = new Lista<>();
	        lista.insertFront(3);
	        lista.insertFront(2);
	        lista.insertFront(1);
	        
	        System.out.println("Lista: " + lista); // Imprime: Lista: [1, 2, 3]
	        System.out.println("Tama�o de la lista: " + lista.size()); // Imprime: Tama�o de la lista: 3
	        
	        int elementoExtraido = lista.extractFront();
	        System.out.println("Elemento extra�do: " + elementoExtraido); // Imprime: Elemento extra�do: 1
	        System.out.println("Lista despu�s de extraer el primer elemento: " + lista); // Imprime: Lista despu�s de extraer el primer elemento: [2, 3]
	        
	        System.out.println("Elemento en la posici�n 1: " + lista.get(1)); // Imprime: Elemento en la posici�n 1: 3
	    }
	}



