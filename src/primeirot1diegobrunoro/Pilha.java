/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeirot1diegobrunoro;

/**
 *
 * @author DIEGO
 */
public class Pilha {
   private int topo;
   private int memo[];
   private int tamMax;
    
    //Define o Tamamnho Máximo da Pilha
    
    Pilha (int tamMax)
    {
        this.tamMax = tamMax;
        this.memo = new int [this.tamMax];
        this.topo =-1;
    }
    
    
    //Metodo responsavel por inserir o proximo valor na pilha
    
    public void push(int elemento)
    { if (!isFull())
    {
        this.topo++;
        this.memo[this.topo]=elemento;
    }
    else{
            System.out.println("OVERFLOW");
        }
    }
    
    //Metodo responsavel por remover o ultimo valor inserido na pilha
    
    public int pop()
    {
        int aux = -1;
        if (!isEmpty())
        {
        aux = this.memo[this.topo];
        this.topo--;
        }
        else{
            System.out.println("UNDERFLOW");
        }
        return aux;
    }
    
    // metodo responsavel por exibir a informação do ultimo valor do topo da pilha
    
    public int top()
    {
        int aux =-1;
        if(!isEmpty())
        {aux  =this.memo[this.topo];
        
        }
        return aux;
    }
    
    // metodo responsavel  verificar se a pilha esta cheia.
    
    public boolean isFull()
    {
        if(this.topo == (this.tamMax -1))
            return true;
        else
            return false;
    }
    
    // metodo paara verificar se a pilha esta vazia
    
    public boolean isEmpty()
    {
        if(this.topo ==-1)
        return true;
        else
        return false;
        
    }
}
