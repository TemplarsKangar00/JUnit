package test;

public class LargestPrimeFactory {

	private long number;
	
	public LargestPrimeFactory(long number){
		this.number = number;
	}
	
	public long getLargestPrimeFactory() {
        long primeFactor = 1L;

        for (long i = 2L; i <= number / i; ) {
            if (number % i == 0) {
                primeFactor = i;
                number /= i;
            } else {
                i++;
            }
        }
        if (primeFactor < number) {
            primeFactor = number;
        }
        return primeFactor;
    }
}
