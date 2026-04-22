package christopherfa.u5w3d3.esercizio2.entities;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class Libro extends Sezione {
    private List<String> autori;
    private double prezzo;
}