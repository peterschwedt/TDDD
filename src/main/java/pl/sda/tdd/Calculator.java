package pl.sda.tdd;

import java.util.Scanner;

public class Calculator {

    int x;
    int y;

    public static int add(int x, int y) {
        return x + y;
    }

    public static int substract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        if (y == 0) {
            y = y + 1;
        }
            return x / y;

}


       /* Scanner input=new Scanner(System.in);
        System.out.println("Enter Number 1");
        x=input.nextInt();
        System.out.println("Enter Number 2");
        y=input.nextInt();

        System.out.println("Please enter operation + - / or *");
        Scanner op=new Scanner(System.in);
        String operation = op.next();

        if (operation.equals("+")){
            System.out.println("Your Answer: " + (x+y));
        }
        if (operation.equals("-")){
            System.out.println("Your Answer: "+ (x-y));
        }
        if (operation.equals("/")){
            System.out.println("Your Answer: "+ (x/y));
        }
        if (operation.equals("*")){
            System.out.println("Your Answer: "+ (x*y));
        }
    }*/
    }



