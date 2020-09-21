package testAwaz;

import awaz.Awaz;
import awaz.AwazImage;
import java.util.Scanner;


public class MenuAwaz {
    public static void main(String[] args) {
    int choix = 10;

    // Création d'une melodie vide
        Awaz melodie = new Awaz();
        AwazImage picture = new AwazImage();
        System.out.println('\n' + "@@@ Une melodie a ete creee @@@");

    do {
      System.out.println("1-Ajouter une note");

      System.out.println("2-Afficher la melodie");

      System.out.println("10-ajouter un titre à la melodie");

      System.out.println("4-Verifier si la melodie n'est pas vide");

      System.out.println("12-Transposer chaque note de la melodie");

      System.out.println("11-Afficher le mélodie en format ABC");

      System.out.println("5-Retourner la derniere note de la melodie");

      System.out.println("8-Retourner le nombre de notes de la melodie");

      System.out.println("9-Effacer toutes les notes");

      System.out.println("14-Quitter");
      // System.out.println("13-Afficher et jouer la melodie");
      // System.out.println("6-Retourner le titre de la melodie");
      // System.out.println("7-Retourner la ieme note de la melodie");
      // System.out.println("3-Enregistrer la melodie dans un fichier");

      Scanner scan = new Scanner(System.in);
      System.out.print('\n' + " @@@ choisissez vous une chiffre entre 0 et 10 : ");
      choix = scan.nextInt();
      System.out.print("@@@" + '\n' + '\n');

      switch(choix) {
        //ajouter une melodie
        case 1:
          Scanner scan1 = new Scanner(System.in);
            System.out.print('\n' + "Ajoutez une note : ");
            String note = scan1.nextLine();
            melodie.add(note);
          break;

          //Afficher la melodie
      case 2:
          Scanner scan2 = new Scanner(System.in);
            System.out.println('\n' + "Afficher la melodie : " + melodie.toString() );
        break;

        //Enregistrez la melodie dans un fichier
      case 3:
        Scanner scan3 = new Scanner(System.in);
          System.out.println('\n' + "Donner le nom du fichier : ");
          String name = scan3.next();
          melodie.enregistrer(name);
        break;

        //verifier si la melodie n'est vide
        case 4:
          if (melodie.estVide())
            System.out.println("La melodie ne contient aucune note ");
          else
            System.out.println("La melodie contient au moins une note");
        break;

        //la derniere note de la melodie
        case 5:
          System.out.println(" @@@ La derniere note de la melodie est : "+ melodie.getLast() +"@@@");
        break;


        //le titre de la melodie
        case 6:
          System.out.println("@@@ Le titre de la melodie est : " + melodie.getTitre()+"@@@" );
        break;


        //afficher ieme note
        case 7:
          Scanner scan7 = new Scanner(System.in);
            System.out.println('\n' + "vous voulez afficher quelle ieme de note : ");
            int i = scan7.nextInt();
            System.out.println(melodie.ieme(i));
        break;
        //le nb de notes de la melodie

        case 8:
          System.out.println(" @@@ Le nombre de notes de la melodie est : " + melodie.nbNotes() +"@@@");
        break;


        //effacer les notes de la melodie
        case 9:
          melodie.nouveau();
            System.out.println("@@@ vous avez effacer tous les notes de la melodie" + "@@@");
        break;

        //choisir un titre pour la melodie
        case 10:

          Scanner scan10 = new Scanner(System.in);
              System.out.println('\n' + " choisissez un titre à la melodie : ");
          String title = scan10.next();
          melodie.setTitre(title);
        break;

        //Afficher le mélodie en format ABC
        case 11:
          System.out.println(" @@@ La melodie au format ABC : " + melodie.toABC() + " @@@");
        break;


        //Transposer les notes de la melodie
        case 12:
          Scanner scan12 = new Scanner(System.in);
              System.out.println('\n' + "De combien de demi tons vous voulez transposer");
          int Tons = scan12.nextInt();
          melodie.transposer(Tons);
        break;

        //Afficher et jouer la melodie
        case 13:
          melodie.toString();
          picture.setMelodie(melodie.toABC());
        break;
        }
      }
      while (choix != 14);

      }
}
