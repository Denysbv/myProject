package com.SoftServAcademy;

import java.math.BigDecimal;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value a:");
        a = scanner.nextInt();
        System.out.println("Enter value b:");
        b = scanner.nextInt();
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));

        System.out.println("How are you?");
        String answer;
        answer = scanner.next();
        System.out.println("You are " + answer + ".");

        int r;
        System.out.println("Enter bed radius:");
        r = scanner.nextInt();
        System.out.println("Bed perimeter is - " + (int) (2*Math.PI*r) + ".");
        System.out.println("Bed area is - " + (int) (Math.PI*Math.pow(r,2)) + ".");

        String name;
        String address;
        System.out.println("What is your name?");
        name = scanner.next();
        System.out.println("Where do you live, " + name + "?");
        address = scanner.next();
        System.out.println(name + ", you live in " + address + ".");

        double c1, c2, c3, t1, t2, t3;
        System.out.println("What is the price of call to France per minute and how long was call?");
        c1 = scanner.nextDouble();
        t1 = scanner.nextDouble();
        double p1 = Math.round(c1*t1*100)/100.00;
        System.out.println("This call will cost - " + p1);
        System.out.println("What is the price of call to Germany per minute and how long was call?");
        c2 = scanner.nextDouble();
        t2 = scanner.nextDouble();
        double p2 = Math.round(c2*t2*100)/100.00;
        System.out.println("This call will cost - " + p2);
        System.out.println("What is the price of call to Italy per minute and how long was call?");
        c3 = scanner.nextDouble();
        t3 = scanner.nextDouble();
        double p3 = Math.round(c3*t3*100)/100.00;
        System.out.println("This call will cost - " + p3);
        System.out.println("Total cost of all calls - " + Math.round(p1+p2+p3*100)/100.00);
    }
}
