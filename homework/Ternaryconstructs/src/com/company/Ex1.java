package com.company;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalcalories = scanner.nextInt();
        int caloriesfromfat = 9;
        int fatgrams = 9;
        double percentageofcaloriesfromfat =  ( caloriesfromfat+0.0)/totalcalories  * 100;
        System.out.println(percentageofcaloriesfromfat);








    }
}
