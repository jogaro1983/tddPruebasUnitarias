package com.java.java2;

public final class ObjetoSimple {
	
	private String name;
	private String edad;
		

	private static final ObjetoSimple onlyInstance = new ObjetoSimple();
	
	public ObjetoSimple() {
		name = "Jose";
		edad = "36";
	}
	
	public static ObjetoSimple getInstance() {
		return onlyInstance;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

}
