public class TwinPrimes {
    public static void main(String[] args) {
        System.out.println("Perechile de numere prime mai mici de 100:");
        findTwinPrimes(100);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void findTwinPrimes(int limit) {
        for (int i = 2; i < limit; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }
}