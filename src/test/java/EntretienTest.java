import org.junit.Test;
import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.*;

public class EntretienTest
{
    @Test
    public void entretien_status_should_be_confirmed_if_everything_good()
    {
        LocalDateTime localDateTime = LocalDateTime.of(2020, Month.FEBRUARY, 19, 15, 0, 0);
        Heure heure = new Heure(2);
        Creneau creneau = new Creneau(localDateTime, heure);
        Entretien entretien = new Entretien(creneau);

        entretien.confirmer();

        assertEquals(EntretienStatus.CONFIRME, entretien.getStatut());
    }
}
