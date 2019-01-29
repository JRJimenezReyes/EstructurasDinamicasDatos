package conjuntos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ComparativaTiempos {
	
	private static final int LIMITE = 5000000;

	public static void main(String[] args) {
		
		System.out.println("Límite = " + LIMITE);
		
		Set<Integer> hashSet = new HashSet<>();
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < LIMITE; i++) {
		    hashSet.add(i);
		}
		long fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en insertar por el HashSet: " + (fin - inicio));
		 
		Set<Integer> treeSet = new TreeSet<>();
		inicio = System.currentTimeMillis();
		for (int i = 0; i < LIMITE; i++) {
		    treeSet.add(i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en insertar por el TreeSet: " + (fin - inicio));
		 
		Set<Integer> linkedHashSet = new LinkedHashSet<>(LIMITE);
		inicio = System.currentTimeMillis();
		for (int i = 0; i < LIMITE; i++) {
		    linkedHashSet.add(i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en insertar por el LinkedHashSet: " + (fin - inicio));
		
		inicio = System.currentTimeMillis();
		for (Integer integer : hashSet) {
			hashSet.contains(integer);
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en recorrer y buscar por el HashSet: " + (fin - inicio));
		
		inicio = System.currentTimeMillis();
		for (Integer integer : treeSet) {
			treeSet.contains(integer);
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en recorrer y buscar por el TreeSet: " + (fin - inicio));
		
		inicio = System.currentTimeMillis();
		for (Integer integer : linkedHashSet) {
			linkedHashSet.contains(integer);
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en recorrer y buscar por el LinkedHashSet: " + (fin - inicio));
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < hashSet.size(); i++) {
			hashSet.remove(i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en borrar por el HashSet: " + (fin - inicio));
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < treeSet.size(); i++) {
			treeSet.remove(i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en borrar por el TreeSet: " + (fin - inicio));
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < linkedHashSet.size(); i++) {
			linkedHashSet.remove(i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en borrar por el LinkedHashSet: " + (fin - inicio));

	}

}
