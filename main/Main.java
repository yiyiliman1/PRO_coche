package main;

import java.util.Scanner;

import main1.Main1;

public class Main {

	public static void main(String[] args) {
		// correcion ejercicio coche
		/*Hacer un programa que pida los datos de un coche.	 
		 *los coches tienen: n�mero de plazas, matricula, numero de rueda, modelo, marca y deposito(litros).
		 *Los coches pueden repostar: repostar imprica que se recibe una cantidad de combustibnle y se a�ade al deposito
		 *Los cohes pueden pita: emiten un sonido.
		 *Los coches pueden moverse a una distancia, para ello, se indica cuantos km y se restan del deposito
		 *0,05 lt * 100 km recorrido
		 */
		Scanner scanner = new Scanner(System.in);
		
		String matricula;
		int plaza;
		int rueda;
		String modelo;
		String marca ;
		double deposito;
		
		
		System.out.println("Introduce la matricula: ");
		matricula = scanner.nextLine();
		System.out.println("Introduce la plaza: ");
		plaza = scanner.nextInt();
		System.out.println("Introduce la rueda: ");
		rueda = scanner.nextInt();
		System.out.println("Introduce la modelo: ");
		modelo = scanner.nextLine();
		System.out.println("Introduce la marca: ");
		marca = scanner.nextLine();
		System.out.println("Introduce la deposito: ");
		deposito = scanner.nextInt();
		
		Main1 coche = new Main1(matricula, plaza, rueda, modelo, marca, deposito);
		
		System.out.println("deposito inicial: " + coche.deposito);
		coche.repostar(5);
		System.out.println("deposito tras repostar: " + coche.deposito);
		coche.moverse(100);
		System.out.println("deposito tras moverse: " + coche.deposito);
		
	}

}
