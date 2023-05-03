/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetcinema;


import java.util.ArrayList;

/**
 *
 * @author tjrha
 */
public class Cinema {
    
    // attribut
    private String ville;
    private String coordonne;
    private int tarif;
    private int note;
    private ArrayList<Film> listeFilmProj;
    private ArrayList<Seance> listeSeance;
    private int id;
    
    
    // constructeurs
    public Cinema(String ville,String coordonne,int tarif,int note,ArrayList<Film> listeFilmProj,ArrayList<Seance> listeSeance,int id){
        this.ville = ville;
        this.coordonne = coordonne;
        this.tarif = tarif;
        this.note = note;
        this.listeFilmProj = listeFilmProj;
        this.listeSeance = listeSeance;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getVille() {
        return ville;
    }

    public String getCoordonne() {
        return coordonne;
    }

    public int getTarif() {
        return tarif;
    }

    public int getNote() {
        return note;
    }

    public ArrayList<Film> getListeFilmProj() {
        return listeFilmProj;
    }

    public ArrayList<Seance> getListeSeance() {
        return listeSeance;
    }
    
    
    
    
    
    // méthode afficher
    public String toString(){
        ArrayList<Integer> idFilm= new ArrayList();
        for(int i=0;i<listeFilmProj.size();i++){
            idFilm.add(listeFilmProj.get(i).getId());
        }
        return(ville+";"+coordonne+";"+tarif+";"+note+";"+idFilm+";"+listeSeance+";"+id); 
    }
    
}
