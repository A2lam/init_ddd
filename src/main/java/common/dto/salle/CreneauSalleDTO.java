package common.dto.salle;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CreneauSalleDTO
{
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;

    public CreneauSalleDTO(LocalDateTime dateTime, HeureSalleDTO duree)
    {
        this.date = dateTime.toLocalDate();
        this.heureDebut = dateTime.toLocalTime();
        this.heureFin = this.heureDebut.plusHours(duree.getNbHeure());
    }

    public CreneauSalleDTO(LocalDate date, LocalTime heureDebut, LocalTime heureFin) {
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
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
