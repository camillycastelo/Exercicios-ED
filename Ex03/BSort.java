/**
 * BSort
 */
public class BSort {
    public static void main(String[] args) {
        // ORDENAÇÃO DE VETOR
        // - Bubble sort: lento mas bom para pequenos conjuntos de dados

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }

        bubbleSort(vetor);
        imprime(vetor);
    }

    public static void bubbleSort(int vetor[]){
        int temp;

        for(int i = 0; i < vetor.length - 1; i++){  // -1 pq o vetor.length vai mostrar, nesse caso, 10, mas as posições são de 0 até 9, e utiliza o simbolo "<" pois terá que ser menor que 9 nesse caso, pois percorre todos os elementos menos o último, pois não é necessário, visto que o último vai ser o maior automaticamente
            for(int j = 0; j < vetor.length - 1 - i; j++){ // percorra somente os elementos que ainda não foram ordenados nas iterações anteriores, ou seja, os últimos que vão ficando, então, o limite superior é diminuído em i, que é a quantidade de elementos já ordenados
                if(vetor[j] > vetor[j+1]){  // se o anterior for maior que o adjacente dele
                    temp = vetor[j];        // vai trocar o anterior com o valor adjacente
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = temp;
                }
            }
        }
    }

    public static void imprime(int [] vetor){

        System.out.println("\nOrdenado:\n");

        for(int i = 0; i < vetor.length; i++){
            System.out.println(i +": " + vetor[i]);
        }
    }
}