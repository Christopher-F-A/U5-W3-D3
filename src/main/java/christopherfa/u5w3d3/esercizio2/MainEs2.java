package christopherfa.u5w3d3.esercizio2;

import christopherfa.u5w3d3.esercizio2.entities.Libro;
import christopherfa.u5w3d3.esercizio2.entities.Pagina;
import christopherfa.u5w3d3.esercizio2.entities.Sezione;

import java.util.List;

public class MainEs2 {
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.setAutori(List.of("autore 1"));
        libro.setPrezzo(29.99);

        Sezione capitolo1 = new Sezione();
        capitolo1.aggiungi(new Pagina("pagina 1 del Capitolo 1"));
        capitolo1.aggiungi(new Pagina("pagina 2 del Capitolo 1"));

        libro.aggiungi(capitolo1);
        libro.aggiungi(new Pagina("pagina finale del libro"));

        System.out.println("numero totale pagine: " + libro.getNumeroPagine());
        libro.stampa();
    }
}