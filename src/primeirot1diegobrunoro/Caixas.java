/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
