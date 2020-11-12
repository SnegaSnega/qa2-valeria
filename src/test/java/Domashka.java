import org.junit.jupiter.api.Test;

public class Domashka {
    private int globalVar = 10;

    @Test
    public void Domashka() {
        System.out.println("Summa kredita: 1000 EUR");
        System.out.println(sumOneDigits(1000, 0.25, 1095, 365, 150));
        System.out.println(sumTwoDigits(1000, 0.25, 1095, 365, 150));
    }

     private double sumOneDigits(int a, double b, int c, int d, int e) {
        double F = ( a * b * c ) / d + e;
        return F;
     }
    private double sumTwoDigits(int a, double b, int c, int d, int e) {
        double F = ( a * b * c ) / d + e;
        return F+a;
    }
}
