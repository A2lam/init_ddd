package common.dto.entretien;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CreneauEntretienDTO
{
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;

    public CreneauEntretienDTO(LocalDateTime dateTime, HeureEntretienDTO duree)
    {
        this.date = dateTime.toLocalDate();
        this.heureDebut = dateTime.toLocalTime();
        this.heureFin = this.heureDebut.plusHours(duree.getNbHeure());
    }

    public CreneauEntretienDTO(LocalDate date, LocalTime heureDebut, LocalTime heureFin) {
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }

    public CreneauEntretienDTO()
    {

    }

    public LocalDate getDate()
    {
        return date;
    }

    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    public LocalTime getHeureDebut()
    {
        return heureDebut;
    }

    public void setHeureDebut(LocalTime heureDebut)
    {
        this.heureDebut = heureDebut;
    }

    public LocalTime getHeureFin()
    {
        return heureFin;
    }

    public void setHeureFin(LocalTime heureFin)
    {
        this.heureFin = heureFin;
    }
}
