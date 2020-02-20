package dto.entretien;

import model.entretien.Entretien;

public class EntretienDTO
{
    public void annulerEntretien(Entretien entretien)
    {
        entretien.annuler("");
    }
}
