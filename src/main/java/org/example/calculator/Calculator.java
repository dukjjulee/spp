package org.example.calculator;
import java.util.Scanner;

public class Calculator {

    public static void main (String[] args) {
        Scanner input=new Scanner(System.in);
        int num1 = -1;
        int num2 = -1;

        System.out.print("숫자1: ");
             while (true) {
                 try {
                     num1 = input.nextInt();

                     if (num1 >= 0) {
                         break;

                     } else {
                         System.out.print("숫자가 너무 작습니다.(0 이상 가능)\n숫자1: ");
                     }
                 } catch (Exception e) {
                     System.out.print("지원되지 않는 기능입니다.\n숫자1: ");
                     input.nextLine();
                     num1 = -1;

                 }
             }


        System.out.print("기호: ");
        char elemen = input.next().charAt(0);
            while (elemen != '+' && elemen != '-' && elemen != '*' && elemen != '/') {
                System.out.print("프로그램에서 사용되는 연산기호가 아닙니다( '+' '-' '*' '/' ): ");
                    elemen = input.next().charAt(0);
            };

        System.out.print("숫자2: ");
        while (true) {
            try {
                num2 = input.nextInt();

                if (num2 >= 0) {
                    break;

                } else {
                    System.out.print("숫자가 너무 작습니다.(0 이상 가능)\n숫자2: ");
                }
            } catch (Exception e) {
                System.out.print("지원되지 않는 기능입니다.\n숫자2: ");
                input.nextLine();
                num2 = -1;

            }
        }

        if (elemen == ('+'))

            System.out.println( num1 + " + " + num2 + " = " + (num1 + num2) );

            else if (elemen == ('-'))
                System.out.println( num1 + " - " + num2 + " = " + (num1 - num2) );

            else if (elemen == ('*'))
                System.out.println( num1 + " * " + num2 + " = " + (num1 * num2) );

            else if (elemen == ('/') && (num2 != 0)) {
                System.out.println(num1 + " / " + num2 + " = " + (float) num1 / num2 );
            }
            else if (elemen == ('/') && (num2 == 0))
                System.out.println("나눗셈 진행시 숫자2가 0이 될 수 없습니다");

    }
}
