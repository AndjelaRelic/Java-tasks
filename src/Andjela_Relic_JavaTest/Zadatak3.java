package Andjela_Relic_JavaTest;

public class Zadatak3 {
    //Napisati funkciju prostiBrojevi koja za zadati ceo broj n, 2 < n ≤ 50,
    //ispisuje za svaki broj t, 2 ≤ t ≤ n poruku oblika:
    //1 "<t> je prost "; ako je t prost broj
    //2 "<t> je slozen "; ako t nije prost broj
    //OBJASNJENJE:
    //Broj je prost ako je deljiv samo sa 1 i sa samim sobom.
    //Broj x je deljiv brojem y ako je ostatak operacije x/y jedank 0.
    //Write a function primeNumbers which for given integer n, 2 < n ≤ 50,
    //prints for each number t, 2 ≤ t ≤ n a message of the form:
    //1 "<t> is prime "; if t is a prime number
    //2 "<t> is complex "; if t is not a prime number
    //EXPLANATION:
    //A number is prime if it is divisible only by 1 and itself.
    //The number x is divisible by the number y if the remainder of the operation x/y is equal to 0.

    static void prostiBrojevi(int n) {

        if (n < 3 || n > 50) {
            System.out.println("Uneti broj mora biti od 3 do 50 (ukljucujuci 50)");
        } else {
            for (int t = 2; t <= n; t++) {
                boolean b = true;
                for (int i = 2; i < Math.sqrt(n); i++) {
                    if (t % i == 0) {
                        b = false;
                        break;
                    }
                }
                if (b) {
                    System.out.println(t + " je prost.");
                } else {
                    System.out.println(t + " je slozen.");
                }
            }
        }
    }

    public static void main(String[] args) {

        int a =50;
        prostiBrojevi(a);

        }
    }

