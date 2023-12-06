package Listas.ListaHeranca.Questao02.Controle;

import java.util.ArrayList;

import Listas.ListaHeranca.Questao02.Modelo.Cliente;

public class ControleCliente{
    private ArrayList <Cliente> clientes = new ArrayList<Cliente>();
    public void cadastrarCliente (String nome, long cpf){
        clientes.add(new Cliente(nome, cpf));
    }
        public Cliente pesquisarCliente(long cpf){
        Cliente c=null;
        for (Cliente cli : clientes){
        if (cpf == cli.getCPF()){
            c=cli;
            break;
        }
        }
        return c;
    }
    public String mostrarCliente( Cliente c){
        return c.getNome() + " Cpf: " + c.getCPF();
    }
}