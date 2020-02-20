package infrastructure.entretien;

import common.dto.entretien.EntretienDTO;
import model.entretien.Entretien;
import model.entretien.Entretiens;

import java.util.ArrayList;
import java.util.UUID;

public class EntretienList implements Entretiens
{
    static ArrayList<EntretienDTO> entretiens = new ArrayList<>();

    @Override
    public void creerEntretien(EntretienDTO entretien)
    {
        // TODO : Implémenter les verifs par rapport aux disponibilités
        entretiens.add(entretien);
    }

    @Override
    public EntretienDTO trouverEntretien(UUID uuid)
    {
        return entretiens
                .stream()
                .filter(entretienInList -> entretienInList.getEntretienID().getUuid().equals(uuid))
                .findAny()
                .orElse(null);
    }

    @Override
    public void modifierEntretien(EntretienDTO entretien)
    {
        EntretienDTO entretiensFiltre = this.trouverEntretien(entretien.getEntretienID().getUuid());

        if (entretiensFiltre != null)
        {
            int indexEntretien = entretiens.indexOf(entretiensFiltre);
            entretiens.set(indexEntretien, entretien);
        }
    }
}
