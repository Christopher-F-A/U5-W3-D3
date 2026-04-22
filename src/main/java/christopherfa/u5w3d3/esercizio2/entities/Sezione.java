package christopherfa.u5w3d3.esercizio2.entities;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements ElementoLibro {
    private List<ElementoLibro> elementi = new ArrayList<>();

    public void aggiungi(ElementoLibro e) {
        elementi.add(e);
    }

    @Override
    public void stampa() {
        System.out.println("inizio sezione");
        elementi.forEach(ElementoLibro::stampa);
        System.out.println("fine sezione");
    }

    @Override
    public int getNumeroPagine() {
        return elementi.stream().mapToInt(ElementoLibro::getNumeroPagine).sum();
    }
}