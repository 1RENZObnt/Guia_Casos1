package com.Senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float numero1 = 0;
		float numero2 = 0;
		System.out.print("primer numero: ");
		numero1 = sc.nextFloat();
		System.out.print("segundo numero: ");
		numero2 = sc.nextFloat();
		
		//aplicar un Cast: convertir un tipo de dato a otro.
		
		float resultado1 = (numero1 + numero2) / 2; 
		float resultado2 = (numero1 + numero1 * 0.2f); //forma 1
		float resultado3 = (float) (numero2 - numero2 * 0.3); //forma2
		
		System.out.println("/nResultados");
		System.out.println("--------------");
		System.out.println("resultado 1..............: " + resultado1);
		System.out.println("resultado 2..............: " + resultado2);
		System.out.println("resultado 3..............:" + resultado3);
		
		
		
		

	}

}
