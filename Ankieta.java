import java.util.Scanner;
public class Ankieta 
{
  public static void main(String[] args) 
  {
	  Scanner input = new Scanner(System.in);
	  System.out.println("Podaj imię");
	  String imię = input.nextLine();
	  System.out.println("Witaj " + imię);
	  
	  System.out.println("Podaj twój wiek");
	  int wiek = input.nextInt();
	  System.out.println("Twój wiek to " + wiek);
	  
	  System.out.println("Podaj twój wzrost w cm (w celu wyliczenia indeksu bmi)");
	  double wzrost = input.nextDouble();
	  System.out.println("Podaj twoją wagę w kg (w celu wyliczenia indeksu bmi)");
	  double waga = input.nextDouble();
	  wzrost = wzrost / 100;
	  double bmi = waga/(Math.pow(wzrost, 2));
	  System.out.println("Twój indeks BMI wynosi " + bmi);
	  if (bmi<19)
	  {
	  System.out.println("Jesteś zbyt szczupły/szczupła !");
	  }
	  else if(bmi>25)
	  {
	  System.out.println("Czas na odchudzanie !");
	  }
	  else
	  {
	  System.out.println("Gratulacje Twój indeks bmi jest idealny. Mieści się w przedziale");
	  for (int i = 25; i>=19; i--)
	 
	  {
		  System.out.println(i);
		  
	  }
		  
	  
		  
	  }
  }

}
