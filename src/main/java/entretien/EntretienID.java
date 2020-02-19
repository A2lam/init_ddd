package entretien;

import java.util.UUID;

class EntretienID
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
