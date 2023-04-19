import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num, result = 0, i = 0, aux = 0;
        
        System.out.print("Digite o número que quer converter para binário: ");
        num = leia.nextInt();

        aux = num;
        leia.close();

        do{
            aux = aux/2; 
            i++;        
        }while(aux != 0);

        Stack pilha = new Stack(i);

        do{
            result = (num % 2); 
            pilha.push(result);   
            num = num/2;  
        }while(num != 0);

        pilha.imprime();

        System.out.println("Valor no topo: " + pilha.top());
    }
}