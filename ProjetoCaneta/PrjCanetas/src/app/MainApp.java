/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import domain.Caneta;

/**
 *
 * @author mpisc
 */
public class MainApp {
    public static void main(String[] args) {
        System.out.println("Fabrica de canetas");
        Caneta c1 = new Caneta(); //instanciação de classe - criação de objeto
                                    // a palavra reservada new por meio do método
                                        //construtor de classe
            //c1 é uma variável de referência para um objeto do tipo caneta
        c1.carga = 20;
        c1.cor = "Azul";
        c1.marca = "Pilot";
        c1.modelo = "Canetão";
        
        Caneta c2 = new Caneta(); 
        c2.carga = 220;
        c2.cor = "Preta";
        c2.marca = "Pilot";
        c2.modelo = "Pilor +";  
        c2.cargaMaxima = 200;
        
        System.out.println("Dados da caneta: " + c1.carga + " - " + c1.cor + " - " + c1.marca);
        System.out.println("Dados da caneta: " + c2.carga + " - " + c2.cor + " - " + c2.marca);
        // (.) ponto --> operador de vinculação
              
                                  
    }
}
