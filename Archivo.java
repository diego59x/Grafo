/**
___________________________________________________________________________________
| Archivo.java                                                                     |
| Fecha de creacion: 20/05/2020                                                    |
|                                                                                  |
* @author Diego Alvarez 19498                                                      |
| 																				   | 
|__________________________________________________________________________________|
*/


import java.util.*;
import java.io.*;
public class Archivo {


ArrayList<String> nodo = new ArrayList<String>();
ArrayList<String> ciudades = new ArrayList<String>();
String[] nodos;
int fila;
public ArrayList<String> ciudades(){
		String txt = "";
	    try {
			Scanner r = new Scanner(new File("guategrafo.txt")); 
			while (r.hasNextLine()) {
				txt = r.nextLine(); //Mientras hayan lineas por leer se meten a la variable txt
				fila += 1; 
				nodos = txt.split(","); 

				ciudades.add(nodos[0]); 
				ciudades.add(nodos[1]);
				for(int i = 0; i < nodos.length ; i++){
			 		
			 		nodo.add(nodos[i]);
			 		//System.out.println(nodo.get(i));
			 	}			

			}
			r.close();	
		} catch (Exception e) { //Se muestra la razon de error por la que no se encuentra el doc
			e.printStackTrace();
		
		}

		return nodo;
		}


public int cantNodos(){
	Set<String> set = new HashSet<>(ciudades);
	ciudades.clear();
	ciudades.addAll(set);
		

	//System.out.println("Espacio de " + ciudades.size());
	return ciudades.size();
}
public ArrayList<String> ciudad(){
	return ciudades;
}

public int filas(){
	//System.out.println("Hay "+ fila);
	return fila;
}



}