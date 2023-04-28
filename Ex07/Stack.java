public class Stack {
    private char dados[];
    private int topo;
    
    public Stack(int tamanho){
        this.dados = new char[tamanho];
        this.topo = -1;
    }

    public boolean isFull(){
        return this.topo == dados.length - 1;
    }

    public void push(char v){
        if(!isFull()){  
            topo++;
            dados[topo] = v;
        }
        else System.out.println("Pilha Cheia");
    }

    public boolean isEmpty(){
        return topo <= -1;
    }

    public char top(){
        if(!isEmpty()) return dados[topo];
        else return 'V';
    }

    public char pop(){
        if(!isEmpty()) return dados[topo--]; 
        else return 'V';
    }
}