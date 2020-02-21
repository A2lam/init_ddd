package use_case.entretien;

import common.dto.entretien.EntretienDTO;
import infrastructure.entretien.EntretienList;
import model.entretien.Entretien;
import model.entretien.Entretiens;

import java.util.UUID;

public class ConfirmerEntretien
{
    Entretiens entretiens;

    public ConfirmerEntretien()
    {
        this.entretiens = new EntretienList();
    }

    public void confirmer(UUID uuid)
    {
        EntretienDTO entretienDTO = entretiens.trouverEntretien(uuid);
        Entretien entretien = new Entretien(entretienDTO);
        entretien.confirmer();
        entretienDTO = new EntretienDTO(entretien);
        entretiens.modifierEntretien(entretienDTO);
    }
}
