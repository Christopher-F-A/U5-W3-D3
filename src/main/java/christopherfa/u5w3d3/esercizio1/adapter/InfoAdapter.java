package christopherfa.u5w3d3.esercizio1.adapter;

import christopherfa.u5w3d3.esercizio1.entities.DataSource;
import christopherfa.u5w3d3.esercizio1.entities.Info;
import lombok.RequiredArgsConstructor;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

@RequiredArgsConstructor
public class InfoAdapter implements DataSource {
    private final Info info;

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        LocalDate birthDate = info.getDataDiNascita().toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}
