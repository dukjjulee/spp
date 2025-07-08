package org.example.calculator;
import java.util.Scanner;

public class Calculator {

public static void main (String[] args) {

    //두개의 숫자를 입력 = 변수 선언

    System.out.print("[숫자] [연산] [숫자] 작성 후 엔터: ");
    Scanner input=new Scanner(System.in);
    int num1 = input.nextInt();
    int num2 = input.nextInt();

    System.out.println( num1 + " + " + num2 + " = " + (num1 + num2) );


}
}
