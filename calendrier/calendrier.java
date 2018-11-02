
package calendrier;
import java.util.Scanner;
import java.util.GregorianCalendar;

import static calendrier.Entete.jour;
import static calendrier.mois.Calendrier.nomMois;


public class calendrier {


    public static void main(String[] args) {
        int i=0;
        Scanner clavier = new Scanner(System.in);
        System.out.print("entrez votre année ");
        int année = clavier.nextInt();
        System.out.println("entrtez votre mois");
        int mois = clavier.nextInt();
        System.out.println("===========================");
        System.out.println( "\t" +nomMois(mois) + "\t" + année);
        System.out.println("===========================");
        jour();
        System.out.println("oui j'y suis ");
    }

}









