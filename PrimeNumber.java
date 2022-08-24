package challenge;

public class PrimeNumber {
    public static void main(String[] args) {
//        System.out.println(isPrime(23));

        int count = 0;
        for (int i=10; i<50; i++){
            if(isPrime(i)){
                count++;
                System.out.println("The number is " + i + " and it is a prime number " + count);

            }
        }
    }

    public static boolean isPrime(int n){
        if(n==1)
            return false;

        for(int i=2; i <= n/2; i++){
            if(n % 1 == 0){
                return false;
            }
        }
        return true;
    }
}
