package christopherfa.u5w3d3.esercizio3.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Ufficiale {
    protected Ufficiale superiore;
    protected String grado;
    protected int stipendio;

    public void gestisciRichiesta(int importo) {
        if (importo <= this.stipendio) {
            System.out.println(this.grado + " ha approvato la richiesta di stipendio: " + importo);
        } else if (superiore != null) {
            System.out.println(this.grado + " passa la richiesta al superiore...");
            superiore.gestisciRichiesta(importo);
        } else {
            System.out.println("Nessun ufficiale può gestire una richiesta di: " + importo);
        }
    }
}