package Listas.ListaHeranca.Questao3.Controle;

import Listas.ListaHeranca.Questao3.Modelo.Pessoa;

public class CadastrarPessoas {
    private Pessoa pessoas[];
    private int quantidadePessoas;
    
    public CadastrarPessoas(int quantidadePessoas){
        pessoas = new Pessoa[quantidadePessoas];
    }
    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }
    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }
  
    public void cadastrarPessoas(Pessoa p){
        for(int i =0 ; i < quantidadePessoas ; i++){
            if(buscarPessoa(p.getNome()) == null){
                pessoas[i] = p;
            }
        }
    }
    public Pessoa buscarPessoa(String nome){
        for(int i =0 ; i < quantidadePessoas ; i++){
            if(pessoas[i].getNome().equals(nome)){
                return pessoas[i];
            }  
        }
         return null; 
    }
    public void imprimeCadastro(){
        
        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.println();
            pessoas[i].imprimeDados();
        }
    }
}
