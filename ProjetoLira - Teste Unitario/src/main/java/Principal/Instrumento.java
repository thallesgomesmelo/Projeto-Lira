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
public class Instrumento extends Musica {
    
    private String nomeInstrumento;
    private double preco;
    private String  tipo;
    private double compasso;

    public Instrumento(String nomeInstrumento, double preco, String tipo, double compasso,String nome, String artista, double duracao) {
        super(nome, artista, duracao);
        this.nomeInstrumento = nomeInstrumento;
        this.preco = preco;
        this.tipo = tipo;
        this.compasso = compasso;
    }
    
    
    public String getNomeInstrumento() {
        return nomeInstrumento;
    }

    public void setNomeInstrumento(String nome) {
        this.nomeInstrumento = nomeInstrumento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCompasso() {
        return compasso;
    }

    public void setCompasso(double compasso) {
        this.compasso = compasso;
    }
    
    //Metodos do Instrumento
    
    public double vender(double preco){
        return preco;
    }
    
    public void afinar () {
        System.out.println("Afinando...");
    }
    public double contarTempo(double compasso){
        return compasso;
    }

    @Override
    public String toString() {
        return "Instrumento{" + "nomeInstrumento=" + nomeInstrumento + ", preco=" + preco + ", tipo=" + tipo + ", compasso=" + compasso + '}';
    }
    
    
    
}
