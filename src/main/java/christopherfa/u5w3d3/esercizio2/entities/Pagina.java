package christopherfa.u5w3d3.esercizio2.entities;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Pagina implements ElementoLibro {
    private String contenuto;

    @Override
    public void stampa() {
        System.out.println("Pagina: " + contenuto);
    }

    @Override
    public int getNumeroPagine() {
        return 1;
    }
}