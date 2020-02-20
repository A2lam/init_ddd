package infrastructure.entretien;

import model.entretien.Entretien;
import model.entretien.Entretiens;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class EntretienList implements Entretiens
{
    ArrayList<Entretien> entretiens;

    @Override
    public void creerEntretien(Entretien entretien)
    {
    }

    @Override
    public Entretien trouverEntretien(UUID uuid)
    {
        return entretiens
                .stream()
                .filter(entretienInList -> entretienInList.getEntretienID().getUuid().equals(uuid))
                .findAny()
                .orElse(null);
    }

    @Override
    public void modifierEntretien(Entretien entretien)
    {
        Entretien entretiensFiltre = this.trouverEntretien(entretien.getEntretienID().getUuid());

        if (entretiensFiltre != null)
        {
            int indexEntretien = entretiens.indexOf(entretiensFiltre);
            entretiens.set(indexEntretien, entretien);
        }
    }
}
