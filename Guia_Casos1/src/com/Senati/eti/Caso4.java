package com.Senati.eti;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		float numero1 = 0;
		float numero2 = 0;
		System.out.print("primer numero: ");
		numero1 = sc.nextFloat();
		System.out.print("segundo numero: ");
		numero2 = sc.nextFloat();
		
		float suma = numero1 + numero2;
		float resta = numero1 - numero2;
		float producto = numero1 * numero2;
		float cociente = numero1 / numero2;
		float resto_entero = numero1 % numero2;
		
		System.out.println("/nResultados");
		System.out.println("--------------");
		System.out.println("suma......................: " + suma);
		System.out.println("resta.......................: " + resta);
		System.out.println("producto..............:" + producto);
		System.out.println("cociente................:" + cociente);
		System.out.println("resto_entero........:" + resto_entero);
		

	}

}
