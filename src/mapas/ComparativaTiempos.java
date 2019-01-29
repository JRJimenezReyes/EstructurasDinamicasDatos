package mapas;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ComparativaTiempos {
	
	private static final int LIMITE = 1000000;

	public static void main(String[] args) {
		
		System.out.println("Límite = " + LIMITE);
				
		Map<String, Integer> hashMap = new HashMap<>();
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < LIMITE; i++) {
		    hashMap.put(""+i, i);
		}
		long fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en insertar por el HashMap: " + (fin - inicio));
		
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		inicio = System.currentTimeMillis();
		for (int i = 0; i < LIMITE; i++) {
			linkedHashMap.put(""+i, i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en insertar por el LinkedHashMap: " + (fin - inicio));
		 
		Map<String, Integer> treeMap = new TreeMap<>();
		inicio = System.currentTimeMillis();
		for (int i = 0; i < LIMITE; i++) {
		    treeMap.put(""+i, i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en insertar por el TreeMap: " + (fin - inicio));
		
		inicio = System.currentTimeMillis();
		for (String string : hashMap.keySet()) {
			hashMap.get(string);
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en recorrer y buscar por el HashMap: " + (fin - inicio));
		
		inicio = System.currentTimeMillis();
		for (String string : linkedHashMap.keySet()) {
			linkedHashMap.get(string);
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en recorrer y buscar por el LinkedHashMap: " + (fin - inicio));
		
		inicio = System.currentTimeMillis();
		for (String string : treeMap.keySet()) {
			treeMap.get(string);
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en recorrer y buscar por el TreeMap: " + (fin - inicio));
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < hashMap.size(); i++) {
			hashMap.remove(""+i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en borrar por el HashMap: " + (fin - inicio));
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < linkedHashMap.size(); i++) {
			linkedHashMap.remove(""+i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en borrar por el LinkedHashMap: " + (fin - inicio));
		
		inicio = System.currentTimeMillis();
		for (int i = 0; i < treeMap.size(); i++) {
			treeMap.remove(""+i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo empleado en borrar por el TreeMap: " + (fin - inicio));

	}

}
