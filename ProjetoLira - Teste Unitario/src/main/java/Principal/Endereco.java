/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 *
 */
import java.util.Objects;


public class Endereco {
    
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private Pessoa pessoa;

    public Endereco(String rua, String numero, String bairro, String cidade, String estado, Pessoa pessoa) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pessoa = pessoa;
    }

   

    /* Get e Set da Class */
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    // Gerando o hashCode, equals e o toString para usar como validação futura
    // Usou só os atributos rua, número e bairro como parametro
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.rua);
        hash = 89 * hash + Objects.hashCode(this.numero);
        hash = 89 * hash + Objects.hashCode(this.bairro);
        return hash;
    }
    // Usou só os atributos rua, número e bairro como parametro
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
        final Endereco other = (Endereco) obj;
        if (!Objects.equals(this.rua, other.rua)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        return true;
    }
    
    // Passou todos os atributos como parametro
    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + '}';
    }
}

