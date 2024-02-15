import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int nr = sc.nextInt();
        if(nr < 0)
            System.out.println("Numarul este negativ.");
        else
            System.out.println("Numarul este pozitiv.");

        int[] numere = {5, 10, 15, 20, 2};
        int suma = 0;
        for (int numar : numere) {
            suma += numar;
        }
        double media = (double) suma / numere.length;
        System.out.println("Media numerelor din sir este: " + media);

    }
}

