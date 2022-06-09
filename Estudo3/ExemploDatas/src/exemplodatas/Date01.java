/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplodatas;

import java.util.Date;

/**
 *
 * @author mpisc
 */
public class Date01 {

    public static void main(String[] args) {

        Date hoje = new Date();

        System.out.println(hoje);

        System.out.println("Milisegundos desde 1 Jan 1970 " + hoje.getTime());

        System.out.println(hoje.getDate());

    }

}
