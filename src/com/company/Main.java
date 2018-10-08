package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //int multiple5;
        int counter ;
        // while (counter % 3 == 0) ;
        for (counter = 1; counter <= 100; counter++) {
            if (counter % 3 == 0 && counter % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (counter % 5 == 0) {
                System.out.println("Buzz");
            } else if (counter % 3 ==0){
                System.out.println("Fizz");
            }else {
                System.out.println(counter);
            }
        }


    }
}
