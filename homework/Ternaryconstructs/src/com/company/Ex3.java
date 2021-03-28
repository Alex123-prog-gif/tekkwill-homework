package com.company;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String package1 = scanner.nextLine();
        int hours=scanner.nextInt();
        double sum=0;
        if(package1.equals("A")){
            sum=9.95;
            if(hours>10){
                sum+=(hours-10)*2;
            }
            System.out.println(sum);
        }
        if(package1.equals("B")){
            sum=13.95;
            if (hours>20);
            sum+=(hours-20)*1.0;


        }
        if(package1.equals("C")){
            sum=19.95;
            if (hours>12);
            sum+=(hours-12)*3;

        }





    }
}
