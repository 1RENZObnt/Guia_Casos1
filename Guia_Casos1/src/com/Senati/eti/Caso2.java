package com.Senati.eti;

//importar la lectura para lectura de datos
import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		
		// Instancia a la clase Scanner
		Scanner sc = new Scanner(System.in);

		//Declarar variable
		//Tipo nombre_variable = valor;
		int num = 0;
		System.out.print("ingrese su n�mero: ");
		num = sc.nextInt();
		
		//Concatenar la variable.
		System.out.println("numero ingresado: " + num);
	}

}
