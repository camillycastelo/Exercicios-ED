public class Stack {
    private int dados[]; 
    private int topo;

    public Stack(int tamanho){
        dados = new int[tamanho];
        topo = -1; 
    }

    boolean isFull(){ 
        return topo == dados.length - 1; 
    }

    public void push(int v){ 
        if(!isFull()){ 
            topo++; 
            dados[topo] = v; 
        }
        else
            System.out.println("Pilha Cheia!");
    } 

    boolean isEmpty(){ 
        return topo <= -1;
    }

    public int top(){ 
        if(!isEmpty()) 
            return dados[topo]; 
        else
            return -1; 
        
    } 

    public int Pop(){ 
        if(!isEmpty()) 
            return dados[topo--]; 
        else    
            return -1; 
    }

    public void imprime(){
        for (int i = dados.length - 1; i >= 0 ; i--) {
            System.out.print(dados[i] + " ");
        }
    }
}
