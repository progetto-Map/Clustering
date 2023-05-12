
public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean errore;
		Data data =new Data();
		System.out.println(data);
		int k=0;
		KMeansMiner kmeans = null;
		int numIter=0;
		do {
			System.out.println("Inserisci il numero di k:");
			errore=false;
			k=Keyboard.readInt();
		}while (errore);
		System.out.println("Numero di Iterazione:"+numIter);
		System.out.println(kmeans.getC().toString(data));
		
		
	}

}

