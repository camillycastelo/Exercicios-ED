import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        int v1[] = new int[20];
		int v2[] = new int[20];
		int v3[] = new int[20];
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite 20 valores para cada vetor: ");
		System.out.println("Vetor 1: ");
		
		for(int i = 0; i < v1.length; i++) {
			System.out.print("Posição " + (i+1) + ": ");
			v1[i] = leia.nextInt();
		}
		
		System.out.println("Vetor 2: ");
		
		for(int i = 0; i < v2.length; i++) {
			System.out.print("Posição " + (i+1) + ": ");
			v2[i] = leia.nextInt();
		}
		
		for(int i = 0; i < v3.length; i++) {
			v3[i] = v1[i] + v2[i];
		}
		
		System.out.println("Vetor 3: ");
		for(int i = 0; i < v3.length; i++) {
			System.out.print(v3[i] + " | ");
		}
		
		leia.close(); 
    }
}
