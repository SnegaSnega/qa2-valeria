import org.junit.jupiter.api.Test;

public class Domashka {
    private int globalVar = 10;

    @Test
    public void Domashka() {
        System.out.println("Summa kredita: 1000 EUR");
        System.out.println("Summa% + komissija: " + sumOneDigits(1000, 0.25, 1095, 365, 250));
        System.out.println("Summa vsej viplati: " + sumTwoDigits(1000, 0.25, 1095, 365, 250));
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
