package clases;

public class Persona implements Comparable<Persona> {
	private static final String ER_DNI = "\\d{8}[A-Z]";
	private String nombre;
	private String dni;
	private int peso;
	private int altura;
	
	public Persona(String nombre, String dni, int peso, int altura) {
		setNombre(nombre);
		setDni(dni);
		setPeso(peso);
		setAltura(altura);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre == null) {
			throw new IllegalArgumentException("El nombre no puede ser nulo.");
		}
		if (nombre.trim().equals("")) {
			throw new IllegalArgumentException("El nombre no puede estar vacío.");
		}
		this.nombre = nombre;
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		if (dni == null) {
			throw new IllegalArgumentException("El DNI no puede ser nulo.");
		}
		if (!dni.matches(ER_DNI)) {
			throw new IllegalArgumentException("El DNI no tiene un formato válido.");
		}
		this.dni = dni;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		if (peso <= 0) {
			throw new IllegalArgumentException("El peso debe ser mayor que cero.");
		}
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		if (altura <= 0) {
			throw new IllegalArgumentException("La altura de una persona debe ser mayor que cero.");
		}
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return String.format("Nombre: %s DNI: %s Peso: %d Altura: %d", nombre, dni, peso, altura);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Persona)) {
			return false;
		}
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null) {
				return false;
			}
		} else if (!dni.equals(other.dni)) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Persona otra) {
		return dni.compareTo(otra.getDni());
	}
	
	

}
