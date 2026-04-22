package christopherfa.u5w3d3.esercizio1.entities;

import lombok.Getter;

@Getter
public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds) {
        this.nomeCompleto = ds.getNomeCompleto();
        this.eta = ds.getEta();
    }
}