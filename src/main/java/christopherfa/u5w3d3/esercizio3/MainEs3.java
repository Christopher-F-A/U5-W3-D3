package christopherfa.u5w3d3.esercizio3;

import christopherfa.u5w3d3.esercizio3.entities.*;

public class MainEs3 {
    public static void main(String[] args) {
        // creazione gradi
        Ufficiale tenente = new Tenente();
        Ufficiale capitano = new Capitano();
        Ufficiale maggiore = new Maggiore();
        Ufficiale colonnello = new Colonnello();
        Ufficiale generale = new Generale();

        // creazione catena
        tenente.setSuperiore(capitano);
        capitano.setSuperiore(maggiore);
        maggiore.setSuperiore(colonnello);
        colonnello.setSuperiore(generale);

        System.out.println("TEST - chain of responsability");
        tenente.gestisciRichiesta(3500); // fino a Colonnello
        System.out.println("fine test");
    }
}