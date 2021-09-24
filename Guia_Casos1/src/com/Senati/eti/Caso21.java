package com.Senati.eti;
import java.util.Scanner;

public class Caso21 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		int gasto, disminucion = 0;
		
		System.out.println("Escribe el valor del gasto: ");
		gasto = sc.nextInt();

		disminucion = (gasto) - 12/100;
		
		System.out.println("El valor disminuido es :.......: " + disminucion);
		

	}

}
