package obiektowe.improwizacja;

public class PlacBudowy {

   MaterialBudowlany material1;
   MaterialBudowlany material2;
   boolean rozpoczetaBudowa = false;


    public PlacBudowy(MaterialBudowlany material1, MaterialBudowlany material2) {
        this.material1 = material1;
        this.material2 = material2;
    }

    public void rozpocznijBudowe(){
             //jesli mamy  min. 100 cegiel
             //jesli mamy  min. 150kg cementu
            // rozpocznij metody
        boolean wystarczajacoCementu = false;
        boolean wystarczajacoCegiel = false;

        if(material1.nazwa.equals("cement") && material1.ilosc>= 150
                || material2.nazwa.equals("cement") && material2.ilosc>= 150 ){
            System.out.println("Mamy dosyć cementu!");
            wystarczajacoCementu = true;
        }

        if(material1.nazwa.equals("cegly") && material1.ilosc>= 100
                || material2.nazwa.equals("cegly") && material2.ilosc>= 100 ){
            System.out.println("Mamy dosyć cegieł!");
            wystarczajacoCegiel = true;
        }

        if (wystarczajacoCementu && wystarczajacoCegiel) {
            rozpoczetaBudowa = true;
            System.out.println("Zaczynam budowe!");
        }
    }


    public String toString(){
       return "Plac budowy zawiera: Materiał 1: " + material1 +
               "Materiał 2: " + material2 +
               " budowa rozpoczeta: " + rozpoczetaBudowa;
   }




}
