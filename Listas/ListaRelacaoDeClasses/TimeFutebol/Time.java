package Listas.ListaRelacaoDeClasses.TimeFutebol;

import java.util.ArrayList;

public class Time {
    private ArrayList<Jogador> jogadores;
    public Time(){
        jogadores = new ArrayList<Jogador>();
    }

    public Boolean addJogador(Jogador j){
       if(pesquisarJogador(j.getId()) == null){
        jogadores.add(j);
        return true;
       }
       return false;
    }
    public void removeJogador(Jogador j){
        jogadores.remove(j);
    }
    public Jogador pesquisarJogador(String id){
        for( Jogador j : jogadores){
            if(id.equals(j.getId())){
                return j;
            }      
        }
        return null;
    }
    public ArrayList<Jogador> listarJogadores(){
        return jogadores;
    }
}
