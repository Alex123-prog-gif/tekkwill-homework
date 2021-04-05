import java.util.Scanner;

public class PROJECT {
    public static void main(String[] args) {
        System.out.println("Hello my friend");
        System.out.println("I'm named the Chatty-bot");
        System.out.println("I was created during the Java Fundamentals course of March-June 2021.Born during the COVID pandemic!Can you believe that");
        System.out.println("Whats your name?");
        Scanner scanner = new Scanner(System.in);
        String Alex = scanner.nextLine();
        System.out.println(Alex);
        System.out.println("What's your age?");
        System.out.println("Put 7 to your age and i will guess it");
        int userAge = scanner.nextInt();
        System.out.println("Your age is " + (userAge - 7));
        System.out.println("You know what else i can do?I can count to any number you want!Tell me when to stop");
        for (int i = 0;i<=5;i++){
            System.out.println(i);
        }




        
        
    }
}
