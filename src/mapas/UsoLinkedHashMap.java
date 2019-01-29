package mapas;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import clases.Persona;

public class UsoLinkedHashMap {

	private static final int LIMITE = 1000;
	private static final Random GENERADOR = new Random();

	public static void main(String[] args) {

		Map<String, Persona> mapa = new LinkedHashMap<>();
		
		for (int i=1; i <= LIMITE; i++) {
			int n = GENERADOR.nextInt(LIMITE) + 1;
			String dni = String.format("%08dX", n);
			Persona persona = new Persona("Persona " + i, dni, i, n);
			mapa.put(dni, persona);
		}
		
		for (Persona persona : mapa.values())
			System.out.println(persona);
		System.out.println("Número de elementos: " + mapa.size());
		System.out.println(mapa.containsKey("00000001X"));	
	}
}
