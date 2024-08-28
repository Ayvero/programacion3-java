package Backtracking_ej5;



import java.util.ArrayList;
import java.util.List;


/**
 * Ejercicio 5. Asignaci�n de tareas a procesadores. Se tienen m procesadores
 * id�nticos y n tareas con un tiempo de ejecuci�n dado. Se requiere encontrar
 * una asignaci�n de tareas a procesadores de manera de minimizar el tiempo de
 * ejecuci�n del total de tareas.
 * 
 * 
 *
 */

public class Main {

	public static void main(String[] args) {
		Tarea t1 = new Tarea("T1", 3);
		Tarea t2 = new Tarea("T2", 2);
		Tarea t3 = new Tarea("T3", 1);
		Tarea t4 = new Tarea("T4", 1);

		List<Tarea> tareas = new ArrayList<Tarea>();

		tareas.add(t1);
		tareas.add(t2);
		tareas.add(t3);
		tareas.add(t4);

		Backtracking backtracking = new Backtracking(tareas);

		List<List<Tarea>> resultado = backtracking.asignar();
		for (List<Tarea> procesador : resultado) {
			System.out.println("Resultado : " + procesador.toString());
		}

		System.out.println("------------------------------------");

		List<List<Tarea>> procesadores = new ArrayList<List<Tarea>>();
		procesadores.add(new ArrayList<Tarea>());
		procesadores.add(new ArrayList<Tarea>());
		procesadores.add(new ArrayList<Tarea>());

		Backtracking backtracking2 = new Backtracking(tareas, procesadores);

		List<List<Tarea>> resultado2 = backtracking2.asignarNProcesadores();
		for (List<Tarea> procesador : resultado2) {
			System.out.println("Resultado2 : " + procesador.toString());
		}

	}

}
