/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetcinema;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


/**
 *
 * @author tjrha
 */
public class Portail {
    
    private ArrayList<Film> listeFilms = new ArrayList();   // essayer d'utiliser un Set
    private ArrayList<Cinema> Cinema = new ArrayList();
    private ArrayList<Seance> Seance = new ArrayList();
    private String login = "BertilleC";
    private String mdp = "ThIbAuDh";
    private String fichierFilm = "Films.txt";
    private String fichierCinema = "Cinemas.txt";
    private String fichierSeance = "Seances.txt";
    
    
   
//    public Film rechercherFilm(String titre) {
//        for (int i = 0; i<listeFilms.size(); i++) {//Si la liste de film n'est pas nulle cela signifie qu'il y a déjà un film enregistré
//            if (listeFilms.get(i).gettitre().equals(titre)) {//Si le titre du film dans la liste est égal au titre donné en paramètre
//                return listeFilms.get(i);
//            }
//        }
//        System.out.println("Erreur, le film n'est plus à l'affiche !");
//        return null;
//    }
    
    public boolean verifAdmin(String login, String mdp){
        boolean verif=false;
        if (this.login.equals(login)){
            System.out.println("L'identifiant est correcte");
            if (this.mdp.equals(mdp)){
                System.out.println("L'identifiant est correcte");
                verif=true;
            }
            else{
                System.out.println("Le mot de passe est erroné!");
                verif=false;
            }
        }
        else{
            System.out.println("L'identifiant est incorrect");
            verif=false;
        }  
        return verif;
    }
    
    
//    public ArrayList<Film> rechercherFilm() {  // rajoiuter des if pour que la personne puisse rentrer la suite du nom pour avoir un tableau de taille 1
//        Scanner sc;
//        sc = new Scanner(System.in);
//        ArrayList<Film> listeFilmsRech1 = new ArrayList();
//        listeFilmsRech1 = listeFilms;
//        while(listeFilmsRech1.size()>1){
//            System.out.println(listeFilmsRech1);
//            System.out.println("quel film choisissez vous"); 
//            String titre = sc.nextLine();
//            for (int i = 0; i<titre.length(); i++){//Si la liste de film n'est pas nulle cela signifie qu'il y a déjà un film enregistré 
//                ArrayList<Film> listeFilmsRech2 = new ArrayList();
//                for(int j = 0;j<listeFilmsRech1.size(); j++){
//                    if(listeFilmsRech1.get(j).gettitre().charAt(i)==titre.charAt(i)){
//                        listeFilmsRech2.add(listeFilmsRech1.get(j));
//                    }
//                }
//                listeFilmsRech1 = listeFilmsRech2;
//            }
//        }
//        if(listeFilmsRech1.size()==0){
//            System.out.println("Erreur, le film n'est plus à l'affiche ou n'existe pas !");
//        }
//        return listeFilmsRech1;
//    }
    public ArrayList<Film> rechercherFilm(String titre) {
        ArrayList<Film> listeFilmsRech1 = new ArrayList();
        listeFilmsRech1 = listeFilms;
        for (int i = 0; i<titre.length(); i++){//Si la liste de film n'est pas nulle cela signifie qu'il y a déjà un film enregistré 
                ArrayList<Film> listeFilmsRech2 = new ArrayList();
                for(int j = 0;j<listeFilmsRech1.size(); j++){
                    if(listeFilmsRech1.get(j).gettitre().charAt(i)==titre.charAt(i)){
                        listeFilmsRech2.add(listeFilmsRech1.get(j));
                    }
                }
                listeFilmsRech1 = listeFilmsRech2;
            }
        if(listeFilmsRech1.size()==0){
            System.out.println("Erreur, le film n'est plus à l'affiche ou n'existe pas !");
        }
        return listeFilmsRech1;
    }
    
    
    
    
    
    public void ajouter(String titre,ArrayList<String> genre,LocalDate dateSortie,ArrayList<String> acteurs,String realisateur,String resume,int note,ArrayList<Cinema> lieuxProject,int id,LocalTime duree){
        Film nouvFilm = new Film (titre,genre,dateSortie,acteurs,realisateur,resume,note,lieuxProject,id,duree);
        listeFilms.add(nouvFilm);
    }
    
    
//    public ArrayList<Cinema> rechercherCinema() {
//        Scanner sc;
//        sc = new Scanner(System.in);
//        ArrayList<Cinema> listeCineRech1= new ArrayList();
//        listeCineRech1 = Cinema;
//        while(listeCineRech1.size()>1){
//            System.out.println(listeCineRech1);
//            System.out.println("quel cinema choisissez vous");
//            String ville = sc.nextLine();
//            for (int i = 0; i<ville.length(); i++){//Si la liste des cinemas n'est pas nulle cela signifie qu'il y a déjà un cinema enregistré
//                ArrayList<Cinema> listeCineRech2 = new ArrayList();
//                for(int j = 0;j<listeCineRech1.size(); j++){
//                    if(listeCineRech1.get(j).getVille().charAt(i)==ville.charAt(i)){
//                        listeCineRech2.add(listeCineRech1.get(j));
//                    }
//                }
//                listeCineRech1 = listeCineRech2;
//            }
//        }
//        if(listeCineRech1.size()==0){
//            System.out.println("Erreur, le cinema n'existe pas !");
//        }
//        return listeCineRech1;
//    }
    
    public ArrayList<Cinema> rechercherCinema(String ville) {
        ArrayList<Cinema> listeCineRech1= new ArrayList();
        listeCineRech1 = Cinema;
        for (int i = 0; i<ville.length(); i++){//Si la liste des cinemas n'est pas nulle cela signifie qu'il y a déjà un cinema enregistré
            ArrayList<Cinema> listeCineRech2 = new ArrayList();
            for(int j = 0;j<listeCineRech1.size(); j++){
                if(listeCineRech1.get(j).getVille().charAt(i)==ville.charAt(i)){
                    listeCineRech2.add(listeCineRech1.get(j));
                }
            }
            listeCineRech1 = listeCineRech2;   
        }
        if(listeCineRech1.size()==0){
            System.out.println("Erreur, le cinema n'existe pas !");
        }
        return listeCineRech1;
    }
     
    
    public void ajouter(String ville,String coordonne,int tarif,int note,ArrayList<Film> listeFilmProj,ArrayList<Seance> listeSeance,int id){
        Cinema nouvSalle = new Cinema(ville,coordonne,tarif,note,listeFilmProj,listeSeance,id);
        Cinema.add(nouvSalle);
    }
    
    
    public ArrayList<Seance> rechercherSeance(String titre) {
        Scanner sc;
        sc = new Scanner(System.in);
        ArrayList<Seance> listeSRech1= new ArrayList();
        try{
            Film film = rechercherFilm(titre).get(0);
            listeSRech1 = Seance;
            System.out.println(listeSRech1);
            ArrayList<Seance> listeSRech5 = new ArrayList();
            for(int i=0;i<listeSRech1.size();i++){
                if(listeSRech1.get(i).getFilm().getId()==(film.getId())){
                    listeSRech5.add(listeSRech1.get(i));
                }
            }
            listeSRech1 = listeSRech5;
            if(listeSRech1.size()==0){
                System.out.println("Erreur, la seance n'existe pas !");
                return listeSRech1;
            }
            System.out.println(listeSRech1);
            System.out.println("quel date choisissez vous (annees mois jour)");
            int annees = sc.nextInt();
            int mois = sc.nextInt();
            int jour = sc.nextInt();
            LocalDate date = LocalDate.of(annees,mois,jour);
            ArrayList<Seance> listeSRech2 = new ArrayList();
            for(int i = 0;i<listeSRech1.size(); i++){
                if(listeSRech1.get(i).getHoraire().toLocalDate().equals(date)){//Trouver un charAt pour les localDate
                    listeSRech2.add(listeSRech1.get(i));
                }
            }
            listeSRech1 = listeSRech2;
            if(listeSRech1.size()==0){
                System.out.println("Erreur, la seance n'existe pas !");
                return listeSRech1;
            }
            System.out.println(listeSRech1);
            System.out.println("quel heures choisissez vous (heures minute)");
            int heures = sc.nextInt();
            int minute = sc.nextInt();
            LocalDateTime horaire = LocalDateTime.of(annees,mois,jour,heures,minute);
            ArrayList<Seance> listeSRech3 = new ArrayList();
            for(int i = 0;i<listeSRech1.size(); i++){
                if(listeSRech1.get(i).getHoraire().equals(horaire)){//Trouver un charAt pour les localDate
                    listeSRech3.add(listeSRech1.get(i));
                }
            }
            listeSRech1 = listeSRech3;
            if(listeSRech1.size()==0){
                System.out.println("Erreur, la seance n'existe pas !");
            }
        }
        catch(IndexOutOfBoundsException ex){
            System.out.println("La séance n'existe pas");
        }
        return listeSRech1;
    }
     
    public void ajouter(LocalDateTime horaires,Film film){
        Seance nouvSeance = new Seance(horaires,film);
        Seance.add(nouvSeance);
    }
    
    
    public void retirerSeance(Seance seanceSupp){
        try{
            // supprimer une seance de la liste de seance général
            Iterator<Seance> its=Seance.iterator();
            while(its.hasNext()){
                Seance x = its.next();
                if (x.equals(seanceSupp)){
                    its.remove();
                }
            }
            System.out.println(Seance);
            // supprimer une seance de la liste de seance de tous les cinémas
            for(int i=0;i<Cinema.size();i++){
                Cinema cinema = Cinema.get(i);
                for(int j=0;j<cinema.getListeSeance().size();j++){
                    if(cinema.getListeSeance().get(j).equals(seanceSupp)){
                        cinema.getListeSeance().remove(j);
                    }
                }
            }
        }
        catch(IndexOutOfBoundsException ex){
            System.out.println("Vous ne pouvez pas supprimer de cinema");
        }
    }
    
    public void supprimerFilm(String titre){
        try{
            // supprimer un film de la liste de film général
            ArrayList<Film> filmSupp = rechercherFilm(titre);
            Iterator<Film> itr = listeFilms.iterator();
            while (itr.hasNext()){
                Film x = itr.next();
                if (x.equals(filmSupp.get(0))){
                    itr.remove();
                }
            }
            System.out.println(listeFilms);
            // supprimer un film de la liste de film de tous les cinémas
            for(int i=0;i<Cinema.size();i++){
                Cinema cinema = Cinema.get(i);
                for(int j=0;j<cinema.getListeFilmProj().size();j++){
                    if(cinema.getListeFilmProj().get(j).equals(filmSupp.get(0))){
                        cinema.getListeFilmProj().remove(j);
                    }
                }
            }
            // supprimer un film de la liste de film de toutes les séances
            for(int i=0;i<Seance.size();i++){
                if(Seance.get(i).getFilm().equals(filmSupp.get(0))){
                    retirerSeance(Seance.get(i)); // essayer de supprimer toutes la seances 
                }
                
            }
        }
        catch(IndexOutOfBoundsException ex){
            System.out.println("Vous ne pouvez pas supprimer de film");
        }
    }
    
    public void supprimerCinema(String ville){
        try{
            // supprimer un cinema de la liste de cinema général
            ArrayList<Cinema> cinemaSupp = rechercherCinema(ville);
            Iterator<Cinema> itr = Cinema.iterator();
            while (itr.hasNext()){
                Cinema x = itr.next();
                if (x.equals(cinemaSupp.get(0))){
                    itr.remove();
                }
            }
            System.out.println(Cinema);
            // supprimer un cinema de la liste de cinema de tous les films
            for(int i=0;i<listeFilms.size();i++){
                Film film = listeFilms.get(i);
                for(int j=0;j<film.getLieuxProject().size();j++){
                    if(film.getLieuxProject().get(j).equals(cinemaSupp.get(0))){
                        film.getLieuxProject().remove(j);
                    }
                }
            }
        }
        catch(IndexOutOfBoundsException ex){
            System.out.println("Vous ne pouvez pas supprimer de cinema");
        }
    }
    
    public void supprimerSeance(String titre){
        try{
            // supprimer une seance de la liste de seance général
            ArrayList<Seance> seanceSupp=rechercherSeance(titre);
            Iterator<Seance> its=Seance.iterator();
            while(its.hasNext()){
                Seance x = its.next();
                if (x.equals(seanceSupp.get(0))){
                    its.remove();
                }
            }
            System.out.println(Seance);
            // supprimer une seance de la liste de seance de tous les cinémas
            for(int i=0;i<Cinema.size();i++){
                Cinema cinema = Cinema.get(i);
                for(int j=0;j<cinema.getListeSeance().size();j++){
                    if(cinema.getListeSeance().get(j).equals(seanceSupp.get(0))){
                        cinema.getListeSeance().remove(j);
                    }
                }
            }
        }
        catch(IndexOutOfBoundsException ex){
            System.out.println("Vous ne pouvez pas supprimer de cinema");
        }
    }
    
    public void modifierT(int emp,String titre){
        Film nouvFilm = new Film(titre,listeFilms.get(emp).getGenre(),listeFilms.get(emp).getDateSortie(),listeFilms.get(emp).getActeurs(),listeFilms.get(emp).getRealisateur(),listeFilms.get(emp).getResume(),listeFilms.get(emp).getNote(),listeFilms.get(emp).getLieuxProject(),listeFilms.get(emp).getId(),listeFilms.get(emp).getDuree());
        listeFilms.set(emp,nouvFilm);
    }
    public void modifierG(int emp,ArrayList<String> Genre){
        Film nouvFilm = new Film(listeFilms.get(emp).gettitre(),Genre,listeFilms.get(emp).getDateSortie(),listeFilms.get(emp).getActeurs(),listeFilms.get(emp).getRealisateur(),listeFilms.get(emp).getResume(),listeFilms.get(emp).getNote(),listeFilms.get(emp).getLieuxProject(),listeFilms.get(emp).getId(),listeFilms.get(emp).getDuree());
        listeFilms.set(emp,nouvFilm);  
    }
    public void modifierDate(int emp,LocalDate date){
        Film nouvFilm = new Film(listeFilms.get(emp).gettitre(),listeFilms.get(emp).getGenre(),date,listeFilms.get(emp).getActeurs(),listeFilms.get(emp).getRealisateur(),listeFilms.get(emp).getResume(),listeFilms.get(emp).getNote(),listeFilms.get(emp).getLieuxProject(),listeFilms.get(emp).getId(),listeFilms.get(emp).getDuree());
        listeFilms.set(emp,nouvFilm);  
    }
    public void modifierAct(int emp,ArrayList Acteurs){
        Film nouvFilm = new Film(listeFilms.get(emp).gettitre(),listeFilms.get(emp).getGenre(),listeFilms.get(emp).getDateSortie(),Acteurs,listeFilms.get(emp).getRealisateur(),listeFilms.get(emp).getResume(),listeFilms.get(emp).getNote(),listeFilms.get(emp).getLieuxProject(),listeFilms.get(emp).getId(),listeFilms.get(emp).getDuree());
        listeFilms.set(emp,nouvFilm);  
    }
    public void modifierReal(int emp,String realisateur){
        Film nouvFilm = new Film(listeFilms.get(emp).gettitre(),listeFilms.get(emp).getGenre(),listeFilms.get(emp).getDateSortie(),listeFilms.get(emp).getActeurs(),realisateur,listeFilms.get(emp).getResume(),listeFilms.get(emp).getNote(),listeFilms.get(emp).getLieuxProject(),listeFilms.get(emp).getId(),listeFilms.get(emp).getDuree());
        listeFilms.set(emp,nouvFilm);  
    }
    public void modifierResum(int emp,String resume){
        Film nouvFilm = new Film(listeFilms.get(emp).gettitre(),listeFilms.get(emp).getGenre(),listeFilms.get(emp).getDateSortie(),listeFilms.get(emp).getActeurs(),listeFilms.get(emp).getRealisateur(),resume,listeFilms.get(emp).getNote(),listeFilms.get(emp).getLieuxProject(),listeFilms.get(emp).getId(),listeFilms.get(emp).getDuree());
        listeFilms.set(emp,nouvFilm);  
    }
    public void modifierNoteF(int emp,int note){
        Film nouvFilm = new Film(listeFilms.get(emp).gettitre(),listeFilms.get(emp).getGenre(),listeFilms.get(emp).getDateSortie(),listeFilms.get(emp).getActeurs(),listeFilms.get(emp).getRealisateur(),listeFilms.get(emp).getResume(),note,listeFilms.get(emp).getLieuxProject(),listeFilms.get(emp).getId(),listeFilms.get(emp).getDuree());
        listeFilms.set(emp,nouvFilm);  
    }
    public void modifierLieux(int emp,ArrayList<Cinema>lieuxProject){
        Film nouvFilm = new Film(listeFilms.get(emp).gettitre(),listeFilms.get(emp).getGenre(),listeFilms.get(emp).getDateSortie(),listeFilms.get(emp).getActeurs(),listeFilms.get(emp).getRealisateur(),listeFilms.get(emp).getResume(),listeFilms.get(emp).getNote(),lieuxProject,listeFilms.get(emp).getId(),listeFilms.get(emp).getDuree());
        listeFilms.set(emp,nouvFilm);  
    }
    public void modifierDuree(int emp,LocalTime duree){
        Film nouvFilm = new Film(listeFilms.get(emp).gettitre(),listeFilms.get(emp).getGenre(),listeFilms.get(emp).getDateSortie(),listeFilms.get(emp).getActeurs(),listeFilms.get(emp).getRealisateur(),listeFilms.get(emp).getResume(),listeFilms.get(emp).getNote(),listeFilms.get(emp).getLieuxProject(),listeFilms.get(emp).getId(),duree);
        listeFilms.set(emp,nouvFilm);  
    }
    
    public void modifierFilm(String Titre){
        int emp = 0;
        ArrayList<Film> filmModif = rechercherFilm(Titre);
        try{
            for(int i=0;i<listeFilms.size();i++){
                if(filmModif.get(0).equals(listeFilms.get(i))){
                    emp = i;
                }
            }
            Scanner sc;
            sc = new Scanner(System.in);
            try{
                System.out.println("Que voulez vous modifier :");
                System.out.println("1.titre ; 2.genre ; 3.date de sortie ; 4.acteurs ; 5.réalisateur ; 6.résumé ; 7.note ; 8.lieux de projection ; 9.durée");
                int choix = sc.nextInt();
                switch(choix){
                    case 1:
                        System.out.println("Entrez le nouveau titre :");
                        sc = new Scanner(System.in);
                        String titre = sc.nextLine();
                        modifierT(emp,titre);
                        break;

                    case 2:
                        ArrayList<String> Genre = new ArrayList();
                        int g = 1;
                        sc = new Scanner(System.in);
                        while(g==1){
                            System.out.println("1.entrer un genre ; 2.fin");
                            g = sc.nextInt();
                            switch(g){
                                case 1:
                                    System.out.println("Entrez le ou les nouveau genre :");
                                    sc = new Scanner(System.in);
                                    String genre = sc.nextLine();
                                    Genre.add(genre);
                                case 2:
                                    break;
                                default:
                                    System.out.println("Erreur, choisi entre 1 et 2");      
                            }
                        }
                        modifierG(emp,Genre);
                        break;

                    case 3:
                        try{
                            System.out.println("Entrez la nouvelle date de sortie (Annee mois jour):");
                            sc = new Scanner(System.in);
                            int annees = sc.nextInt();
                            int mois = sc.nextInt();
                            int jour = sc.nextInt();
                            LocalDate date = LocalDate.of(annees,mois,jour);
                            modifierDate(emp,date);
                            break;
                        }
                        catch(InputMismatchException ex){
                            System.out.println("La date n'est pas bonne, vous devez ecrire des entiers");
                            break;
                        }

                    case 4:
                        ArrayList<String> Acteurs = new ArrayList();
                        int a = 1;
                        sc = new Scanner(System.in);
                        while(a==1){
                            System.out.println("1.entrer un acteur ; 2.fin");
                            a = sc.nextInt();
                            switch(a){
                                case 1:
                                    System.out.println("Entrez le ou les nouveau acteurs :");
                                    sc = new Scanner(System.in);
                                    String acteur = sc.nextLine();
                                    Acteurs.add(acteur);
                                case 2:
                                    break;
                                default:
                                    System.out.println("Erreur, choisi entre 1 et 2");      
                            }
                        }
                        modifierAct(emp,Acteurs);
                        break;

                    case 5:
                        System.out.println("Entrez le nouveau réalisateur :");
                        sc = new Scanner(System.in);
                        String realisateur = sc.nextLine();
                        modifierReal(emp,realisateur);
                        break;

                    case 6:
                        System.out.println("Entrez le nouveau résumé :");
                        sc = new Scanner(System.in);
                        String resume = sc.nextLine();
                        modifierResum(emp,resume);
                        break;

                    case 7:
                        System.out.println("Entrez la nouvelle note :");
                        sc = new Scanner(System.in);
                        int note = sc.nextInt();
                        modifierNoteF(emp,note);
                        break;

                    case 8:
                        ArrayList<Cinema> listeCinema = new ArrayList();
                        int c = 1;
                        sc = new Scanner(System.in);
                        while(c==1){
                            System.out.println("1.rechercher un cinema ; 2.fin");
                            c = sc.nextInt();
                            switch(c){
                                case 1:
                                    ArrayList<Cinema> cinema = rechercherCinema();
                                    listeCinema.add(cinema.get(0));
                                case 2:
                                    break;
                                default:
                                    System.out.println("Erreur, choisi entre 1 et 2");      
                            }
                        }
                        modifierLieux(emp,listeCinema);
                        break;

                    case 9:
                        try{
                            System.out.println("Entrez la nouvelle durée du film (heure minute):");
                            sc = new Scanner(System.in);
                            int heure = sc.nextInt();
                            int minute = sc.nextInt();
                            LocalTime duree = LocalTime.of(heure,minute);
                            modifierDuree(emp,duree);
                            break;
                        }
                        catch(InputMismatchException ex){
                            System.out.println("La durée n'est pas bonne, vous devez ecrire des entiers");
                            break;
                        }

                    default:
                        System.out.println("Erreur, tu dois écrire un chiffre entre 1 et 9");
                }
            }
            catch(InputMismatchException ex){
                System.out.println("Erreur, tu dois entrer un entier");
            }
            System.out.println(listeFilms);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Vous ne pouvez pas modifier de film");
        }
    }
    
    
    public void modifierV(int emp,String ville){
        Cinema nouvCinema = new Cinema(ville,Cinema.get(emp).getCoordonne(),Cinema.get(emp).getTarif(),Cinema.get(emp).getNote(),Cinema.get(emp).getListeFilmProj(),Cinema.get(emp).getListeSeance(),Cinema.get(emp).getId());
        Cinema.set(emp,nouvCinema);
    }
    public void modifierCoor(int emp,String coordonne){
        Cinema nouvCinema = new Cinema(Cinema.get(emp).getVille(),coordonne,Cinema.get(emp).getTarif(),Cinema.get(emp).getNote(),Cinema.get(emp).getListeFilmProj(),Cinema.get(emp).getListeSeance(),Cinema.get(emp).getId());
        Cinema.set(emp,nouvCinema);
    }
    public void modifierTarif(int emp,int tarif){
        Cinema nouvCinema = new Cinema(Cinema.get(emp).getVille(),Cinema.get(emp).getCoordonne(),tarif,Cinema.get(emp).getNote(),Cinema.get(emp).getListeFilmProj(),Cinema.get(emp).getListeSeance(),Cinema.get(emp).getId());
        Cinema.set(emp,nouvCinema);
    }
    public void modifierNoteC(int emp,int note){
        Cinema nouvCinema = new Cinema(Cinema.get(emp).getVille(),Cinema.get(emp).getCoordonne(),Cinema.get(emp).getTarif(),note,Cinema.get(emp).getListeFilmProj(),Cinema.get(emp).getListeSeance(),Cinema.get(emp).getId());
        Cinema.set(emp,nouvCinema);
    }
    public void modifierFilmsProj(int emp,ArrayList<Film> film){
        Cinema nouvCinema = new Cinema(Cinema.get(emp).getVille(),Cinema.get(emp).getCoordonne(),Cinema.get(emp).getTarif(),Cinema.get(emp).getNote(),film,Cinema.get(emp).getListeSeance(),Cinema.get(emp).getId());
        Cinema.set(emp,nouvCinema);
    }
    public void modifierSea(int emp,ArrayList<Seance> seance){
        Cinema nouvCinema = new Cinema(Cinema.get(emp).getVille(),Cinema.get(emp).getCoordonne(),Cinema.get(emp).getTarif(),Cinema.get(emp).getNote(),Cinema.get(emp).getListeFilmProj(),seance,Cinema.get(emp).getId());
        Cinema.set(emp,nouvCinema);
    }
    
    
    public void modifierCinema(){
        int emp = 0;
            ArrayList<Cinema> cinemaModif = rechercherCinema();
            try{
            for(int i=0;i<Cinema.size();i++){
                if(cinemaModif.get(0).equals(Cinema.get(i))){
                    emp = i;
                }
            }
            Scanner sc;
            sc = new Scanner(System.in);
            try{
                System.out.println("Que voulez vous modifier :");
                System.out.println("1.ville ; 2.coordonnée ; 3.tarif ; 4.note ; 5.films projeté ; 6.séances");
                int choix = sc.nextInt();
                switch(choix){
                    case 1:
                        System.out.println("Entrez la nouvelle ville :");
                        sc = new Scanner(System.in);
                        String ville = sc.nextLine();
                        modifierV(emp,ville);
                        break;

                    case 2:
                        ArrayList<String> Coordonne = new ArrayList();
                        int c = 1;
                        sc = new Scanner(System.in);
                        while(c==1){
                            System.out.println("1.entrer une coordonnée ; 2.fin");
                            c = sc.nextInt();
                            switch(c){
                                case 1:
                                    System.out.println("Entrez le ou les nouvelles coordonnées :");
                                    sc = new Scanner(System.in);
                                    String coor = sc.nextLine();
                                    Coordonne.add(coor);
                                case 2:
                                    break;
                                default:
                                    System.out.println("Erreur, choisi entre 1 et 2");      
                            }
                        }
                        modifierCoor(emp,Coordonne);
                        break;

                    case 3:
                        System.out.println("Entrez le nouveau tarif :");
                        sc = new Scanner(System.in);
                        int tarif = sc.nextInt();
                        modifierTarif(emp,tarif);
                        break;

                    case 4:
                        System.out.println("Entrez la nouvelle note :");
                        sc = new Scanner(System.in);
                        int note = sc.nextInt();
                        modifierNoteC(emp,note);
                        break;

                    case 5:
                        ArrayList<Film> Films = new ArrayList();
                        int f = 1;
                        sc = new Scanner(System.in);
                        while(f==1){
                            System.out.println("1.rechercher un film ; 2.fin");
                            f = sc.nextInt();
                            switch(f){
                                case 1:
                                    ArrayList<Film> film = rechercherFilm();
                                    Films.add(film.get(0));
                                case 2:
                                    break;
                                default:
                                    System.out.println("Erreur, choisi entre 1 et 2");      
                            }
                        }
                        modifierFilmsProj(emp,Films);
                        break;

                    case 6:
                        ArrayList<Seance> listeSeance = new ArrayList();
                        int s = 1;
                        sc = new Scanner(System.in);
                        while(s==1){
                            System.out.println("1.rechercher une séance; 2.fin");
                            s = sc.nextInt();
                            switch(s){
                                case 1:
                                    ArrayList<Seance> seance = rechercherSeance();
                                    listeSeance.add(seance.get(0));
                                case 2:
                                    break;
                                default:
                                    System.out.println("Erreur, choisi entre 1 et 2");      
                            }
                        }
                        modifierSea(emp,listeSeance);
                        break;

                    default:
                        System.out.println("Erreur, tu dois écrire un chiffre entre 1 et 9");        
                }
            }
            catch(InputMismatchException ex){
                System.out.println("Erreur, tu dois entrer un entier");
            }
            System.out.println(Cinema);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Vous ne pouvez pas modifier de cinema");
        }
    }
    
    
    
    public void modifierHoraire(int emp,LocalDateTime horaire){
        Seance nouvSeance = new Seance(horaire,Seance.get(emp).getFilm());
        Seance.set(emp,nouvSeance);  
    }
    public void modifierF(int emp,Film film){
        Seance nouvSeance = new Seance(Seance.get(emp).getHoraire(),film);
        Seance.set(emp,nouvSeance);  
    }
    
    public void modifierSeance(){
        int emp = 0;
        ArrayList<Seance> seanceModif = rechercherSeance();
        System.out.println(seanceModif);

        try{
            for(int i=0;i<Seance.size();i++){
                if(seanceModif.get(0).equals(Seance.get(i))){
                    emp = i;
                }
            }
            Scanner sc;
            sc = new Scanner(System.in);
            try{
                System.out.println("Que voulez vous modifier :");
                System.out.println("1.horaire ; 2.Film");
                int choix = sc.nextInt();
                switch(choix){
                    case 1:
                        try{
                            System.out.println("Entrez la nouvelle horaire (année mois jour heure minute):");
                            sc = new Scanner(System.in);
                            int annee = sc.nextInt();
                            int mois = sc.nextInt();
                            int jour = sc.nextInt();
                            int heure = sc.nextInt();
                            int minute = sc.nextInt();
                            LocalDateTime horaire = LocalDateTime.of(annee,mois,jour,heure,minute);
                            modifierHoraire(emp,horaire);
                            break;
                        }
                        catch(InputMismatchException ex){
                            System.out.println("L'horraire n'est pas bonne, vous devez ecrire des entiers");
                            break;
                        }

                    case 2:
                        Film film = rechercherFilm().get(0);
                        modifierF(emp,film);
                        break;

                    default:
                        System.out.println("Erreur, tu dois écrire un chiffre entre 1 et 2"); 
                }
            }
            catch(InputMismatchException ex){
                    System.out.println("Erreur, tu dois entrer un entier");
                }

            System.out.println(Seance);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Vous ne pouvez pas modifier de séance");
        }
            
    }
        
    public void sauvegarderFilm(){
        try{
            FileWriter fich = new FileWriter(fichierFilm);
            Iterator<Film>it = listeFilms.iterator();
            while(it.hasNext()==true){
               Film x = it.next();
               fich.write(x+System.lineSeparator()); 
            }
            fich.close();
        }
        catch (IOException ex){
            System.out.println("La liste de scores n'a pas pu être sauvegardée");
        }
    }
    
    
    public ArrayList<Cinema> rechercherC(ArrayList<Integer> listeId){
        ArrayList<Cinema> listeCinema = new ArrayList();
        for (int i = 0; i<listeId.size(); i++){  
            for(int j=0;j<Cinema.size();j++){
                if(listeId.get(i).equals(Cinema.get(j).getId())){
                    listeCinema.add(Cinema.get(j));
                }
            }
        }
        return listeCinema;
    }
    
    public void chargerFilm()throws IOException{
        FileReader fich = new FileReader(fichierFilm);
        BufferedReader br = new BufferedReader(fich);
        String ligne = br.readLine();
        while(ligne!=null){
            //String[] film = new ArrayList().ligne.split("|") ;
            String[]film = ligne.split(";");
            // titre
            String titre = film[0];
            // genre
            String genre1 = film[1].substring(1,film[1].length()-1);
            String[] genre2 = genre1.split(", ");
            List<String> genre3 = new ArrayList<>();
            genre3 = Arrays.asList(genre2);
            ArrayList<String> genre = new ArrayList<String>(genre3);
            // date de sortie
            LocalDate dateSortie = LocalDate.parse(film[2]);
            // acteurs
            String acteurs1 = film[3].substring(1,film[3].length()-1);
            String[] acteurs2 = acteurs1.split(", ");
            List<String> acteurs3 = new ArrayList<>();
            acteurs3 = Arrays.asList(acteurs2);
            ArrayList<String> acteurs  = new ArrayList<String>(acteurs3);
            // réalisateur
            String realisateur = film[4];
            // résumé
            String resume = film[5];
            // note
            int note = Integer.valueOf(film[6]);
            // id
            int id = Integer.valueOf(film[8]);
            // duree
            LocalTime duree = LocalTime.parse(film[9]);
            // lieux de projection
            String lieuxProject1 = film[7].substring(1,film[7].length()-1);
            String[] lieuxProject2 = lieuxProject1.split(", ");
            Integer[] lieuxProject3 = new Integer[lieuxProject2.length];
            try{
                for(int i=0;i<lieuxProject2.length;i++){
                    System.out.println(lieuxProject2[i]);
                    lieuxProject3[i] = Integer.parseInt(lieuxProject2[i]);
                }
                List<Integer> lieuxProject4 = new ArrayList<Integer>();
                lieuxProject4 = Arrays.<Integer>asList(lieuxProject3);
                ArrayList<Integer> lieuxProject = new ArrayList<Integer>(lieuxProject4);
                ajouter(titre,genre,dateSortie,acteurs,realisateur,resume,note,rechercherC(lieuxProject),id,duree);
            }
            catch(NumberFormatException ex){
                ArrayList<Integer> lieuxProject = new ArrayList();
                ajouter(titre,genre,dateSortie,acteurs,realisateur,resume,note,rechercherC(lieuxProject),id,duree);
            }
            ligne = br.readLine();
        }
        fich.close();
    }
   
    
    public void sauvegarderCinema(){//equivalent vers fichier ici pour les cinemas
        try{
            FileWriter fich = new FileWriter(fichierCinema);
            Iterator<Cinema> it = Cinema.iterator();
            while (it.hasNext()==true){
                Cinema x = it.next();
                fich.write(x+System.lineSeparator()); 
            }
            fich.close();
        }
        catch (IOException ex){
            System.out.println("Les salles n'ont pas pu être enregistré...");
        }
    }
    
    
    public ArrayList<Film> rechercherF(ArrayList<Integer> listeId){
        ArrayList<Film> films = new ArrayList();
        for (int i = 0; i<listeId.size(); i++){  
            for(int j=0;j<listeFilms.size();j++){
                if(listeId.get(i).equals(listeFilms.get(j).getId())){
                    films.add(listeFilms.get(j));
                }
            }
        }
        return films;
    }
    
    public void chargerCinema()throws IOException{
        FileReader fich = new FileReader(fichierCinema);
        BufferedReader br = new BufferedReader(fich);
        String ligne = br.readLine();
        while(ligne!=null){
            //String[] film = new ArrayList().ligne.split("|") ;
            String[]cinema = ligne.split(";");
            // ville
            String ville = cinema[0];
            // coordonnée
//            String coor1 = cinema[1].substring(1,cinema[1].length()-1);
//            String[] coor2 = coor1.split(", ");
//            List<String> coor3 = new ArrayList<>();
//            coor3 = Arrays.asList(coor2);
//            ArrayList<String> coor = new ArrayList<String>(coor3);
            String coor = cinema[1];
            // tarif
            int tarif = Integer.valueOf(cinema[2]);
            // note
            int note = Integer.valueOf(cinema[3]);
            // id
            int id = Integer.valueOf(cinema[6]);
            // film projeté et seance
            String filmProj1 = cinema[4].substring(1,cinema[4].length()-1);
            String[] filmProj2 = filmProj1.split(", ");
            Integer[] filmProj3 = new Integer[filmProj2.length];
            try{
                for(int i=0;i<filmProj2.length;i++){
                    System.out.println(filmProj2[i]);
                    filmProj3[i] = Integer.parseInt(filmProj2[i]);
                }
                List<Integer> filmProj4 = new ArrayList<Integer>();
                filmProj4 = Arrays.<Integer>asList(filmProj3);
                ArrayList<Integer> filmProj = new ArrayList<Integer>(filmProj4);
                ArrayList<Seance> seance = new ArrayList();
                for(int j=0;j<rechercherF(filmProj).size();j++){
                    for(int k=0;k<Seance.size();k++){
                        if(rechercherF(filmProj).get(j).equals(Seance.get(k).getFilm())){
                            seance.add(Seance.get(k));
                        }
                    }
                }
                ajouter(ville,coor,tarif,note,rechercherF(filmProj),seance,id);
            }
            catch(NumberFormatException ex){
                ArrayList<Integer> filmProj = new ArrayList();
                ArrayList<Seance> seance = new ArrayList();
                for(int j=0;j<rechercherF(filmProj).size();j++){
                    for(int k=0;k<Seance.size();k++){
                        if(rechercherF(filmProj).get(j).equals(Seance.get(k).getFilm())){
                            seance.add(Seance.get(k));
                        }
                    }
                }
                ajouter(ville,coor,tarif,note,rechercherF(filmProj),seance,id);
            }
            ligne = br.readLine();
        }
        fich.close();
    }
    
    
    
    
    
    public void sauvegarderSeance(){//equivalent vers fichier ici pour les seances
        try{
            FileWriter fich = new FileWriter(fichierSeance);
            Iterator<Seance> it = Seance.iterator();
            while (it.hasNext()==true){
                Seance x = it.next();
                fich.write(x+System.lineSeparator());   
            }
            fich.close();
        }
        catch (IOException ex){
            System.out.println("Les seances n'ont pas pu être enregistré...");
        }
    }
    
    public Film rechercherF(int idFilm){  // prend en argument l'identifiant du film de la séance
        Film film = null;  // initialise un film null
        for(int j=0;j<listeFilms.size();j++){  // parcours toute la liste des films global
            if(listeFilms.get(j).getId()==idFilm){  // verifie si l'identifiant du film de la séance correspond à un film de la liste des films global
                film = listeFilms.get(j);    // la variable film prend la valeur du film où son identifiant correspond à l'indentifiant du film de la séance
            }
        }
        return film;  // retourne la film
    }
    
    public void chargerSeance()throws IOException{
        FileReader fich = new FileReader(fichierSeance);
        BufferedReader br = new BufferedReader(fich);
        String ligne = br.readLine();
        while(ligne!=null){
            String[]seance = ligne.split(";");
            // horaire
            LocalDateTime horaire = LocalDateTime.parse(seance[0]);  // tarnsforme la chaine de caractere en une localDateTime
            // film
            int film = Integer.valueOf(seance[1]); // recupère l'indentifiant du film de la séance
            ajouter(horaire,rechercherF(film)); // ajoute la séance
            ligne = br.readLine(); // lit la prochaine ligne
        }
        fich.close(); // ferme le fichier
    }

// public void sauvegarderS(){//equivalent vers fichier ici pour les seances
//        try{
//            FileWriter fich = new FileWriter(fichierSeance);
//            Iterator<Seance> it = Seance.iterator();
//            while (it.hasNext()==true){
//                Seance x = it.next();
//                fich.write(x+System.lineSeparator());
//               
//            }
//            fich.close();
//        }
//        catch (IOException ex){
//            System.out.println("Les films n'ont pas pu être enregistré...");
//        }
    
    
    public String toString() {
        return "Film{" + "listeFilms=" + listeFilms + '}'+"    Cinema{" + "listeCinema=" + Cinema + '}' + "   Seance{" + "listeSeance=" + Seance + '}';
    }
    
    
    public int getTailleListeFilms(){
        return listeFilms.size();
    }
    
    public int getTailleListeCinema(){
        return Cinema.size();
    }
    
    public ArrayList<Film> getFilms(){
        return listeFilms;
    }
    
    public ArrayList<Cinema> getCinema(){
        return Cinema;
    }
    
    public void afficherFilm(ArrayList<Film> Films,JLabel[] tabLab,int indPrem){
        for(int i = 0;i<tabLab.length;i++){
            if(indPrem<Films.size()){
                Films.get(indPrem).afficherImage(tabLab[i]);
                System.out.println(Films.get(indPrem));
                indPrem = (indPrem+1);//%listeFilms.size();
            }
            else{
                tabLab[indPrem].setIcon(new ImageIcon());
            }
        } 
    }
    
    public void afficherTitre(ArrayList<Film> Films,JButton[] tabLab,int indPrem){
        for(int i = 0;i<tabLab.length;i++){
            if(indPrem<Films.size()){
                Films.get(indPrem).afficherT(tabLab[i]);
                System.out.println(Films.get(indPrem));
                indPrem = (indPrem+1);//%listeFilms.size();
            }
            else{
                tabLab[indPrem].setVisible(false);
            }
        } 
    }
}
