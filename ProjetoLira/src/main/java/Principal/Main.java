/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * 
 */
public class Main{
    public static void main (String args[])
    {
       // Scanner entrada=new Scanner (System.in);
        
        Pessoa maria = new Pessoa("Maria", "3193846736", "maria@gmail.com", "violao", 5.5,50.0, "10-12-2020" );
        maria.assistirAula();
        
        System.out.println(maria.toString());
        Endereco end= new Endereco("Rua.Augusta", "123", "Flores","BH", "MG", maria);
        maria.setEndereco(end);
        
        System.out.println(end.toString());
        Musica aquarela=new Musica("Aquarela", "Toquinho", 4.11);
        
        Instrumento violao=new Instrumento ("violao", 200.30, "Cordas",4.4,"aquarela","Toquinho", 4.4);
        aquarela.setInstrumento(violao);
        
        System.out.println(violao.toString());
        System.out.println(aquarela.toString());
        
        
        
        
        
    }
    
    
}
