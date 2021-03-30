package com.company;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int devices = scanner.nextInt();
        switch (devices) {
            case 0:
                System.out.println();
            case 1:
                System.out.println("iPhone");
                break;
            case 2:
                System.out.println("TV");
                break;
            case 3:
                System.out.println("Laptop");
                break;
            case 4:
                System.out.println("Microphone");
                break;
            case 5:
                System.out.println("Mouse");
                break;
            case 6:
                System.out.println("Computer");
                break;
            case 7:
                System.out.println("Magic-book");
                break;
            case 8:
                System.out.println("Router");
                break;
            case 9:
                System.out.println("Headphones");
                break;
            case 10:
                System.out.println("Keyboard");
                break;

        }
    }
}
