package use_case.entretien;

import common.dto.entretien.CandidatDTO;
import common.dto.entretien.EntretienDTO;
import infrastructure.entretien.EntretienList;
import model.entretien.EntretienStatus;
import model.entretien.Entretiens;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class ConfirmerEntretienTest
{
    Entretiens entretiens = new EntretienList();
    private EntretienDTO e1;

    @Before
    public void create_interviews()
    {
        LocalDateTime ldt1 = LocalDateTime.of(2020, Month.JUNE, 19, 15, 0, 0);
        CandidatDTO c1 = new CandidatDTO("DOE", "PHP", 5);
        e1 = new EntretienDTO(ldt1, c1);

        LocalDateTime ldt2 = LocalDateTime.of(2020, Month.JUNE, 19, 17, 0, 0);
        CandidatDTO c2 = new CandidatDTO("DOE", "PHP", 5);
        EntretienDTO e2 = new EntretienDTO(ldt2, c2);

        entretiens.creerEntretien(e1);
        entretiens.creerEntretien(e2);
    }

    @Test
    public void planned_interview_should_be_confirmed()
    {
        ConfirmerEntretien ConfirmerEntretien = new ConfirmerEntretien();

        EntretienDTO entretien = entretiens.trouverEntretien(e1.getEntretienID().getUuid());

        ConfirmerEntretien.confirmer(entretien.getEntretienID().getUuid());

        EntretienDTO entretienConfirmed = entretiens.trouverEntretien(e1.getEntretienID().getUuid());

        assertEquals(EntretienStatus.CONFIRME, entretienConfirmed.getStatut());
    }
}
