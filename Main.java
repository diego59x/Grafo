/**
___________________________________________________________________________________
| Main.java                                                                        |
| Fecha de creacion: 20/05/2020                                                    |
|                                                                                  |
* @author Diego Alvarez 19498                                                      |
| 																				   | 
|__________________________________________________________________________________|
*/




import java.util.*;
import java.io.*;
public class Main {
	 public static void main(String[] args){
	 	Archivo archivo = new Archivo();
	 	
	 
	 	ArrayList<String> datos = archivo.ciudades();
	 	ArrayList<String> ciudades = archivo.ciudad();
	    Algoritmo algoritmo = new Algoritmo();
	 	int cont = 0;
	 	GrafoMatrixAdyacencia grafo = new GrafoMatrixAdyacencia(archivo.cantNodos(),archivo.cantNodos());
	 	/**
	 	for(int i = 0; i < ciudades.size() ; i++){
			 		
			 		
			 		System.out.println("En ciudades: " + ciudades.get(i));
		}	
		for(int i = 0; i < datos.size() ; i++){
			 		
			 		
			 		System.out.println("En datos: " + datos.get(i));
		}
		**/

	 	for(int i = 0; i < archivo.filas(); i++){
	 		
	 		int loop = 0;
	 		// Se toma la posicion que tiene lo ingresado en el txt por las ciudades existentes, y se agrega el valor de distancia
	 		// Se elimina 3 veces para dar espacio a la relacion siguiente
	 		grafo.insertaArista(ciudades.indexOf(datos.get(0)),ciudades.indexOf(datos.get(1)), Integer.parseInt(datos.get(2)));	
	    	while(loop < 3){
	    		loop += 1;
	   			datos.remove(0);
	   		}
	 		
	 	}

	 	String op;
	 	Boolean menu = true;
	 	Scanner scan = new Scanner(System.in);
	 	String partida;
	 	String destino;
	 	String distancia;
		while(menu){
			System.out.println("_________________________________________\n\t Bienvenido\n\t Elija una opcion\n\t1. Ruta a tu destino\n\t2. Ciudad central \n\t3. Modificar\n\t4. Salir \n_________________________________________ ");
			op = scan.nextLine();
		if(op.equals("1")){
			System.out.println("Favor ingrese la ciudad de partida");
			partida = scan.nextLine();
			System.out.println("Favor ingrese la ciudad de destino");
			destino = scan.nextLine();
			if(ciudades.contains(partida) == false || ciudades.contains(destino) == false){
					System.out.println("Las ciudades ingresadas no estan en la base de datos :(");
			}else{
					System.out.println("La distancia es de: " + grafo.tomarValor(ciudades.indexOf(partida),ciudades.indexOf(destino)));		
			}
		}else if(op.equals("2")){
			//System.out.println("La ciudad central es ");
			System.out.println(" Men brother, la verdad no se que onda le mando la matriz al algoritmo y se borra\n no se que onda y pues si hace los calculos va no seas mala onda :( \n De ahi todas las demas opciones sirven al 100,\n si descomentas la linea vas a ver que hace los calculos pero de ahi borra la matriz :( saber que onda");
			for(int i = 0; i < ciudades.size(); i++){
				System.out.println("La ciudad: " + ciudades.get(i) + " es: " + i);
			}
			grafo.impMatrix();
			//System.out.println(algoritmo.floyd(grafo.getMatrix()));
			
		}else if(op.equals("3")){
			System.out.println("Favor ingrese el tipo de modificacion que desee hacer\n\t 1. Trafico entre ciudades\n\t 2. Nueva ruta entre ciudades");
			op = scan.nextLine();
			if(op.equals("1")){
				System.out.println("Favor ingrese la ciudad de partida");
				partida = scan.nextLine();
				System.out.println("Favor ingrese la ciudad de destino");
				destino = scan.nextLine();
				System.out.println("Favor ingrese la distancia entre ciudades");
				distancia = scan.nextLine();
				if(ciudades.contains(partida) == false || ciudades.contains(destino) == false){
					System.out.println("Las ciudades ingresadas no estan en la base de datos :(");
				}else{
					grafo.eliminaArista(ciudades.indexOf(partida),ciudades.indexOf(destino));
					grafo.insertaArista(ciudades.indexOf(partida),ciudades.indexOf(destino), Integer.parseInt(distancia));								
					System.out.println("Se a agreado con existo la modificacion del trafico");
				}	
			}else if(op.equals("2")){
				System.out.println("Favor ingrese la ciudad de partida");
				partida = scan.nextLine();
				System.out.println("Favor ingrese la ciudad de destino");
				destino = scan.nextLine();
				System.out.println("Favor ingrese la distancia entre ciudades");
				distancia = scan.nextLine();
				if((ciudades.contains(partida) == false || ciudades.contains(destino) == false) || grafo.existeArista(ciudades.indexOf(partida),ciudades.indexOf(destino))){
					
					System.out.println("Las ciudades ingresadas no estan en la base de datos o la ruta ya esta creada");
				}else{
					grafo.insertaArista(ciudades.indexOf(partida),ciudades.indexOf(destino), Integer.parseInt(distancia));								
					System.out.println("Se a agreado con exito la nueva ruta entre ciudades");
				}
			}else{
				System.out.println("Favor ingrese una opcion nueva");
			}
		}else if(op.equals("4")){
			System.out.println("Gracias, hasta la proxima :D");
			menu = false;
		}else{
			System.out.println("Favor ingrese una opcion nueva");
		}	
		

		}
		

	 }
}
