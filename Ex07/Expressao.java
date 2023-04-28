import java.util.Scanner;

public class Expressao {
    public static void main(String[] args) {
        System.out.println(converteNPR("A + B / (C - D)")); 
        
        resolucao(converteNPR("A + B / (C - D)"));
    }

    public static void resolucao(String npr){
        Scanner leia = new Scanner(System.in);
        Pilha pilha = new Pilha(npr.length());
        int i = 0;

        npr = npr.toUpperCase();
  
        for (i = 0; i < npr.length(); i++) {
            char atual = npr.charAt(i);

            if(atual >= 'A' && atual <= 'Z'){
                System.out.print("Qual o valor de " + atual + ": ");
                int v = leia.nextInt();
                pilha.push(v);
            }
            else if(atual == '-' || atual == '+' || atual == '*' || atual == '/'){
                int valor1, valor2, resultado = 0;

                valor2 = pilha.pop();
                valor1 = pilha.pop();

                switch(atual){
                    case '-': resultado = valor1 - valor2; break;
                    case '+': resultado = valor1 + valor2; break;
                    case '*': resultado = valor1 * valor2; break;
                    case '/': resultado = valor1 / valor2;
                }

                pilha.push(resultado);               
            }
        }

        int resultado = pilha.top();
        System.out.println("O resultado é: " + resultado);

        leia.close();       
    }

    public static String converteNPR(String infixa)
    {
        String npr = "";

        Stack pilha = new Stack(infixa.length());

        infixa = infixa.toUpperCase();

        for(int i = 0; i < infixa.length(); i++)
        {
            char atual = infixa.charAt(i);

            if(atual >= 'A' && atual <= 'Z')
                npr += atual;
            else if(atual == '-' || atual == '+' || atual == '*' || atual == '/')
            {
                while(!pilha.isEmpty() && prio(pilha.top()) >= prio(atual))
                    npr += pilha.pop();
                
                pilha.push(atual);
            }
            else if(atual == '(')
            {
                pilha.push(atual);
            }
            else if(atual == ')')
            {
                char op = pilha.pop();
                while(op != '(')
                {
                    npr += op;
                    op = pilha.pop();
                }
            }     
        }

        while(!pilha.isEmpty())
            npr += pilha.pop();

        return npr;
    }

    public static int prio(char operador)
    {
        int resp = 0;
        switch(operador)
        {
            case '(': resp = 1; break;
            case '-':
            case '+': resp = 2; break;
            case '*':
            case '/': resp = 3; break;
        }
        return resp;
    }
    
}