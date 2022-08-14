package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        int people, piza, counter = 1;
        Scanner scanner = new Scanner(System.in);
        people = scanner.nextInt();
        piza = scanner.nextInt();

            while (((piza*counter) % people)!=0) {
                counter++;
            }
            System.out.println(counter);

    }
}
