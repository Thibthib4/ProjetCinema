/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetcinema;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author tjrha
 */
public class Seance {
    
    // attributs
    private LocalDateTime horaire;
    private Film film;
    
    // constructeurs
    public Seance(LocalDateTime horaire,Film film){
        this.horaire = horaire;
        this.film = film;
    }

    public LocalDateTime getHoraire() {
        return horaire;
    }

    public Film getFilm() {
        return film;
    }

    
    public String toString() {
        return(horaire+";"+film.getId());
    }
    
    
    

}
