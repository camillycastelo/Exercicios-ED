import java.util.Scanner;

public class buscaB {
    public static void main(String[] args) {
        int v[] = new int[50];

        // precisa estar ordenado para a busca binaria funcionar

        for (int i = 0; i < v.length; i++) {
            v[i] = i + 1;
        }

        buscaBinaria(v);
    }

    public static void buscaBinaria(int v[]){

       boolean achou = false; // O(1)
       Scanner leia = new Scanner(System.in);

       System.out.print("Digite o número que você quer achar: "); // O(1)
       int buscado = leia.nextInt(); // O(1)

       leia.close();

       int inicio = 0;
       int fim = v.length - 1;
       int meio = 0;
       int cont = 0;

       while(inicio <= fim){
           meio = (int) ((inicio + fim)/2);
           cont++;

           if(v[meio] == buscado){
               achou = true;
               break;
           } 
           else if(v[meio] < buscado){
               inicio = meio + 1;
           } 
           else {
               fim = meio - 1;
           }
       }

       if(achou == true){
           System.out.println("Achou, está na posição: " + meio );
       } else {
           System.out.println("Não encontramos!!");
       }

       System.out.println(cont);

       // O(log n)

   }
}

