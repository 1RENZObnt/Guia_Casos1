package com.Senati.eti;

import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ingrese el nombre : ");
		String nombre = sc.nextLine(); //crea un objeto
		int cantidad = nombre.length(); //longitud()
        
		System.out.println("Resultados");
		System.out.println("--------------");
		System.out.println("Numero de caracteres: " + cantidad);
	}

}
