import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        int idDias;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a sua idade em dias: ");
		idDias = leia.nextInt();
		
		idade(idDias);
		
		leia.close();
	}
	
	public static void idade(int idDias) {		
		double anos, meses;		
		anos = (idDias / 365.0);
		anos = Math.floor(anos);
		meses = (((idDias/365.0) - anos) * 12);
		meses = Math.floor(meses);
		System.out.println("Anos: " + anos);
		System.out.println("Meses: " + meses);
		
		
	}    
}
