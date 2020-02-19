package entretien;

import entretien.Creneau;
import entretien.Heure;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDateTime;
import java.time.Month;

public class CreneauTest
{
    @Test
    public void equals_should_return_true_if_same_creneaus()
    {
        LocalDateTime d1 = LocalDateTime.of(2020, Month.FEBRUARY, 19, 15, 0, 0);
        Heure h1 = new Heure(2);
        Creneau c1 = new Creneau(d1, h1);
        Creneau c2 = new Creneau(d1, h1);

        assertTrue(c1.equals(c2));
    }
}
