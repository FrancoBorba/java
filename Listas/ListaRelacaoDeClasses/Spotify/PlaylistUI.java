package Listas.ListaRelacaoDeClasses.Spotify;

import java.util.ArrayList;
import java.util.Scanner;

public class PlaylistUI {
    private Playlist playlists;

    public PlaylistUI(){
        playlists = new Playlist();
    }

    public void menu(){
       do{ 
        System.out.println("1- Criar musica");
        System.out.println("2- Deletar musica");
        System.out.println("3- Pesquisar musica");
        System.out.println("4- Listar musicas");
        System.out.println("5-Sair do menu");
        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();
        
            switch (opcao) {
                case 1:{
                    telaAddMusica(scan);
                    break;
                }
                case 2:{
                    System.out.println("Digite o nome da musica que deseja remover");
                    String nome = scan.next();
                    System.out.println("Digite sua duração");
                    double duracao = scan.nextDouble();
                    telaRemoverMusica(nome, duracao);
                    break;
                }
                case 3:{
                    System.out.println("Digite o nome da musica ");
                    String nome = scan.next();
                    System.out.println("Digite sua duração");
                    double duracao = scan.nextDouble();
                    System.out.println(playlists.pesquisarMusicas(nome, duracao));
                    break;
                }
                case 4:{
                    System.out.println(telaListarMusica());
                    break;
                }
                    
            
                default:
                System.exit(0);
                scan.close();
                System.out.println("Saindo do menu");
                    break;
            }
        }while(true);
    }
    public void telaAddMusica(Scanner scan){
       
        System.out.println("Digite o nome da musica");
        String nome = scan.next();
       
        System.out.println("Digite quanto tempo ela dura");
        Double duracao = scan.nextDouble();

        Musica m = new Musica(nome, duracao);
        if(playlists.pesquisarMusicas(nome, duracao) == null){
            playlists.addMusica(m);
            System.out.println("Musica Adicionada");
        }
        else{
            System.out.println("Musica já estava  adicionada");
        }
       
    }
    public void telaRemoverMusica(String nome , double duracao){
        if(playlists.pesquisarMusicas(nome, duracao) == null){
            System.out.println("Musica não encontrada");
        }
        else{
            System.out.println("Musica :" + playlists.pesquisarMusicas(nome, duracao) + "Deletada");
            playlists.deleteMusicas(playlists.pesquisarMusicas(nome, duracao));
        }
        
    }
    public ArrayList<Musica> telaListarMusica(){
        return playlists.listarMusicas();
    }
}
