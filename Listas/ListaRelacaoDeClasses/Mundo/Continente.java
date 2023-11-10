package Listas.ListaRelacaoDeClasses.Mundo;

import java.util.ArrayList;

public class Continente {
    private ArrayList<Pais> paises;

    public Continente(){
        paises = new ArrayList<Pais>();
    }

    public void addPais(Pais p){
        if(buscarPais(p.getNome()) == null){
            paises.add(p);
        }
    }
    public void removePais(String nome){
        paises.remove(buscarPais(nome));
    }
    public Pais buscarPais(String nome){
        for( Pais p : paises){
            if(p.getNome().equals(nome)){
                return p;
            }
        }
        return null;
    }
    public ArrayList<Pais> listarPaises(){
        return paises;
    }
    public double dimensaoTotal(){
        double dimensaoTotal = 0.0;
        for( Pais p : paises){
            dimensaoTotal = p.getDimensao() + dimensaoTotal;
        }
        return dimensaoTotal;
    }
    public double populacaoTotal(){
        double populacaoTotal = 0.0;
        for(Pais p : paises){
            populacaoTotal = populacaoTotal + p.getPopulacao();
        }
        return populacaoTotal;
    }
    public double densidadeDemograficaTotal(){
        return populacaoTotal() / dimensaoTotal();
    }
    public Pais maiorPopulacao(){
        double maior = 0;
        for( Pais p : paises){ 
            if(p.getPopulacao() > maior){
                maior = p.getPopulacao();
            }
        }
        for( Pais p : paises){
            if(p.getPopulacao() == maior){
                return p;
            }
        }
        return null;
    }
    public Pais menorPopulacao(){
        double menor = Integer.MAX_VALUE;
        for(Pais p : paises){
            if(p.getPopulacao() < menor ){
                menor = p.getPopulacao();
            }
        }
        for( Pais p : paises){
            if(p.getPopulacao() == menor){
                return p;
            }
        }
        return null;
    }
}
