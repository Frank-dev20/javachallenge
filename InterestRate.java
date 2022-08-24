package challenge;

public class InterestRate {
    public static void main(String[]args){
//        for(int i=2; i<=8; i++){
//            System.out.println(String.format("%.2f",calculateInterestRate(10000.0, i)));
//        }

        for(int i=8; i>=2; i--){
            System.out.println(String.format("%.2f",calculateInterestRate(10000.0, i)));
        }
    }
    public static double calculateInterestRate(double amount, double rate){
        return (amount * (rate/100));
    }
}
