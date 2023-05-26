import Data.Data;

import mining.KMeansMiner;
import keyboardinput.Keyboard;

	public class MainTest {
		public static void main(String[] args) {
			Data data = new Data();
			System.out.println(data);
	
			do {
				int k = 0;
				System.out.print("\n\nInserisci il numero di cluster: ");
				k = Keyboard.readInt();

				KMeansMiner kmeans = new KMeansMiner(k);
				int numIter = kmeans.kmeans(data);
				System.out.println("\nNumero di Iterazione:" + numIter + "\n");
				System.out.println(kmeans.getC().toString(data));

				System.out.print("\n\nVuoi continuare? (y/n): ");
			} while (Keyboard.readChar() == 'y');
		}
	}
