package use_case.entretien;

import infrastructure.entretien.EntretienList;
import model.entretien.Entretiens;
import org.junit.*;
import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.time.Month;

import dto.entretien.CandidatDTO;
import dto.entretien.EntretienDTO;
import dto.entretien.EntretienStatusDTO;

public class AnnulerEntretienTest
{
    Entretiens entretiens = new EntretienList();
    private EntretienDTO e1;

    @Before
    public void create_interviews()
    {
        LocalDateTime ldt1 = LocalDateTime.of(2020, Month.FEBRUARY, 19, 15, 0, 0);
        CandidatDTO c1 = new CandidatDTO("DOE", "PHP", 5);
        e1 = new EntretienDTO(ldt1, c1);

        LocalDateTime ldt2 = LocalDateTime.of(2020, Month.FEBRUARY, 19, 17, 0, 0);
        CandidatDTO c2 = new CandidatDTO("DOE", "PHP", 5);
        EntretienDTO e2 = new EntretienDTO(ldt2, c2);

        entretiens.creerEntretien(e1);
        entretiens.creerEntretien(e2);
    }

    @Test
    public void planned_interview_should_be_canceled()
    {
        AnnulerEntretien annulerEntretien = new AnnulerEntretien();

        EntretienDTO entretien = entretiens.trouverEntretien(e1.getEntretienID().getUuid());

        annulerEntretien.annuler(entretien.getEntretienID().getUuid(), "Le candidat a desisté");

        EntretienDTO entretienCanceled = entretiens.trouverEntretien(e1.getEntretienID().getUuid());

        assertEquals(EntretienStatusDTO.ANNULE, entretienCanceled.getStatut());
    }
}
