package common.dto.entretien;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CreneauDTO
{
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;

    public CreneauDTO(LocalDateTime dateTime, HeureDTO duree)
    {
        this.date = dateTime.toLocalDate();
        this.heureDebut = dateTime.toLocalTime();
        this.heureFin = this.heureDebut.plusHours(duree.getNbHeure());
    }

    public  CreneauDTO(){ }

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
