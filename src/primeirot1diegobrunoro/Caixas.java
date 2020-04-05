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
        
        Pilha pA = new Pilha(4);
        Pilha pB = new Pilha(4);
        Pilha pC = new Pilha(4);
        
        int i =0;
        pA.push(3);
        pB.push(5);
        pC.push(7);
            
            for(i=0;i<=6;i++){
                
                
                while(!pA.isFull()){
            
       int Caixa = nCaixa.nextInt();
       
       
       
                
           if (pA.top()>=Caixa){
            pA.push(Caixa);
        } 
           if (pB.top()>=Caixa){
               pB.push(Caixa);
           }
           if (pB.top()>=Caixa){
               pC.push(Caixa);
        }
        }
            }

        while (!pA.isEmpty()){
         System.out.println(" Pilha A  " +"|" +pA.pop() +"|"+ " Pilha B  " +"|" +pB.pop()+"|"+" Pilha C  " +"|" +pC.pop()+"|" ); 
        }
        
    }
    
}
