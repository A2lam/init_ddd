package use_case.entretien;

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
        Entretien entretien = entretiens.trouverEntretien(uuid);
        entretien.confirmer();
        entretiens.modifierEntretien(entretien);
    }
}
