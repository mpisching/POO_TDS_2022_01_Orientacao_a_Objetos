/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplodatas;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author mpisc
 */
public class Date05 {

    public static void main(String[] args) {

        //dd/MM/yyyy / 02/01/2000
        //MM/dd/yyyy / 01-fev/2000
        //1.000,02
        //1,000.02
        Locale locale = Locale.getDefault();

        System.out.println(locale);

        Locale[] locales = Locale.getAvailableLocales();
        for (Locale loc : locales) {

            System.out.println("Nome: " + loc.getDisplayName());
            System.out.println("Código da língua: " + loc.getLanguage());
            System.out.println("Língua: " + loc.getDisplayLanguage());
            System.out.println("Cod País: " + loc.getCountry());
            System.out.println("País: " + loc.getDisplayCountry());

            System.out.println("*******************");

        }

        Locale br = new Locale("pt", "Brazil");

        System.out.println(br);

        Locale.setDefault(br);

        System.out.println(Locale.getDefault());

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(5000000000d));

        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf1.format(5000000000d));

        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.ITALY);
        System.out.println(nf2.format(5000000000d));

    }
}
