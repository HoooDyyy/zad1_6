import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
    double odczyt;
    double wynik;
    
        System.out.println("Podaj temperature");
        odczyt = scan.nextDouble();

   wynik = (odczyt * 9 / 5) + 32;
            System.out.println("Temperatura wynosi: " + wynik + " ℉");
        }
}