/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * 
 */

public class Pessoa extends Aula {

    private String nome;
    private String telefone;
    private String email;
    private Double nota;
    public Endereco endereco;

    // Construtor 


    public Pessoa(String nome, String telefone, String email, String instrumento, Double nota, double valor, String data) {
        super(instrumento, valor, data);
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.nota = nota;
    }


    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    // Método usado pra fazer avaliações de aula, professor ou de aluno
    public Double avalia(Double nota) {
        return nota;
    }

    // Get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    // Gerando o hashCode, equals e o toString para usar como validação futura
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", nota=" + nota + '}';
    }

}
