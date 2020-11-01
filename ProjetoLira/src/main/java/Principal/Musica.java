/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 */
public class Musica {
    String nome;
    private String artista;
    private double duracao;
    private Pessoa pessoa;
    public Instrumento instrumento;

    public Instrumento getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(Instrumento instrumento) {
        this.instrumento = instrumento;
    }
    
 

    public Musica(String nome, String artista, double duracao) {
        this.nome = nome;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    
    // Metodos da Musica
    
    public void Executar(){
        System.out.println("Executando...");
    }
    public void Pausar(){
        System.out.println("Pausando");
    }
     public void Gravar(){
        System.out.println("Gravando");
    }
      public void Compartilhar(){
        System.out.println("Compartilhando..");
        
    }
       public void Ler(){
        System.out.println("Lendo");
    }
        public String Pesquisar(String nome, String artista){
        return toString();
    }

    @Override
    public String toString() {
        return "Musica{" + "nome=" + nome + ", artista=" + artista + '}';
    }
        
        
}
