package use_case.salle;

import org.junit.*;
import static org.junit.Assert.assertEquals;

import common.dto.salle.CreneauSalleDTO;
import common.dto.salle.HeureSalleDTO;
import common.dto.salle.SalleDTO;

import infrastructure.salle.SalleList;

import model.salle.Salles;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

public class ReserverSalleTest
{
    Salles salles = new SalleList();

    @Before
    public void create_salles()
    {
        ArrayList<CreneauSalleDTO> creneauSalleDTOS = new ArrayList<>();

        LocalDateTime ldt1 = LocalDateTime.of(2020, Month.JUNE, 19, 15, 0, 0);
        HeureSalleDTO h1 = new HeureSalleDTO(1);
        CreneauSalleDTO c1 = new CreneauSalleDTO(ldt1, h1);

        LocalDateTime ldt2 = LocalDateTime.of(2020, Month.JUNE, 19, 10, 0, 0);
        HeureSalleDTO h2 = new HeureSalleDTO(1);
        CreneauSalleDTO c2 = new CreneauSalleDTO(ldt2, h2);

        creneauSalleDTOS.add(c1);
        creneauSalleDTOS.add(c2);

        SalleDTO b11 = new SalleDTO("B11", 50, creneauSalleDTOS);
        salles.creerSalle(b11);
    }

    @Test
    public void free_salle_should_be_reserved()
    {
        ReserverSalle reserverSalle = new ReserverSalle();

        LocalDateTime ldt = LocalDateTime.of(2020, Month.JUNE, 19, 17, 0, 0);
        HeureSalleDTO h = new HeureSalleDTO(1);
        CreneauSalleDTO creneauSouhaite = new CreneauSalleDTO(ldt, h);
        int capaciteSouhaite = 50;

        reserverSalle.reserver(creneauSouhaite, capaciteSouhaite);

        SalleDTO b11 = salles.trouverSalle("B11");
        boolean creneauAjoute = false;
        for (CreneauSalleDTO crenau : b11.getCreneaux())
        {
            if (crenau.equals(creneauSouhaite))
                creneauAjoute = true;
        }

        assertEquals(true, creneauAjoute);
    }
}
