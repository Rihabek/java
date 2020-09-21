package testAwaz;

import awaz.Awaz;
import awaz.AwazImage;

/**
 * Cette classe est le point de départ du Tp Awaz
 * @author martine
 * @version Janvier 2018
 */
public class MainAwaz {
    public static void main(String[] args)
    {

        // Création d'une mélodie vide
        Awaz melodie = new Awaz() ;


        AwazImage img = new AwazImage();



        // Ajouter quelques notes dans la mélodie
        melodie.add("Do");
        melodie.add("Re");
        melodie.add("Mi");
        melodie.add("Fa");
        melodie.add("Sol");
        melodie.add("La");
        melodie.add("Si");
        melodie.add("Do");




        // Affiicher la mélodie
        System.out.println(melodie.toString());



        // Nb de notes de la mélodie
        System.out.println(melodie.nbNotes());

        //Transposer
        melodie.transposer(1);


        //Effacer la m�lodie
        melodie.nouveau();

         //cree une nouvelle m�lodie
        // Ajouter quelques notes dans la m�lodie
         melodie.add("Do");
         melodie.add("Re");
         melodie.add("Mi");



         //parcourir et afficher les notes

         for (int i=0;i<nbNotes;i++) {
         System.out.println(melodie.ieme(i));
         System.out.println(" ");
         }



        //enregistrer la mélodie
         melodie.enregistrer("nom");


        //ajouter des notes
         melodie.add("Do");
         melodie.add("Fa");



        //Afficher le mélodie en format ABC
         System.out.println(melodie.toABC());



        //Afficher et jouer la melodie
         melodie.toString();

 
