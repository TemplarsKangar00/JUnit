package test;

/**
 * 
 * @author Bart³omiej Miazga Program wyszukujacy najwiekszego dzielnika bedacego
 *         liczba pierwsza.
 * 
 */
public class LargestPrimeFactory {

	/**
	 * Zmienna prywatna przechowujaca znaleziona liczbe pierwsza.
	 */
	private long largestPrimeNumber;

	/**
	 * Deklaracja konstruktora okreslajacego gorna granice poszukiwan.
	 * 
	 * @param range
	 */
	public LargestPrimeFactory(long range) {
		largestPrimeNumber = findLargestPrimeFactor(range);

		if (range < 1) {
			throw new RuntimeException();
		}
	}

	/**
	 * Metoda zwracajaca znaleziona najwieksza liczbe pierwsza.
	 * 
	 * @return liczbe pierwsza
	 */
	public long getLargestPrimeFactory() {
		return this.largestPrimeNumber;
	}

	/**
	 * Metoda znajdujaca najwieksza liczbe pierwsza z przedzialu podanego w
	 * parametrze. Podczas iteracji wyznaczany jest dzielnik liczby oraz
	 * sprawdzany jest warunek czy inkrementator dzieli liczbe bez reszty.
	 * Metoda zwraca najwiekszy dzielnik bedacy liczba pierwsza.
	 * 
	 * @param bigNumber
	 * @return dzielnik
	 */
	private long findLargestPrimeFactor(long bigNumber) {
		long largestPrimeFactory = 0;

		for (long i = 2; i <= bigNumber / i;) {
			if (bigNumber % i == 0) {
				largestPrimeFactory = i;
				bigNumber /= i;
			} else {
				i++;
			}
		}
		if (largestPrimeFactory < bigNumber) {
			largestPrimeFactory = bigNumber;
		}
		return largestPrimeFactory;
	}
}