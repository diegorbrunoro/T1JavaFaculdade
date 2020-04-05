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
        
        Pilha pA = new Pilha(6);
        Pilha pB = new Pilha(6);
        Pilha pC = new Pilha(6);
        
        while(pA.isEmpty()){
       int Caixa = nCaixa.nextInt();
          
       
                
        if (pA.top()<=Caixa){
            pB.push(Caixa);
        } else{
            pA.push(Caixa);
        }
        }

        while (!pA.isEmpty()){
         System.out.println(pA.pop() + " Pilha A"); 
         System.out.println(pB.pop() + " Pilha B"); 
         System.out.println(pC.pop() + " Pilha C"); 
        }
        
    }
    
}
