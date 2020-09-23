package java.testAwaz;

import awaz.Awaz;
import awaz.AwazImage;
import java.util.Scanner;


public class MenuAwaz
{
  public static void main(String[] args)
  {

      // Création d'une melodie vide
      Awaz melodie = new Awaz();
      AwazImage picture = new AwazImage();
      System.out.println("melodie a été bien ajouter");


      Scanner scan = new Scanner(System.in);
      System.out.print('\n' + "Entrez un chiffre entre 0 et 10 : ");
      chiffre = scan.nextInt();

      System.out.println("1.Ajouter une note");

      System.out.println("2.Afficher la melodie");

      System.out.println("3.Ajouter un titre à la melodie");

      System.out.println("4.Verifier si la melodie n'est pas vide");

      System.out.println("5.Transposer chaque note de la melodie");

      System.out.println("6.Afficher le mélodie en format ABC");

      System.out.println("7.Retourner la derniere note de la melodie");

      System.out.println("8.Retourner le nombre de notes de la melodie");

      System.out.println("9.Effacer toutes les notes");

      System.out.println("10.Retourner la ieme note de la melodie");

      switch(chiffre) {

        //ajouter une melodie
        case 1:

          Scanner scan1 = new Scanner(System.in);
          System.out.print("Ajoutez une note:");
          switch(note) {
            case 1:

              Scanner scan1 = new Scanner(System.in);
              System.out.println("ajouter une note" + melodie.add(Do));
              String note = scan1.nextLine();
            break;

            case 2:
                Scanner scan1 = new Scanner(system.in);


          }


        break;

        //Afficher la melodie
        case 2:

            Scanner scan2 = new Scanner(System.in);
            System.out.println("Afficher la melodie : " + melodie.toString() );

        break;

        //choisir un titre pour la melodie
        case 3:

          Scanner scan3 = new Scanner(System.in);
          System.out.println("Entrez un title a la melodie  : ");
          String title = scan3.next();
          melodie.setTitre(title);

        break;


        //verifier si la melodie n'est pas vide
        case 4:
          if (melodie.estVide()){
            System.out.println("La melodie est vide ");
          }else{
            System.out.println("La melodie n'est pas vide");
          }
        break;


        //Transposer les notes de la melodie
        case 5:

          Scanner scan5 = new Scanner(System.in);
          System.out.println("combien de demi tons vous voulez transposer:");
          int Tons = scan5.nextInt();
          melodie.transposer(Tons);

        break;

        //Afficher le mélodie en format ABC
        case 6:

          System.out.println("La melodie au format ABC : " + melodie.toABC());

        break;


        //la derniere note de la melodie
        case 7:

          System.out.println("La derniere note est :"+ melodie.getLast());

        break;



        //le nb de notes de la melodie
        case 8:
          System.out.println("Le nombre des notes est : " + melodie.nbNotes());
        break;


        //Effacer les notes de la melodie
        case 9:

          melodie.nouveau();
          System.out.println("Effacer success");

        break;


        //afficher ieme note
        case 10:

          Scanner scan10 = new Scanner(System.in);
          System.out.println("Entrez quelle ieme de note vous voulez afficher: ");
          int i = scan10.nextInt();
          System.out.println(melodie.ieme(i));

        break;

    }
  }
}
