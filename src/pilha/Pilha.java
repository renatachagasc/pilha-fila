/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author 20171148060029
 */
public class Pilha {
     
    public Object[] pilha;
    public int posicaoPilha;
 
    public Pilha() {
        this.posicaoPilha = -1;
        this.pilha = new Object[100];
    }
 
    public boolean pilhaVazia() {
        //isEmpty
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }
 
    public int tamanho() {
        //is
        if (this.pilhaVazia()) {
            return 0;
        }
        return this.posicaoPilha + 1;
    }
 
    public Object exibeUltimoValor() {
        //top
        if (this.pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha];
    }
 
    public Object desempilhar() {
        //pop
        if (pilhaVazia()) {
            return null;
        }
        return this.pilha[this.posicaoPilha--];
    }
 
    public void empilhar(Object valor) {
        // push
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }
    }
 
    public static void main(String args[]) {
        Pilha p = new Pilha();
        p.empilhar("Portuguesa ");
        p.empilhar("Frango com catupiry ");
        p.empilhar("Calabresa ");
        p.empilhar("Quatro queijos ");
        p.empilhar(10);
                while (p.pilhaVazia() == false) {
            System.out.println(p.desempilhar());
        }
    }
}  
