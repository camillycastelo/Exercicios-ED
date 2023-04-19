public class ISort {
    public static void main(String[] args) {
        // ORDENAÇÃO DE VETOR

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }

        insertSort(vetor);
        imprime(vetor);
    }

    public static void insertSort(int vetor[]){

        // como se fosse um baralho, vai ir colocando aonde se encaixa

        int aux, j;

        for (int i = 1; i < vetor.length; i++) { // vai começar a partir do segundo valor do Array
            aux = vetor[i]; // aux vai receber o valor atual
            j = i - 1; // j vai receber o indice anterior ao indice atual
            
            while(j >= 0 && vetor[j] > aux){ // j >= 0 : enquanto houver elementos a serem comparados e o valor do indice anterior for maior que o valor atual
                vetor[j + 1] = vetor[j]; // o indice anterior (j) + 1 vai receber o valor de j pois o valor do indice j é maior
                j--;  // e vai decrementar para comparar com os outros anteriores 
            }

            vetor[j + 1] = aux; // no fim, j + 1 vai receber o valor atual, ficando na posição correta
        }

        
    }

    public static void imprime(int [] vetor){

        System.out.println("\nOrdenado:\n");

        for(int i = 0; i < vetor.length; i++){
            System.out.println(i +": " + vetor[i]);
        }
    }
        
    }

