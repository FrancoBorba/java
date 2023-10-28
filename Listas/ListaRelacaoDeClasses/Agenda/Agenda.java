package Listas.ListaRelacaoDeClasses.Agenda;

import java.util.ArrayList;

public class Agenda {
     ArrayList<Contato> contatos;
     
     public Agenda() {
    	 contatos = new ArrayList<Contato>();
     }
     
     public boolean incluirContato(Contato c)
     {
    	 if (pesquisarContato(c.getCpf()) == null)
         {
    	      contatos.add(c);
    	      return true;
         }
    	 
    	 return false;
    	      
    	    	 
     }
     
     public Contato pesquisarContato(String cpf)
     {
    	 for (Contato c : contatos)
    		 if (c.getCpf().equals(cpf))
    			 return c;
    	 return null;
     }
     
     public ArrayList<Contato> listarContatos()
     {
    	return contatos; 
     }
}
