import java.util.Scanner;
public class BMR {
public static void main (String[] args) {
Scanner read = new Scanner (System.in);
Scanner greed = new Scanner (System.in);
    System.out.println("Podaj płeć - Kobieta czy Mężczyzna");
String gender = greed.nextLine();
  System.out.println("Wprowadź wagę");
  double weigh = read.nextDouble();
  System.out.println("Wprowadź wzrost");
  double heigh = read.nextDouble();
  System.out.println("Wprowadź wiek");
  double age = read.nextDouble();
  System.out.println("Waga " + weigh);
  System.out.println("Wzrost " + heigh);
  System.out.println("Wiek " + age);
  if("Mężczyzna".equals(gender)){
    double Men = Math.round(66.47 + (13.75 * weigh) + (5 * heigh) - (6.75 * age));
    System.out.println();
    System.out.println("Podstawowa Przemiana Materii Mężczyzny - " + Men);
    System.out.println();
    double lowM = Math.round(Men*1.4);
    System.out.println("Niska aktywność fizyczna mężczyzny - " +lowM);
    double medM = Math.round(Men*1.6);
    System.out.println("Średnia aktywność fizyczna mężczyzny - " +medM);
    double hiM = Math.round(Men*1.75);
    System.out.println("Wysoka (3-5 treningów w tygodniu) aktywność fizyczna mężczyzny - " +hiM);
    double hyperM = Math.round(Men*2.0);
    System.out.println("Bardzo wysoka aktywność fizyczna mężczyzny - " +hyperM);
    double extremeM = Math.round(Men*2.2);
    System.out.println("Wyczynowe uprawianie sportu przez mężczyznę - " +extremeM);
    System.out.println();
  }
  else if ("Kobieta".equals(gender)){
    double Woman = Math.round(665.09+(9.56*weigh)+(1.85*heigh)-(4.67*age));
    System.out.println();
    System.out.println("Podstawowa Przemiana Materii Kobiety - " + Woman);
    System.out.println();
    double lowW = Math.round(Woman*1.4);
    System.out.println("Niska aktywność kobiety - " +lowW);
    double medW = Math.round(Woman*1.6);
    System.out.println("Średnia aktywność kobiety - " +medW);
    double hiW = Math.round(Woman*1.75);
    System.out.println("Wysoka (3-5 treningów w tygodniu) aktywność fizyczna kobiety - " +hiW);
    double hyperW = Math.round(Woman*2.0);
    System.out.println("Bardzo wysoka aktywność kobiety - " +hyperW);
    double extremeW = Math.round(Woman*2.2);
    System.out.println("Wyczynowe uprawianie sportu przez kobietę - " +extremeW);
    System.out.println();
  }
  System.out.println("Aby zacząć się odchudzać, od odpowiednich dla siebie wartości, należy odjąć 500 kcal");

}
}