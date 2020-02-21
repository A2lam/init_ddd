package model.entretien;

import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDateTime;
import java.time.Month;

public class CreneauEntretienTest
{
    @Test
    public void equals_should_return_true_if_same_creneaus()
    {
        LocalDateTime d1 = LocalDateTime.of(2020, Month.FEBRUARY, 19, 15, 0, 0);
        HeureEntretien h1 = new HeureEntretien(2);
        CreneauEntretien c1 = new CreneauEntretien(d1, h1);
        CreneauEntretien c2 = new CreneauEntretien(d1, h1);

        assertTrue(c1.equals(c2));
    }
}
