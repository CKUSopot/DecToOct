import java.util.Scanner;
/**
 * 4. Wzorując się na przykładzie 2 napisz program DecToOct, który będzie konwertował
 * liczbę dziesiętną na zapis ósemkowy, użyj wielowariantowej instrukcji switch().
 */
public class DecToOct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę dziesiętną dodatnią: ");
        int liczbaD = scanner.nextInt();
        int liczba = liczbaD;
        String wynik = "";
        while(liczba != 0){
            int oct = liczba % 8;
            switch (oct){
                case 0:
                    wynik = "0" + wynik;
                    break;
                    case 1:
                    wynik = "1" + wynik;
                    break;
                    case 2:
                    wynik = "2" + wynik;
                    break;
                    case 3:
                    wynik = "3" + wynik;
                    break;
                    case 4:
                    wynik = "4" + wynik;
                    break;
                    case 5:
                    wynik = "5" + wynik;
                    break;
                    case 6:
                    wynik = "6" + wynik;
                    break;
                    case 7:
                    wynik = "7" + wynik;
                    break;
            }
            liczba = liczba / 8;
        }
        System.out.printf("liczba dziesiętna %d to zapis ósemkowy %s", liczbaD, wynik);
    }
}