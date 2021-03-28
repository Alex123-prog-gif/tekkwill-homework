package com.company;

import com.sun.xml.internal.bind.v2.util.EditDistance;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
       String medium = scanner.nextLine();
        double distance = scanner.nextDouble();
        int water = 4900;
        int air = 1100;
        int steel = 16400;

        if(medium.equals("air")){
            System.out.println(distance/air);
        }else if(medium.equals("water")){
            System.out.println(distance/water);
        }else if (medium.equals("steel")){
            System.out.println(distance/steel);
        }





    }
}
