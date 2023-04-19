import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        int idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 5 && idade <= 7) {
			System.out.println("infantil A = 5 - 7 anos");
		} 
		else if(idade >= 8 && idade <= 10) {
			System.out.println("infantil B = 8-10 anos");
		}
		else if(idade >= 11 && idade <= 13) {
			System.out.println("juvenil A = 11-13 anos");
		}
		else if(idade >= 14 && idade <= 17) {
			System.out.println("juvenil B = 14-17 anos");
		}
		else if (idade >= 18) {
			System.out.println("adulto = maiores de 18 anos");
		}
		else {
			System.out.println("Categoria Inexistente!");
		}
		
		leia.close();
    }
}
