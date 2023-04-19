/**
 * Ex03
 */
public class Tempo {

    public static void main(String[] args) {

        int[] vetor = new int[100000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            // System.out.println(vetor[i]);
        }

        long inicioB = System.currentTimeMillis();
        bubbleSort(vetor);
        long fimB = System.currentTimeMillis();

        System.out.println("Tempo final do BubbleSort: " + (fimB - inicioB));

        long inicioS = System.currentTimeMillis();
        selectionSort(vetor);
        long fimS = System.currentTimeMillis();

        System.out.println("Tempo final do SelectionSort: " + (fimS - inicioS));

        long inicioI = System.currentTimeMillis();
        insertSort(vetor);
        long fimI = System.currentTimeMillis();

        System.out.println("Tempo final do InsertSort: " + (fimI - inicioI));

        // imprime(vetor);
    }

    public static void bubbleSort(int vetor[]){
        int temp;

        for(int i = 0; i < vetor.length - 1; i++){  
            for(int j = 0; j < vetor.length - 1 - i; j++){ 
                if(vetor[j] > vetor[j+1]){  
                    temp = vetor[j];  
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int vetor[]){

        int posicao_menor, aux;

        for (int i = 0; i < vetor.length; i++) { 
            posicao_menor = i; 
            for(int j = i + 1; j < vetor.length; j++){ 
                if(vetor[j] < vetor[posicao_menor]){ 
                    posicao_menor = j; 
                }
            }

            aux = vetor[posicao_menor]; 
            vetor[posicao_menor] = vetor[i]; 
            vetor[i] = aux; 
       }
    }

    public static void insertSort(int vetor[]){
        int aux, j;

        for (int i = 1; i < vetor.length; i++) { 
            aux = vetor[i]; 
            j = i - 1; 
            
            while(j >= 0 && vetor[j] > aux){ 
                vetor[j + 1] = vetor[j]; 
                j--;   
            }

            vetor[j + 1] = aux; 
        }       
    }

    public static void imprime(int [] vetor){

        System.out.println("\nOrdenado:\n");

        for(int i = 0; i < vetor.length; i++){
            System.out.println(i +": " + vetor[i]);
        }
    }
}