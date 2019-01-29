package listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ComparativaTiempos {
	
	private static final int LIMITE = 50000;
	private static final Random GENERADOR = new Random();
	
	public static void main(String[] args) {
		
		System.out.println("Límite = " + LIMITE);
		
		List<Integer> arrayList = new ArrayList<>();
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < LIMITE; i++) {
			arrayList.add(i);
		}
		long fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en insertar(al final) por el ArrayList: " + (fin - inicio));
		 
		List<Integer> linkedList = new LinkedList<>();
		inicio = System.currentTimeMillis();
		for (int i = 0; i < LIMITE; i++) {
			linkedList.add(i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en insertar (al final) por el LinkedList: " + (fin - inicio));
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < LIMITE; i++) {
			int posicion = GENERADOR.nextInt(LIMITE);
			arrayList.add(posicion, i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en insertar(en posiciones aleatorias) por el ArrayList: " + (fin - inicio));
		 
		inicio = System.currentTimeMillis();
		for (int i = 0; i < LIMITE; i++) {
			int posicion = GENERADOR.nextInt(LIMITE);
			linkedList.add(posicion, i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en insertar (en posiciones aleatorias) por el LinkedList: " + (fin - inicio));
		
		inicio = System.currentTimeMillis();
		for (Integer integer : arrayList) {
			arrayList.contains(integer);
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en recorrer y buscar por el ArrayList: " + (fin - inicio));
		
		inicio = System.currentTimeMillis();
		for (Integer integer : linkedList) {
			linkedList.contains(integer);
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en recorrer y buscar por el LinkedList: " + (fin - inicio));
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < arrayList.size(); i++) {
			arrayList.remove(i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en borrar por el ArrayList: " + (fin - inicio));
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < linkedList.size(); i++) {
			linkedList.remove(i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en borrar por el LinkedList: " + (fin - inicio));

	}

}
