package java8.codility;

public class AddTwoDigit {

    public static void main(String[] args) {
        adaTwoDigit(100);

    }

    public static void adaTwoDigit(int n) {
        int sum = 0;
        if ((10 <= n) && (n <= 99)) {
            while (n > 0) {
                sum = sum + n % 10;
                n = n / 10;
            }
        }
        System.out.println(sum);
    }
}
