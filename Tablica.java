

package random;
import java.util.Arrays;
import java.util.Random;

public class Tablica {
	public static void main(String[] args) {
		int[] tablica = new int[100];
		     Random generator = new Random();
		for(int i =0; i< 100; i++) {
		tablica[i] = generator.nextInt(10);
		System.out.println("tablica[" + i + "] = " + tablica[i]);
		}
		int max = tablica[0];
		for(int i =0 ; i<100; i++) {
		if(tablica[i] > max) {
		max = tablica[i];
		}
		}
		int suma = 0;
		for(int i=0; i<100; i++){
		suma += tablica[i];
		}
		double a = 100;
		double srednia = suma/a;

		Arrays.sort(tablica);
		double mediana = 0;
		double �rednia = 0.0;
		for(int i=0; i < tablica.length; i++){
		System.out.println("sortt=" + tablica[i]);
		�rednia = tablica[tablica.length/2] + tablica [(tablica.length/2)-1];
		mediana = �rednia / 2.0;
		}System.out.println("mediana =" + mediana);
		System.out.println("suma =" + suma);
		System.out.println("max =" + max);
		System.out.println("�rednia =" + srednia);
		}


	}

	
	
