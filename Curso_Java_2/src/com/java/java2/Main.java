package com.java.java2;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		
		List<Datos> newData = 	getInfoDatos();		
		for (int i = 0; i < newData.size(); i++) {
			System.out.println("Datos: " + newData.get(i).getId() + "|" + newData.get(i).getName() + "|" + newData.get(i).getDescription() + "\n");
		}
		
		//Llamada a método definido en interfaz
		System.out.println(new Datos().infoSend());
		
		ObjetoSimple simple1 = ObjetoSimple.getInstance();
		ObjetoSimple simple2 = ObjetoSimple.getInstance();
		
		if(simple1 == simple2) {
			System.out.println("Es el mismo");
		}else {
			System.out.println("No es el mismo");
		}
		
		
		
		String[] palabras = {"Hola"};
		//String words = "Jose"; 
		
		//Expresión lambda, es una función anónima que no necesita clase
		Function<String,Integer> palab = words -> words.length();
		
		System.out.println("Rsultado: " + palab.apply("Jose"));
		
		getTreeMap();

	}
	
	public static List<Datos> getInfoDatos() {
		List<Datos> datos = null;
		Datos oDatos = null;
		try {
			datos = new ArrayList<Datos>();
			
			for (int i = 0; i < 10; i++) {
				oDatos = new Datos();
				oDatos.setId(String.valueOf(i));
				oDatos.setName(String.valueOf(i));
				oDatos.setDescription(String.valueOf(i));
				datos.add(oDatos);
			}
			
			System.out.println("Registros: " + datos.size());
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return datos;			
	}

	public static TreeMap<Integer, String> getTreeMap(){
		
		TreeMap<Integer, String> mapDatos = null;
		try {
			
			mapDatos = new TreeMap<Integer, String>();
			mapDatos.put(3, "Posición 3");
			mapDatos.put(2, "Posición 2");
			mapDatos.put(1, "Posición 1");
			mapDatos.put(0, "Posición 0");
			mapDatos.put(0, "Posición -1");
			
			for (int i = 0; i < mapDatos.size(); i++) {
				System.out.println("Orden: " + mapDatos.get(i));				
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return mapDatos;
	}
	
}
