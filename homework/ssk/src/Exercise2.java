import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        long meters = 2500;
        int hour = 5;
        int minutes = 56;
        int seconds = 23;
        int kilometers = 25;
        int miles = 12;
        System.out.println(meters / seconds);
        System.out.println(kilometers / hour);
        System.out.println(miles / hour);

        Scanner scanner = new Scanner(System.in);

        int myNumber = scanner.nextInt();
        System.out.println("my number is : " + myNumber);

        float myfloatNumber = scanner.nextFloat();
        System.out.println("my float number: " + myfloatNumber);
    }
}

