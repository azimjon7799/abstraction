public class Math{
    public static double sqrt(double number){
        if(number < 0){
            throw new IllegalArgumentException("Number must be positive");
        }
        double tolerance = 1e-10;
        double guess = number / 2.0;

        while (Math.abs(guess * guess - number) > tolerance) {
            guess = (guess + number / guess) / 2.0;
        }
        return guess;
    }

    public static double abs(double number){
        if(number < 0){
            return -number;
        }
        return number;
    }
}