package Data;

import java.util.*;
import Data.DiscreteAttribute;
import java.util.Iterator;

public class Data {
    // Le visibilità di classi , attributi e metodi devono essere decise dagli
    // studenti
    List<Example> data = new ArrayList<Example>(); // una matrice nXm di tipo Object dove ogni riga modella una transazione
    int numberOfExamples; // cardinalità dell'insieme di transazioni (numero di righe in data)
    List<Attribute> attributeSet = new LinkedList<Attribute>(); // un vettore degli attributi in ciascuna tupla (schema della tabella di dati)

    /*
     * COMPORTAMENTO: Inizializza la matrice data [][] con transazioni di esempio
     * (in questo momento, 14 esempi e 5 attributi come riportato nella tabella
     * sottostante);
     * Inizializza attributeSet creando cinque oggetti di tipo DiscreteAttribute,
     * uno per ciascun attributo (nella tabella sottostante). Attenzione a modellare
     * correttamente, nome, indice e dominio di ciascun attributo.
     * Inizializza numberOfExamples
     */


    public class Example implements Comparable<Example>{
        private List<Object> example = new ArrayList<Object>();
        
        public void add(Object o){
            example.add(o);
        }
        private Object get(int i){
            return example.get(i);
        }
        
        private int i = 0;
        @Override
        public int compareTo(Example o) {
            for ( int i=0; i<example.size(); i++) {
              if (example.get(i).equals(o.get(i))) {
                return 0;
              } else {
                return (((String)example.get(i)).compareTo((String)o.get(i) )< 0) ? 1 : -1;
              }
            }
            return 0;
          }

        public String toString(){
            
            for (Object o : example) {
                return o.toString();
            }
            return null;
        }

    }
    public Data() {

        // data
/*
        data = new Object[14][5];

        data[0][0] = new String("sunny");
        data[1][0] = new String("sunny");
        data[2][0] = new String("sunny");
        data[3][0] = new String("rain");
        data[4][0] = new String("rain");
        data[5][0] = new String("rain");
        data[6][0] = new String("rain");
        data[7][0] = new String("rain");
        data[8][0] = new String("rain");
        data[9][0] = new String("rain");
        data[10][0] = new String("overcast");
        data[11][0] = new String("overcast");
        data[12][0] = new String("overcast");
        data[13][0] = new String("overcast");

        data[0][1] = new String("hot");
        data[1][1] = new String("hot");
        data[2][1] = new String("hot");
        data[3][1] = new String("mild");
        data[4][1] = new String("mild");
        data[5][1] = new String("mild");
        data[6][1] = new String("mild");
        data[7][1] = new String("mild");
        data[8][1] = new String("mild");
        data[9][1] = new String("mild");
        data[10][1] = new String("cold");
        data[11][1] = new String("cold");
        data[12][1] = new String("cold");
        data[13][1] = new String("cold");

        data[0][2] = new String("high");
        data[1][2] = new String("high");
        data[2][2] = new String("high");
        data[3][2] = new String("normal");
        data[4][2] = new String("normal");
        data[5][2] = new String("normal");
        data[6][2] = new String("normal");
        data[7][2] = new String("normal");
        data[8][2] = new String("normal");
        data[9][2] = new String("normal");
        data[10][2] = new String("high");
        data[11][2] = new String("high");
        data[12][2] = new String("high");
        data[13][2] = new String("high");

        data[0][3] = new String("weak");
        data[1][3] = new String("weak");
        data[2][3] = new String("weak");
        data[3][3] = new String("strong");
        data[4][3] = new String("strong");
        data[5][3] = new String("strong");
        data[6][3] = new String("strong");
        data[7][3] = new String("strong");
        data[8][3] = new String("strong");
        data[9][3] = new String("strong");
        data[10][3] = new String("strong");
        data[11][3] = new String("strong");
        data[12][3] = new String("strong");
        data[13][3] = new String("strong");

        data[0][4] = new String("no");
        data[1][4] = new String("no");
        data[2][4] = new String("no");
        data[3][4] = new String("yes");
        data[4][4] = new String("yes");
        data[5][4] = new String("yes");
        data[6][4] = new String("yes");
        data[7][4] = new String("yes");
        data[8][4] = new String("yes");
        data[9][4] = new String("yes");
        data[10][4] = new String("yes");
        data[11][4] = new String("yes");
        data[12][4] = new String("yes");
        data[13][4] = new String("yes");

        data[0][0] = new String("sunny");
        data[1][0] = new String("sunny");
        data[2][0] = new String("overcast");
        data[3][0] = new String("rain");
        data[4][0] = new String("rain");
        data[5][0] = new String("rain");
        data[6][0] = new String("overcast");
        data[7][0] = new String("sunny");
        data[8][0] = new String("sunny");
        data[9][0] = new String("rain");
        data[10][0] = new String("sunny");
        data[11][0] = new String("overcast");
        data[12][0] = new String("overcast");
        data[13][0] = new String("rain");

        data[0][1] = new String("hot");
        data[1][1] = new String("hot");
        data[2][1] = new String("hot");
        data[3][1] = new String("mild");
        data[4][1] = new String("cool");
        data[5][1] = new String("cool");
        data[6][1] = new String("cool");
        data[7][1] = new String("mild");
        data[8][1] = new String("cool");
        data[9][1] = new String("mild");
        data[10][1] = new String("mild");
        data[11][1] = new String("mild");
        data[12][1] = new String("hot");
        data[13][1] = new String("mild");

        data[0][2] = new String("high");
        data[1][2] = new String("high");
        data[2][2] = new String("high");
        data[3][2] = new String("high");
        data[4][2] = new String("normal");
        data[5][2] = new String("normal");
        data[6][2] = new String("normal");
        data[7][2] = new String("high");
        data[8][2] = new String("normal");
        data[9][2] = new String("normal");
        data[10][2] = new String("normal");
        data[11][2] = new String("high");
        data[12][2] = new String("normal");
        data[13][2] = new String("high");

        data[0][3] = new String("weak");
        data[1][3] = new String("strong");
        data[2][3] = new String("weak");
        data[3][3] = new String("weak");
        data[4][3] = new String("weak");
        data[5][3] = new String("strong");
        data[6][3] = new String("strong");
        data[7][3] = new String("weak");
        data[8][3] = new String("weak");
        data[9][3] = new String("weak");
        data[10][3] = new String("strong");
        data[11][3] = new String("strong");
        data[12][3] = new String("weak");
        data[13][3] = new String("strong");

        data[0][4] = new String("no");
        data[1][4] = new String("no");
        data[2][4] = new String("yes");
        data[3][4] = new String("yes");
        data[4][4] = new String("yes");
        data[5][4] = new String("no");
        data[6][4] = new String("yes");
        data[7][4] = new String("no");
        data[8][4] = new String("yes");
        data[9][4] = new String("yes");
        data[10][4] = new String("yes");
        data[11][4] = new String("yes");
        data[12][4] = new String("yes");
        data[13][4] = new String("no");
        */

        TreeSet<Example> TempData = new TreeSet<Example>();

        Example ex0 = new Example();
        Example ex1 = new Example();
        Example ex2 = new Example();
        Example ex3 = new Example();
        Example ex4 = new Example();
        Example ex5 = new Example();
        Example ex6 = new Example();
        Example ex7 = new Example();
        Example ex8 = new Example();
        Example ex9 = new Example();
        Example ex10 = new Example();
        Example ex11 = new Example();
        Example ex12 = new Example();
        Example ex13 = new Example();

        //da completare

        // numberOfExamples

        ex0.add(new String("sunny"));
        ex1.add(new String("sunny"));
        ex2.add(new String("sunny"));
        ex3.add(new String("rain"));
        ex4.add(new String("rain"));
        ex5.add(new String("rain"));
        ex6.add(new String("rain"));
        ex7.add(new String("rain"));
        ex8.add(new String("rain"));
        ex9.add(new String("rain"));
        ex10.add(new String("overcast"));
        ex11.add(new String("overcast"));
        ex12.add(new String("overcast"));
        ex13.add(new String("overcast"));

        numberOfExamples = 14;

        // explanatory Set

        attributeSet = new LinkedList<Attribute>();


        String[] outLookValues = new String[3];
        outLookValues[0] = "overcast";
        outLookValues[1] = "rain";
        outLookValues[2] = "sunny";

        attributeSet.add(0, new DiscreteAttribute("Outlook", 0, outLookValues));
        String[] temperatureValues = new String[3];
        temperatureValues[0] = "hot";
        temperatureValues[1] = "mild";
        temperatureValues[2] = "cold";
        attributeSet.add(1, new DiscreteAttribute("Temperature", 1, temperatureValues));
    
        String[] humidityValues = new String[2];
        humidityValues[0] = "high";
        humidityValues[1] = "normal";
        attributeSet.add( 2, new DiscreteAttribute("Humidity",2, humidityValues));
    
        String[] windValues=new String[2];
        windValues[0] = "weak";
        windValues[1] = "strong";
        attributeSet.add(3, new DiscreteAttribute("Wind",3, windValues));
    
        String[] playTennisValues=new String[2];
        playTennisValues[0] = "yes";
        playTennisValues[1] = "no";
        attributeSet.add(4, new DiscreteAttribute("PlayTennis",4, playTennisValues));

    }

    /**
     * COMPORTAMENTO: restituisce numberOfExamples
     * 
     * @return numberOfExamples Cardinalità dell'insieme di transazioni
     */
    public int getNumberOfExamples() {
        return numberOfExamples;
    }

    /**
     * COMPORTAMENTO: restituisce la dimensione di attributeSet
     * 
     * @return attributeSet.lengh Cardinalità dell'insieme degli attributi
     */
    public int getNumberOfAttributes() {
        return attributeSet.size();
    }

    /**
     * COMPORTAMENTO: restituisce attributeSet
     * 
     * @param exampleIndex   indice di riga
     * @param attributeIndex indice di colonna in riferimento alla matrice
     *                       memorizzata in data
     * @return data[exampleIndex][attributeIndex] Restituisce lo schema dei dati
     */
    public Object getAttributeValue(int exampleIndex, int attributeIndex) {
        return data.get(exampleIndex);
    }

    /**
     * 
     * @param index
     * @return attributeSet[index]
     */
    Attribute getAttribute(int index) {
        return attributeSet.get(index);
    }

    /**
     * COMPORTAMENTO: crea una stringa in cui memorizza lo schema della tabella
     * (vedi attributeSet) e le transazioni memorizzate in data, opportunamente
     * enumerate. Restituisce tale stringa
     * 
     * @return s Stringa che modella lo stato dell'oggetto
     */
    public String toString() {
        String s = "";
        for (int a = 0; a < attributeSet.size(); a++) {
            s = s + attributeSet.get(a).getName() + ",";

        }
        s = s + "\n";
        for (int b = 0; b < numberOfExamples; b++) {
            s = s + (b + 1) + ":";
            for (int c = 0; c < attributeSet.size(); c++) {
                s = s + data.get(b) + ",";
            }
            s = s + "\n";
        }

        return s;
    }

    /**
     * COMPORTAMENTO: Crea e restituisce un oggetto di Tuple che modella come
     * sequenza di coppie Attributo-valore la i-esima riga in data.
     * 
     * @param index indice di riga
     * @return tuple Oggetto di Tuple
     */
    public Tuple getItemSet(int index) {
        Tuple tuple = new Tuple(attributeSet.size());
        for (int i = 0; i < attributeSet.size(); i++) {
            tuple.add(new DiscreteItem(attributeSet.get(i), ((Data) data).getItemSet(index)), i);

        }
        return tuple;
    }

    /**
     * COMPORTAMENTO:
     * 
     * @param k Numero di cluster da generare
     * @return array Di k interi rappresentanti gli indici di riga in data per le
     */
    public int[] sampling(int k) {
        int centroidIndexes[] = new int[k];
        // choose k random different centroids in data.
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        for (int i = 0; i < k; i++) {
            boolean found = false;
            int c;
            do {
                found = false;
                c = rand.nextInt(getNumberOfExamples());
                /*
                 * verify that centroid[c] is not equal to a centroide already
                 * stored in Centr      oidIndexes
                 */
                for (int j = 0; j < i; j++)
                    if (compare(centroidIndexes[j], c)) {
                        found = true;
                        break;
                    }
            } while (found);
            centroidIndexes[i] = c;
        }
        return centroidIndexes;
    }

    /**
     * COMPORTAMENTO: restituisce vero se le due righe di data contengono gli stessi valori, falso altrimenti
     * 
     * @param i Indice di una riga nell'insieme in Data
     * @param j Indice di una riga nell'insieme in Data
     * @return result True oppure false
     */
    private boolean compare(int i, int j) {
        boolean result = true;
        for (int k = 0; i < getNumberOfAttributes(); k++) {
            if (!data.get(i).equals(data.get(j))) {
                result = false;
            }
        }
        return result;
    }

    /*
    /**
     * COMPORTAMENTO: restituisce computePrototype(idList,
     * (DiscreteAttribute)attribute)
     * 
     * @param idList    Insieme di indici di riga
     * @param attribute Attributo rispetto al quale calcolare il prototipo
     *                  (centroide)
     * @return Valore centroide rispetto ad attribute
     *//*    protected Object ComputePrototype(ArraySet idList, Attribute attribute) {
        return computePrototype(idList, (DiscreteAttribute) attribute);
    }
    */
    /*
    /**
     * COMPORTAMENTO: Determina il valore che occorre più frequentemente per
     * attribute nel sottoinsieme di dati individuato da idList (fare uso del metodo
     * frequency(...) di DiscretAttribute).
     * 
     * @param idList    Insieme degli indici delle righe di data appartenenti as un
     *                  cluster
     * @param attribute Attributo discreto rispetto al quale calcolare il prototipo
     *                  (centroide)
     * @return a Centroide rispetto ad attribute
     *//*     protected String computePrototype(ArraySet idList, Attribute attribute) {
        int i = 0;
        for (i = 0; i < data.length; i++) {
            String a = computePrototype(idList, attribute.frequency(this.data, idList, attribute.getValue(i)));
            return a;
        }
    }*/

    Object computePrototype(HashSet idList, Attribute attribute){
        //il metodo restituisce il valore centroide rispetto ad attribute
        return computePrototype(idList, (DiscreteAttribute)attribute);
      }
      String computePrototype (HashSet idList, DiscreteAttribute attribute){
    
        String first="";
        int max=attribute.frequency(this,idList,first);
        for(String s:attribute){
          int tmp=attribute.frequency(this,idList,s);
          if(tmp>max){
            max=tmp;
            first=s;
          }
        }
        return first;
      }

    public static void main(String args[]) {
        Data trainingSet = new Data();
        System.out.println(trainingSet.toString());

    }

}
