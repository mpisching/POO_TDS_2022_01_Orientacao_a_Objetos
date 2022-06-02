/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smarthome;

import domain.Basculante;
import domain.Correr;
import domain.Giratoria;
import domain.IAbertura;
import domain.IFechadura;
import domain.Janela;
import domain.Localizacao;
import domain.Porta;

/**
 *
 * @author mpisc
 */
public class SmartHome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Localizacao local1 = new Localizacao("Banheiro");
        Localizacao local2 = new Localizacao("Cozinha");
        Localizacao local3 = new Localizacao("Garagem");
        
        Janela janela1 = new Janela(local1);
        Janela janela2 = new Janela(local2);
        
        Porta p1 = new Correr(local1);
        Porta p2 = new Giratoria(local2);
        Porta p3 = new Basculante(local3);
        
 //       fechar(janela1);
 //       travar(janela1);
        
        destravar(janela1);
        abrir(janela1);
        destravar(janela2);
        abrir(janela2);   
        
        destravar(p1);
        abrir(p1);
        destravar(p2);
        abrir(p2);
        destravar(p3);
        abrir(p3);
//        
        fechar(janela1);
        travar(janela1);        
        fechar(janela2);
        travar(janela2);    
        
        fechar(p1);
        travar(p1);
        fechar(p2);
        travar(p2);
        fechar(p3);
        travar(p3);
        
    }
    
    public static void fechar(IAbertura abertura) {
        abertura.fechar();
    }
    
    public static void travar(IFechadura fechadura) {
        fechadura.travar();
    }
    
    public static void abrir(IAbertura abertura) {
        abertura.abrir();
    }
    
    public static void destravar(IFechadura fechadura) {
        fechadura.destravar();
    }
}
