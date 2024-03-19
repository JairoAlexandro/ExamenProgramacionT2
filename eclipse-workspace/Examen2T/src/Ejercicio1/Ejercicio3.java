package Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {
		Random rm = new Random();
		int fila = rm.nextInt(10);
		
		int [][] array = new int[fila][];
		
		for (int i = 0; i < array.length; i++) {
			int colum = rm.nextInt(9)+1;
			array[i] = new int [colum];
		}
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j]= rm.nextInt(10)+10;
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		
		List<Integer> lista = new ArrayList<Integer>();
		
		int col = 0;
		int fil = array.length-1;
		for(int i = array.length-1; i >= 0; i--) {
			for(int j = array[i].length-1; j >= 0; j--) {
				if(fil == i && col == j) {
					lista.add(array[i][j]);
					fil--;
					col++;
				}
			}
			
			
		}
		System.out.println();
		
		for(Integer l: lista) {
			System.out.print(l + " ");
		}
		System.out.println();
		int min = lista.get(0);
		int max = 0;
		int suma = 0;
		for(Integer l: lista) {
			if(max < l) {
				max = l;
			}
			if(min > l) {
				min = l;
			}
			suma += l;
		}
		double media = (double) suma/lista.size();
		
		System.out.println("El minimo: " + min + ", El maximo: " + max + ", La media: " + media);
		

	}

}
