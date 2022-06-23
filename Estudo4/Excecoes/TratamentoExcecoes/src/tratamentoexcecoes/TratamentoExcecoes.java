/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tratamentoexcecoes;

import java.util.Arrays;
import java.util.Scanner;

/**
 *;
 * @author mpisc
 */
public class TratamentoExcecoes {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int[] vetor = new int[5];
        int y = 5;
        
        try {
            for (int i = 0; i < 5; i++) {
                vetor[i] = (i + y) / (i + 1);
//                Scanner s = null;
//                s.nextInt();
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception: " + ex.getMessage());
            System.out.println("Acesso fora dos limites do array...");
        } catch (java.lang.ArithmeticException ex) {
            System.out.println("Divisão por zero é impossível.");
        } catch (Exception ex) {
            System.out.println("Houve uma exceção ... não sei qual foi!!!");
        } finally {
            System.out.println("Fim do tratamento de exceção");
        }
        
        for (int i: vetor) {
            System.out.println("Vetor[" + i + "]:" + vetor[i]);
        }

    }
    
}
