/**
 * index
 */

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        double notas[] = new double[3];
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota " + (i+1) + ": ");
			notas[i] = leia.nextDouble();
		}
		
		System.out.println("A média é: " + media(notas)); 
		
		leia.close();
	}
	
	public static double media(double[] notas){
		double medP;
		medP = ((notas[0] * 2) + (notas[1] * 3) + (notas[2] * 5))/(2+3+5);
		return medP;
    }
}