package use_case.entretien;

import common.dto.entretien.EntretienDTO;
import infrastructure.entretien.EntretienList;
import model.entretien.Entretien;
import model.entretien.Entretiens;

import java.util.UUID;

public class AnnulerEntretien
{
    Entretiens entretiens;

    public AnnulerEntretien()
    {
        this.entretiens = new EntretienList();
    }

    public void annuler(UUID uuid, String raison)
    {
        EntretienDTO entretienDTO = entretiens.trouverEntretien(uuid);
        Entretien entretien = new Entretien(entretienDTO);
        entretien.annuler(raison);
        entretienDTO = new EntretienDTO(entretien);
        entretiens.modifierEntretien(entretienDTO);
    }
}
