/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * 
 */
public class Aula {
    
    private String instrumento;
    double valor;
    String data;
    private Pessoa pessoa;

    public Aula(String instrumento, double valor, String data) {
        this.instrumento = instrumento;
        this.valor = valor;
        this.data = data;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    //Metodos da Aula
    
    public void assistirAula()
    {
        System.out.println("Assistindo aula");
      
    }
    public void darAula()
    {
         System.out.println("Dando aula");
        
    }
    
}

