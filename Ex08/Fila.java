public class Fila {
    //atributos
    private int comeco;
    private int fim;
    private int [] dados;
    private int total;

    //construtor
    public Fila(int tamanho)
    {
        dados = new int[tamanho];
        total = 0;
        comeco = 0;
        fim = 0;
    }

    //mÃ©todos auxiliares
    public boolean isEmpty()
    {
        return total == 0;
    }
    public boolean isFull()
    {
        return total == dados.length;
    }

    //mÃ©todo para inserir
    public void enqueue(int dado)
    {
        if(!isFull())
        {
            //insere o dado
            dados[fim] = dado;            
            //incrementa contador
            total++;
            //move o indice
            fim++;
            //circularidade
            fim %= dados.length;
        }
        else
            System.out.println("fila cheia");
    }

    public void dequeue(){
        if(!isEmpty()){
            
        }
    }

    //implementar dequeue()
    //implementar o imprime()
    //F:[1, 2, 3, 5]
    
}