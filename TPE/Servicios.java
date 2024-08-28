package TPE;


import java.util.*;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.HashMap;


import java.util.*;

public class Servicios {
    private CSVReader reader;

    public Servicios(String pathProcesadores, String pathTareas) {
        reader = new CSVReader();
        reader.readProcessors(pathProcesadores);
        reader.readTasks(pathTareas);
    }

    public MyTask servicio1(String ID) {
        return reader.getTasks().get(ID);
    }

    public List<MyTask> servicio2(boolean esCritica) {
        return esCritica ? reader.getCriticalTasks() : reader.getNonCriticalTasks();
    }

    public List<MyTask> servicio3(int prioridadInferior, int prioridadSuperior) {
        List<MyTask> result = new ArrayList<>();
        for (MyTask tarea : reader.getTasks().values()) {
            if (tarea.getNivelPrioridad() >= prioridadInferior && tarea.getNivelPrioridad() <= prioridadSuperior) {
                result.add(tarea);
            }
        }
        return result;
    }

/**
 * Lectura de archivos CSV: La complejidad temporal de la lectura de archivos depende del tama�o de los archivos y del rendimiento de la operaci�n de lectura de archivos en el sistema operativo y en la biblioteca utilizada. En t�rminos generales, si consideramos que la lectura de los archivos tiene una complejidad lineal con respecto al tama�o de los archivos, podr�amos considerar la complejidad como O(m + n), donde 'm' es el tama�o del archivo de procesadores y 'n' es el tama�o del archivo de tareas.

Inicializaci�n de los HashMaps y TreeMap: La inicializaci�n de HashMaps y TreeMap con datos preexistentes tiene una complejidad temporal O(n), donde 'n' es el n�mero de elementos que se est�n agregando a las estructuras de datos.

Entonces, la complejidad temporal total del constructor ser�a la suma de las complejidades de las operaciones individuales:

O(m + n) (lectura de archivos) + O(n) (inicializaci�n de HashMaps y TreeMap)

Donde 'm' es el tama�o del archivo de procesadores y 'n' es el tama�o del archivo de tareas.
 * @param ID
 * @return
 */
		 /**
	  * Devuelve una tarea basada en su ID. La complejidad temporal de esta operaci�n es O(1), 
	  * ya que, dado el ID, la b�squeda en un HashMap tiene complejidad constante.
	  * @param tarea
	  * @return
	  */
	 
		 /**
	  * Devuelve una lista de tareas que tienen una propiedad espec�fica (es cr�tica o no). 
	  * Itera sobre todas las tareas y verifica si cumplen con la condici�n. 
	  * La complejidad temporal de esta operaci�n es O(n), donde 'n' es el n�mero de tareas, 
	  * ya que en el peor de los casos tendr�a que revisar todas las tareas para construir la lista de salida.
	  * @param lista
	  * @return
	  */
	 public String listadoTareas (List<MyTask> lista){
		 StringBuilder listado = new StringBuilder();
		 	for (MyTask tarea : lista) {
	            listado.append(tarea.getDatosTarea()).append("\n");
	        }

	        return listado.toString();
		 }
	 
	  
	 
	    
	/**
	 * *operaciones principales que realiza:

	Creaci�n del submapa: La creaci�n del submapa utilizando el m�todo subMap tiene una complejidad temporal de O(log n), 
	donde n es el n�mero total de niveles de prioridad en el �rbol tareasPorPrioridad.
	Iteraci�n sobre el submapa y agregado de tareas: Iterar sobre el submapa y agregar las tareas a la lista tareasEnRango 
	tiene una complejidad lineal O(t), donde t es el n�mero total de tareas dentro del rango de prioridades especificado.
	Por lo tanto, la complejidad temporal total del m�todo servicio3_3 ser�a la suma de estas dos operaciones:
	O(log n) + O(t)
	Sin embargo, en la pr�ctica, la complejidad se ve dominada principalmente por el n�mero total de tareas dentro del rango de prioridades (t), 
	ya que la creaci�n del submapa es relativamente eficiente en t�rminos de tiempo. Por lo tanto, 
	la complejidad temporal del m�todo servicio3_3 se puede simplificar a:
	O(t) Donde t es el n�mero total de tareas dentro del rango de prioridades especificado.
	 * @param prioridadInferior
	 * @param prioridadSuperior
	 * @return
	 */
	 
/*  * En el peor de los casos, si todas las entradas est�n en el rango, el iterador recorrer� todas las entradas 
	  * del TreeMap y agregar� todas las listas de tareas, lo que nos da una complejidad de:
		O(N) para iterar sobre todas las entradas del TreeMap.
		O(K) para agregar todas las listas de tareas donde 'K' es el total de tareas que cumplen la condici�n.
		Por lo tanto, la complejidad total del m�todo es O(N + K), donde 'N' es el n�mero de entradas en el TreeMap y 'K' es el n�mero total de tareas que cumplen la condici�n de estar dentro del rango de prioridades especificado.
	  * @param prioridadInferior
	  * @param prioridadSuperior
	  * @return
	  */

	 public HashMap<String, MyTask> getTasks() {
		// TODO Esbozo de m�todo generado autom�ticamente
		return null;
	}

}
