/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetcinema;

/**
 *
 * @author tjrha
 */

import java.awt.Image;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Film {
    
    // attribut
    private String titre;
    private ArrayList<String> genre;
    private LocalDate dateSortie;
    private ArrayList<String> acteurs;
    private String realisateur;
    private String resume;
    private int note;
    private ArrayList<Cinema> lieuxProject;
    //private String lieuxProject;
    private int id;
    private LocalTime duree;
    private Image img;
    public static final String DOSS_IMAGES = "src/pimage/";
    
    
    
     // constructeurs
    public Film(String titre,ArrayList<String> genre,LocalDate dateSortie,ArrayList<String> acteurs,String realisateur,String resume,int note,ArrayList<Cinema> lieuxProject,int id,LocalTime duree){
        this.titre = titre;
        this.genre = genre;
        this.dateSortie = dateSortie;
        this.acteurs = acteurs;
        this.realisateur = realisateur;
        this.resume = resume;
        this.note = note;
        this.lieuxProject = lieuxProject;
        this.id = id;
        this.duree = duree;
        String nomFichier = this.titre+".png";
        Toolkit t = Toolkit.getDefaultToolkit();
        img = t.getImage(DOSS_IMAGES + nomFichier);
    }
    
    
//    public boolean placerApres(Film f){//compare pour placer après
//        if(f.titre.compareToIgnoreCase(this.titre)> 0){//Comparaison du titre donné en paramètre avec l'autre titre
//            return true;
//        }
//        return false;
//    }
    
    public String gettitre(){
        return this.titre;
    }

    public ArrayList<String> getGenre() {
        return genre;
    }

    public LocalDate getDateSortie() {
        return dateSortie;
    }

    public ArrayList<String> getActeurs() {
        return acteurs;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public String getResume() {
        return resume;
    }

    public int getNote() {
        return note;
    }

    public ArrayList<Cinema> getLieuxProject() {
        return lieuxProject;
    }

    public int getId() {
        return id;
    }

    public LocalTime getDuree() {
        return duree;
    }
    
    
    
    
    
    // méthode afficher
    public String toString(){
        ArrayList<Integer> idLieux = new ArrayList();
        for(int i=0;i<lieuxProject.size();i++){
            idLieux.add(lieuxProject.get(i).getId());
        }
        return(titre+";"+genre+";"+dateSortie+";"+acteurs+";"+realisateur+";"+resume+";"+note+";"+idLieux+";"+id+";"+duree); 
    }
    
    
    public void afficherImage(JLabel monLabel){
        if(img!=null){
            img = img.getScaledInstance(monLabel.getWidth(),monLabel.getHeight(),Image.SCALE_DEFAULT);
            monLabel.setIcon(new ImageIcon(img));
        }
    }
    
    public void afficherT(JButton monButton){
            monButton.setText(titre);
    }
}
