public class SSort {
    public static void main(String[] args) {
         // ORDENAÇÃO DE VETOR

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.println(vetor[i]);
        }

        selectionSort(vetor);
        imprime(vetor);
    }

    public static void selectionSort(int vetor[]){

        int posicao_menor, aux;

        // consiste em se varrer o arranjo comparando todos os seus elementos com o primeiro. Caso o primeiro elemento esteja desordenado em relação ao elemento que está sendo comparado com ele no momento, é feita a troca. 

        for (int i = 0; i < vetor.length; i++) { // percorre todos os elementos
            posicao_menor = i; // vai começar com o primeiro número do vetor
            for(int j = i + 1; j < vetor.length; j++){ // vai percorrer todos os elementos do vetor, porém vai começar com o adjacente de i, por isso, i + 1
                if(vetor[j] < vetor[posicao_menor]){ // se o valor da posição adjacente for menor que o valor de menor posição...
                    posicao_menor = j; // vai ocorrer a troca dos indices, e isso vai ocorrer até chegar no último indice, assim no fim, a posicao_menor, vai ter o indice do menor número
                }
            }

            aux = vetor[posicao_menor]; // aux vai receber o valor do indice da menor posição
            vetor[posicao_menor] = vetor[i]; // o valor da posição menor vai receber o valor da posição i
            vetor[i] = aux; // e o vetor da posição i, vai receber o valor que possui a menor posição, assim fazendo a troca e ficando em ordem
       }
    }

    public static void imprime(int [] vetor){

        System.out.println("\nOrdenado:\n");

        for(int i = 0; i < vetor.length; i++){
            System.out.println(i +": " + vetor[i]);
        }
    }


    }

