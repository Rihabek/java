package glaces.tests;


import geometrie.Point;
import glaces.Iceberg2D;

/**
* @author belkhadiri rihab
* iceberg2d tests
*/

public class TestIceberg2D
{
  public static void main(String[] args)
  {
    Point point1 = new Point(2,3);

    Point point2 = new Point(4,5);

    Iceberg2D Iceberg1 = new Iceberg2D(point1,point2);

    System.out.println("le point enBasAGauche du Iceberg1 = (2,3)");

    System.out.println("le point enHautADroite DU Iceberg1 = (4,5)");

    Point point3 = new Point(6,7);

    Point point4 = new Point(8,9);

    Iceberg2D Iceberg2 = new Iceberg2D(point3,point4);

    System.out.println("le point enBasAGauche du iceberg2 = (6,7)");

    System.out.println("le point enHautADroite DU Iceberg2 = (8,9)");

    Iceberg2D Iceberg3 = new Iceberg2D(Iceberg1,Iceberg2);

    System.out.println("fusionne entre Iceberg1 et Iceberg2");


    System.out.println("l'abscisse du enHautADroite d'Iceberg3:");

    System.out.println(Iceberg3.coinEnHautADroite().getAbscisse());


    System.out.println("la largeur:");

    System.out.println(Iceberg3.largeur());


    System.out.println("l'hauteur:");

    System.out.println(Iceberg3.hauteur());

    System.out.println("la surface:");

    System.out.println(Iceberg3.surface());

    System.out.println("collision entre iceberg1 et iceberg2 :");

    System.out.println(Iceberg3.collision(Iceberg1));

    System.out.println("Iceberg1 plus grand que Iceberg2 :");

    System.out.println(Iceberg3.estPlusGrosQue(Iceberg1));

    System.out.println("l'ordonnée des deux point du Iceberg3");

    System.out.println(Iceberg3.toString());

    System.out.println("le centre:");

    System.out.println(Iceberg3.centre().getAbscisse());











  }
}
