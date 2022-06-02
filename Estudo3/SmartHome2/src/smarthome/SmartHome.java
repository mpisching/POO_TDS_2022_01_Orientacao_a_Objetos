/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smarthome;

import domain.Abertura;
import domain.Basculante;
import domain.Correr;
import domain.Giratoria;
import domain.IAbertura;
import domain.IFechadura;
import domain.Janela;
import domain.Localizacao;
import domain.Porta;
import java.util.ArrayList;
import java.util.List;

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
        janela1.setDistanciaDoPiso(110);
        janela2.setDistanciaDoPiso(220);
        
        
        Porta p1 = new Correr(local1);
        Porta p2 = new Giratoria(local2);
        Porta p3 = new Basculante(local3);
        
        //List<Porta> portas = new ArrayList<>();
        //List<Janela> janelas = new ArrayList<>();
        List<Abertura> aberturas = new ArrayList<>();
        
        aberturas.add(p1);
        aberturas.add(p2);
        aberturas.add(p3);
        aberturas.add(new Correr(local2));
        //portas.remove(p1);
        
        aberturas.add(janela1);
        aberturas.add(janela2);
        
        for (Abertura a: aberturas) {
            imprimir(a);
        }
        
//      fechar(janela1);
 //       travar(janela1);
        
//        destravar(janela1);
//        abrir(janela1);
//        destravar(janela2);
//        abrir(janela2);   
        
        //destravar e abrir todas as portas
        for (Abertura a: aberturas) {//for apriomorado ou foreach
            destravar(a);
            abrir(a);
        }
        
        for (Abertura a: aberturas) {
            imprimir(a);
        }        
//        destravar(p1);
//        abrir(p1);
//        destravar(p2);
//        abrir(p2);
//        destravar(p3);
//        abrir(p3);
//        

        for (Abertura a: aberturas) {
            fechar(a);
            travar(a);
        }
//        fechar(janela1);
//        travar(janela1);        
//        fechar(janela2);
//        travar(janela2);    
//        
//        //fechar(p1);
//        //travar(p1);
//        fechar(p2);
//        travar(p2);
//        fechar(p3);
//        travar(p3);
        
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
    
    public static void imprimir(Abertura a) {
        System.out.println(a.getClass().getSimpleName() + " localização: " + a.getLocal().getDescricao());
        System.out.println("Fechada e travada? " + a.getStatus());
        if (a instanceof Janela janela) {
            System.out.println("Distância do piso: " + janela.getDistanciaDoPiso());
        }
    }
}
