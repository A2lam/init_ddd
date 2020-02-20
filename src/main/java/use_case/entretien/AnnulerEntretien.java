package use_case.entretien;

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
        Entretien entretien = entretiens.trouverEntretien(uuid);
        entretien.annuler(raison);
        entretiens.modifierEntretien(entretien);
    }
}
