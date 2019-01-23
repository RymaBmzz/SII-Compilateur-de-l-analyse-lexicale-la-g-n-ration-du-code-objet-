import java.util.LinkedList;

public class ListQuad
{
    LinkedList<ElementQuadd> Quadlist = new LinkedList<>();
    int qd = 0;
//ajouter un nouveau quadruplet a la liste
    public void ajoutquad(String s1,String s2,String s3,String s4) {

        ElementQuadd nvquad = new ElementQuadd(s1, s2, s3, s4);
        qd++;
        Quadlist.add(nvquad);
    }
//permet de recuperer un quadruplet de numero p
    public ElementQuadd getQuad(int p)
    {
        return Quadlist.get(p);

    }
    //l'affichage de la liste des quadruplet
    public void AfficheQuand()
    { int i;
        for (i =0;i<Quadlist.size();i++)
        {
            System.out.println(getQuad(i).toString());
        }
    }
    public int position()
    { return qd;}
   public  int size(){return Quadlist.size();}
}
