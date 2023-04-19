import java.util.Scanner;

public class treinoBuscaB {
    public static void main(String[] args) {
        int v[] = new int[50];
        Scanner leia = new Scanner(System.in);

        for (int i = 0; i < v.length; i++) {
            v[i] = i + 1;
            System.out.println(v[i]);
        }

        System.out.println("Digite o número que quer encontrar:");
        int buscar = leia.nextInt();

        int inicio = 0;
        int fim = v.length - 1;
        int meio = 0;
        boolean achou = false;

        while(inicio <= fim){
            meio = (int)(inicio+fim)/2;

            if(v[meio] == buscar){
                achou = true;
                break;
            } 
            else if(buscar < meio){
                fim = meio - 1;
            } 
            else {
                inicio = meio + 1;
            }
        }

        if(achou){
            System.out.println("Encontramos, está na posição: " + meio);
        } else {
            System.out.println("Não encontramos!");
        }

        leia.close();
    }
}
