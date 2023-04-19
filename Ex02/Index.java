import java.util.Scanner;

/**
 * Index
 */
public class Index {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int v[] = new int[50];

        for (int i = 0; i < v.length; i++) {
            v[i] = i + 1;
        }

        embaralhar(v);

        buscaLinear(v);

        buscaBinaria(v);
    }

    public static void embaralhar(int[] v){
        for (int i = v.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            int temp = v[i];
            v[i] = v[j];
            v[j] = temp;

            // System.out.println(v[i]);
        }
    }

    public static void buscaLinear(int []v){
        int buscar, i = 0; // O(1)
        Scanner leia = new Scanner(System.in); // O(1)
        boolean achou = false; // O(1)

        System.out.print("Digite o número que você quer achar: "); // O(1)
        buscar = leia.nextInt(); // O(1)

        leia.close(); 

        for(i = 0; i < v.length; i++){ // O(n)
            if(v[i] == buscar){ // O(1)
                achou = true; // O(1)
                break; // O(1)
            } 
        }

        if(achou == true){ // O(1)
            System.out.println("Achou, está na posição: " + (i - 1)); // O(1)
        } else { // O(1)
            System.out.println("Não encontramos!"); // O(1)
        }
   
    }

    public static void buscaBinaria(int v[]){

         // precisa estar ordenado 
         for (int i = 0; i < v.length; i++) {
            v[i] = i + 1;
            // System.out.println(v[i]);
        }

        boolean achou = false; // O(1)
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o número que você quer achar: "); // O(1)
        int buscado = leia.nextInt(); // O(1)

        leia.close();

        int inicio = 0;
        int fim = v.length - 1;
        int meio = 0;

        while(inicio <= fim){
            meio = (int) ((inicio + fim)/2);

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

        // O(log n)

    }
}

/*
 * 
 */