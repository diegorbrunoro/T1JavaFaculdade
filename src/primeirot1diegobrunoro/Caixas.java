/*FACULDADE DOM BOSCO DE PORTO ALEGRE
 * Sistemas de informação - Estrtura de Dados - Primeiro T1
 * 
 * Objetivo do Programa: Empilhar em pilhas diferentes os valores digitados respeitando regras do empilhamento de caixas onde o valor maior não pode fcar sobre o menor.
 * Componentes do Grupo: Diego Rodrigues Brunoro.
 * Data de Entrega do arquivo Fonte: 05/04/2020.
 */
package primeirot1diegobrunoro;


import java.util.Scanner;


/**
 *
 * @author DIEGO
 */
public class Caixas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nCaixa = new Scanner(System.in);
        
        Pilha pA = new Pilha(6);
        Pilha pB = new Pilha(6);
        Pilha pC = new Pilha(6);
        
        int i =0;
        
        
       // Foi alterado este trecho para que ele possa ser utilizado como logica no desenvolvimento 
        for(i=0;i<6;i++){
            
            // Input dos valores a serem colocados na FILA
             int Caixa = nCaixa.nextInt();
            
             
            // Validação neste trexo é verificado se existe valor pré-existente e
            // se este valor é maior do que o valor do ultimo Input de dados, caso menor realizar o input da nova informação.
             if (pA.top()>=Caixa){
                 pA.push(Caixa);
             }   
             
             // Caso o valor seja maior do que o valor que esta no TOPO
             //Verifica que enquanto o valor do Topo for menor ou vazio
             //E que se o valor é igual a 5 ele realiza a extração do valor da pilha A e realiza o push na Fila B
             //E que se o valor é igual a 3 ele realiza a extração do valor da pilha A e realiza o push na Fila C
             //Ao final ele adicionar o Valor restante que no caso é o 7
             //realizando 2 enquanto nas filas A e B para que retire os valores e devolva para a fila A
             //na posição correta do maior para o menor.
             else 
             {
                while (pA.top()< Caixa && !pA.isEmpty())
                {
                    if (pA.top() == 5)
                        pB.push(pA.pop());
                
                
                    if (pA.top() == 3)
                        pC.push(pA.pop());
                
            
                } 
                pA.push(Caixa);
                while (!pB.isEmpty()){
                     pA.push(pB.pop());
                }
                while (!pC.isEmpty()){
                     pA.push(pC.pop());
                }
             }

            
            
                
               
        while (!pA.isEmpty()){
         System.out.println(" Pilha A  " +"|" +pA.pop() +"|"+ " Pilha B  " +"|" +pB.pop()+"|"+" Pilha C  " +"|" +pC.pop()+"|" ); 
        }
        
    }
    
    }
}
