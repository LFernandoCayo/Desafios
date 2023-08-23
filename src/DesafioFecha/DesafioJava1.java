package DesafioFecha;

import java.util.Scanner;
public class DesafioJava1 {
    
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	
		System.out.println("Ingrese el dia:  ");
		int dia = scanner.nextByte();
		
		System.out.println("Ingrese el mes:  ");
		int mes = scanner.nextByte();
		
		System.out.println("Ingrese el año:  ");
		int anio = scanner.nextByte();
		
		
		if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && anio >= 1900 && anio <= 2099) {
		    // Verificar si febrero tiene 29 días en caso de ser año bisiesto
		    boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
		    if (mes == 2 && dia > 29 && !esBisiesto) {
		        System.out.println("La fecha ingresada es incorrecta.");
		    } else {
		        System.out.println("La fecha ingresada es correcta.");
		    }
		} else {
		    System.out.println("La fecha ingresada es incorrecta.");
		

	scanner.close();
			
		}
	}

}
