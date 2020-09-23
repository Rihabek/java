package glaces;

import geometrie.Point ;

/**
 * Un iceberg rectangulaire
 * @author Belkhadiri rihab
 */
public class Iceberg2D {

    private Point enBasAGauche ;
    private Point enHautADroite ;

    /**
     * Construction
     * @param g le coin en bas à gauche
     * @param d le coin en haut à droite
     * uniquement en coordonnées positives
     */
    public Iceberg2D(Point g, Point d)
    {
      //Traduction littérale : j'affecte le paramètre "g ,d "
      // de ma fonction au champ "enBasAGauche et enHautADroite" de l'objet de type "Iceberg2D"
      // en cours d'utilisation.
      this.enBasAGauche = g;
      this.enHautADroite = d;

    }




    /**
     * Construction par fusion de deux icebergs qui se touchent
     * @param i1 premier iceberg à fusionner
     * @param i2 deuxième iceberg à fusionner
     */
    public Iceberg2D(Iceberg2D i1, Iceberg2D i2)
    {

        double abscisse1;
        double ordonnee2;
        double ordonnee1;
        double abscisse2;
        if (i1.coinEnHautADroite().getAbscisse()>i2.coinEnHautADroite().getAbscisse())
        {
            if (i1.coinEnHautADroite().getOrdonnee()>i2.coinEnHautADroite().getOrdonnee())
            {
                ordonnee2 = i1.coinEnHautADroite().getOrdonnee();

                abscisse2 = i1.coinEnHautADroite().getAbscisse();
            }else{

              ordonnee2 = i2.coinEnHautADroite().getOrdonnee();

              abscisse2 = i1.coinEnHautADroite().getAbscisse();
            }
        }else{
          if (i1.coinEnHautADroite().getOrdonnee()>i2.coinEnHautADroite().getOrdonnee())
          {
              ordonnee2 = i1.coinEnHautADroite().getOrdonnee();

              abscisse2 = i2.coinEnHautADroite().getAbscisse();
          }else{
            ordonnee2 =i2.coinEnHautADroite().getOrdonnee();

            abscisse2 = i2.coinEnBasAGauche().getAbscisse();

          }
        }
        if (i2.coinEnBasAGauche().getAbscisse()>i1.coinEnBasAGauche().getAbscisse())
        {
            if (i2.coinEnBasAGauche().getOrdonnee()>i1.coinEnBasAGauche().getOrdonnee())
            {
              ordonnee1 = i1.coinEnBasAGauche().getOrdonnee();

              abscisse1 = i1.coinEnBasAGauche().getAbscisse();
            }else{
              ordonnee1 = i2.coinEnBasAGauche().getOrdonnee();

              abscisse1 = i1.coinEnBasAGauche().getAbscisse();
            }
        }else{
          if (i1.coinEnBasAGauche().getOrdonnee()<i2.coinEnBasAGauche().getOrdonnee())
          {
              ordonnee1 = i1.coinEnBasAGauche().getOrdonnee();

              abscisse1 = i2.coinEnBasAGauche().getAbscisse();
          }else{
            ordonnee1 = i2.coinEnBasAGauche().getOrdonnee();

            abscisse1 = i2.coinEnBasAGauche().getAbscisse();
          }
        }

        this.enHautADroite= new Point(abscisse2, ordonnee2);

        this.enBasAGauche= new Point(abscisse1, ordonnee1);
    }




    /**
     * Retourne le coin en bas à gauche
     * @return le coin en bas à gauche
     */
    public Point coinEnBasAGauche()
    {
      double ordonnee = this.enBasAGauche.getOrdonnee();

      double abscisse = this.enBasAGauche.getAbscisse();

        return new Point(abscisse,ordonnee);
    }



    /**
     * Retourne le coin en haut à droite
     * @return le coin en haut à droite
     */
    public Point coinEnHautADroite()
    {
      double ordonnee = this.enHautADroite.getOrdonnee();

      double abscisse = this.enHautADroite.getAbscisse();
        return new Point(abscisse,ordonnee);
    }





    /**
     * Retourne la hauteur
     * @return hauteur
     */
    public double hauteur()
    {
      this.enHautADroite.getOrdonnee();

      this.enBasAGauche.getOrdonnee();

        return this.enBasAGauche.getOrdonnee() - this.enHautADroite.getOrdonnee();
    }




    /**
     * Retourne la largeur
     * @return largeur
     */
    public double largeur()
    {

        return this.enHautADroite.getAbscisse() - this.enBasAGauche.getAbscisse();

    }

    /**
     * Retourne la surface totale
     * @return surface totale
     */
    public double surface()
    {

        return this.largeur()*this.hauteur();

    }


    /**
     * Retourne vrai si il y a une collision entre les deux icebergs
     * @param i iceberg potentiellement en collision
     * @return vrai si collision entre les deux icebergs
     */
    public boolean collision(Iceberg2D i)
    {
      if ((this.largeur()+i.largeur())*
      (this.hauteur()+i.hauteur())<(this.enBasAGauche.getAbscisse()-
      this.enHautADroite.getAbscisse()*(this.enBasAGauche.getOrdonnee()-
      this.enHautADroite.getOrdonnee())))
      {
        return true;
      }
      return false ;
    }


    /**
     * Retourne vrai si this est plus volumineux que i
     * @param i iceberg à comparer
     * @return vrai si this est plus volumineux que i
     */
    public boolean estPlusGrosQue(Iceberg2D i)
    {
      if (this.surface()>i.surface())
      {
        return true;
      }
      return false ;
    }


    public String toString()
    {
      double  a = this.enHautADroite.getAbscisse();
      double  b = this.enHautADroite.getOrdonnee();
      double  c = this.enBasAGauche.getAbscisse();
      double  d = this.enBasAGauche.getOrdonnee();

      return String.format("PointBasAGauche(%.1f,%.1f),PointHautADroite(%.2f,%.2f)",a , b ,c ,d);
    }

    /**
     * Retourne le point au centre
     * @return le point au centre de l'iceberg
     */
    public Point centre()
    {
      double abscisse = (this.coinEnHautADroite().getAbscisse()+this.coinEnBasAGauche().getAbscisse())/2;

      double ordonnee = (this.coinEnHautADroite().getOrdonnee()+this.coinEnBasAGauche().getAbscisse())/2;

        return new Point(abscisse,ordonnee);
    }

    /**
     * Réduction dans les quatre directions ; le centre ne bouge pas
     * @param fr dans ]0..1[ facteur de réduction
     */
    public void fondre(double fr)
    {
        double abscisse1 = this.centre().getAbscisse()-this.largeur()/2*(1-fr);

        double ordonnee1 = this.centre().getOrdonnee()-this.hauteur()/2*(1-fr);

        double abscisse2 = this.centre().getAbscisse()+this.largeur()/2*(1-fr);

        double ordonnee2 = this.centre().getOrdonnee()+this.hauteur()/2*(1-fr);

        this.enBasAGauche = new Point(abscisse1,ordonnee1);

        this.enHautADroite = new Point(abscisse2,ordonnee2);

    }

    /**
     * Casser une partie à droite
     * @param fr dans ]0..1[ facteur de réduction
     */
    public void casserDroite(double fr)
    {

    }

    /**
     * Casser une partie à gauche
     * @param fr dans ]0..1[ facteur de réduction
     */
    public void casserGauche(double fr)
    {

    }

    /**
     * Casser une partie en haut
     * @param fr dans ]0..1[ facteur de réduction
     */
    public void casserHaut(double fr)
    {

    }

    /**
     * Casser une partie en bas
     * @param fr dans ]0..1[ : définit le pourcentage supprimé
     */
    public void casserBas(double fr)
    {

    }

}
