package Listas.ListaRelacaoDeClasses.Spotify;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<Musica> musicas;

    public Playlist(){
        musicas = new ArrayList<Musica>();
    }

    public void addMusica(Musica m){
        if(pesquisarMusicas(m.getNome(),m.getDuracao()) == null){
            musicas.add(m);
        }
    }

    public Musica pesquisarMusicas(String nome , double duracao){
        for( Musica m : musicas){
            if( (m.getNome().equals(nome)) && (m.getDuracao()== duracao)){
                return m;
            }
        }
        return null;
    }

    public void deleteMusicas(Musica m){
        musicas.remove(m);
    }
    public ArrayList<Musica> listarMusicas(){
        return musicas;
    }
}
