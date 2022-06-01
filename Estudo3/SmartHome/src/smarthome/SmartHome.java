/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smarthome;

import domain.IAbertura;
import domain.IFechadura;
import domain.Janela;
import domain.Localizacao;

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
        
        Janela janela1 = new Janela(local1);
        Janela janela2 = new Janela(local2);
        
 //       fechar(janela1);
 //       travar(janela1);
        
        destravar(janela1);
        abrir(janela1);
        destravar(janela2);
        abrir(janela2);        
//        
        fechar(janela1);
        travar(janela1);        
        fechar(janela2);
        travar(janela2);        
        
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
