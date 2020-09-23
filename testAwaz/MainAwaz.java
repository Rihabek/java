package testAwaz;

import awaz.Awaz;
import awaz.AwazImage;

/**
 * Cette classe est le point de départ du Tp Awaz
 * @author martine
 * @version Janvier 2018
 */


public class MainAwaz
{
    public static void main(String[] args)
    {

        //mélodie vide
        Awaz melodie = new Awaz() ;

        //l'image
        AwazImage img = new AwazImage();




        // ajouter des notes
        melodie.add("Do");

        melodie.add("Re");

        melodie.add("Mi");

        melodie.add("Fa");

        melodie.add("Sol");

        melodie.add("La");

        melodie.add("Si");

        melodie.add("Do");




        // Affiicher
        System.out.println(melodie.toString());



        // Nb de notes
        System.out.println(melodie.nbNotes());

        //Transposer
        melodie.transposer(1);


        //Effacer
        melodie.nouveau();

        // Ajouter des notes
         melodie.add("Do");
         melodie.add("Re");
         melodie.add("Mi");



         //parcourir et afficher la melodie sur la meme ligne

         for (int i=0; i < nbNotes; i++)
         {
           System.out.println(melodie.ieme(i));
           System.out.println(" ");
         }



        //enregistrer la mélodie
         melodie.enregistrer("name");


        //ajouter des notes
         melodie.add("Do");
         melodie.add("Fa");
         melodie.add("la");




        //Afficher le mélodie en format ABC
         system.out.println(melodie.toABC());


        //Afficher et jouer la melodie
         melodie.toString();
       }
}
