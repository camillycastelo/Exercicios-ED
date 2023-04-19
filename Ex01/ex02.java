import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        int x1, x2, y1, y2;
		double distancia;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite as coordenadas do plano: ");
		
		System.out.print("X1: ");
		x1 = leia.nextInt();
		
		System.out.print("X2: ");
		x2 = leia.nextInt();
		
		System.out.print("Y1: ");
		y1 = leia.nextInt();
		
		System.out.print("Y2: ");
		y2 = leia.nextInt();
				
		distancia = (Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
		distancia = Math.sqrt(distancia);
		
		System.out.println("A distancia é: " + distancia);
		
		leia.close();
    }
}
