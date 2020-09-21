package testAwaz;

import awaz.Awaz;

/**
 * Cette classe est le point de d�part du Tp Awaz
 * @author martine
 * @version Janvier 2018
 */
public class MainAwaz {
    public static void main(String[] args) {
        // Cr�ation d'une m�lodie vide
        Awaz melodie = new Awaz() ;

        melodie.nbNotes();

        //Transposer

        System.out.println(melodie.transposer(1));
       //Effacer la m�lodie

        melodie.nouveau();

        //cree une nouvelle m�lodie
              // Ajouter quelques notes dans la m�lodie
        melodie.add("Do");
        melodie.add("Ri");
        melodie.add("Mi");
        melodie.add("Fa");
        melodie.add("Sol");


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
        picture.setMelodie(melodie.toABC());

    }
}
