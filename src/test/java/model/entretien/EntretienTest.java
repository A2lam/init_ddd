package model.entretien;

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
        Candidat candidat = new Candidat("DOE", "PHP", 5);
        Entretien entretien = new Entretien(localDateTime, candidat);

        entretien.confirmer();

        assertEquals(EntretienStatus.CONFIRME, entretien.getStatut());
    }
}
