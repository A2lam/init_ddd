package model.entretien;

import java.util.UUID;

public class EntretienID
{
    private UUID uuid;

    public UUID getUuid()
    {
        return uuid;
    }

    public EntretienID()
    {
        this.uuid = UUID.randomUUID();
    }
}
