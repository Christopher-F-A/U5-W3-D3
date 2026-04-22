package christopherfa.u5w3d3.esercizio1;

import christopherfa.u5w3d3.esercizio1.adapter.InfoAdapter;
import christopherfa.u5w3d3.esercizio1.entities.Info;
import christopherfa.u5w3d3.esercizio1.entities.UserData;
import java.util.GregorianCalendar;

public class MainEs1 {
    public static void main() {
        // creazione ogg
        Info info = new Info("Mario", "Rossi", new GregorianCalendar(1990, 1, 1).getTime());

        // creazione adattatore
        InfoAdapter adapter = new InfoAdapter(info);

        // utilizzo adattatore
        UserData userData = new UserData();
        userData.getData(adapter);

        System.out.println("nome completo: " + userData.getNomeCompleto());
        System.out.println("età: " + userData.getEta());
    }
}