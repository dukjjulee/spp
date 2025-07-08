package org.example.calculator;
import java.util.Scanner;

public class Calculator {

public static void main (String[] args) {

    //두개의 숫자를 입력 = 변수 선언

    System.out.print("숫자1: ");
    Scanner input=new Scanner(System.in);
    int num1 = input.nextInt();
        do {
            System.out.print("숫자가 너무 작습니다.(양의 정수만 가능):");
            num1 = input.nextInt();
        } while (num1 <= 0);


    System.out.print("기호: ");
    char elemen = input.next().charAt(0);
        do {
            System.out.print("프로그램에서 사용되는 연산기호가 아닙니다( '+' '-' '*' '/' )");
            elemen = input.next().charAt(0);
        } while (elemen == '+' || elemen == '-' || elemen == '*' || elemen == '/');


    System.out.println("숫자2");
    int num2 = input.nextInt();
        do {
            System.out.print("숫자가 너무 작습니다.(양의 정수만 가능):");
            num2 = input.nextInt();
        } while (num2 <= 0);


    if (elemen == ('+'))
    System.out.println( num1 + " + " + num2 + " = " + (num1 + num2) );

    else if (elemen == ('-'))
        System.out.println( num1 + " - " + num2 + " = " + (num1 - num2) );

    else if (elemen == ('*'))
        System.out.println( num1 + " * " + num2 + " = " + (num1 * num2) );

    else if (elemen == ('/'))
        System.out.println( num1 + " / " + num2 + " = " + (num1 / num2) );


}
}
