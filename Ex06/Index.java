import java.util.Scanner;

public class Index {
        public static void main(String[] args) {
            
        Scanner leia = new Scanner(System.in);
        String exInfixa;

        System.out.println("Digite uma expressão infixa: ");
        exInfixa = leia.nextLine();

        leia.close();

        System.out.println(varredura(exInfixa));  
    }

    public static String varredura(String exInfixa){
        Stack pilha = new Stack(exInfixa.length());
        exInfixa = exInfixa.toUpperCase();
        String npr = "";

        char atual;

        for (int i = 0; i < exInfixa.length(); i++) {
            atual = exInfixa.charAt(i);

            if(atual >= 'A' && atual <= 'Z'){
                npr += atual;
            } else if(atual == '-' || atual == '+' || atual == '/' || atual == '*') {
                while(!pilha.isEmpty() && prio(pilha.top()) >= prio(atual)){
                    npr += pilha.pop();
                }

                pilha.push(atual);
            } else if(atual == '('){
                pilha.push(atual);
            } else if(atual == ')'){
                char op = pilha.pop();

                while(op != '('){
                    npr += op;
                    op = pilha.pop();
                }
            }
        }

        while(!pilha.isEmpty()){
            npr += pilha.pop();
        }

        return npr;
    }

    public static int prio(char op){

        int result = 0;

        switch(op){
            case '(':   result = 1;   break;
            case '+':     
            case '-':   result = 2;   break;
            case '*':      
            case '/':   result = 3;   break;
        }
        
        return result;
    }
}

