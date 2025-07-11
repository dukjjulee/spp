package org.example.calculator;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = -1;
        int num2 = -1;
        System.out.print("계산을 시작하려면 엔터, 끝마치려면 'exit': ");
        String exit = input.nextLine();

        while ( !exit.equals("exit")) {
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
            String elemen = input.nextLine();
            while (!elemen.equals('+') || !elemen.equals ('-') || !elemen.equals ('*') || !elemen.equals('/')) {
                System.out.print("프로그램에서 사용되는 연산기호가 아닙니다( '+' '-' '*' '/' ): ");
                elemen = input.nextLine();
            }

            System.out.print("숫자2: ");
            while (true) {
                try {
                    num2 = input.nextInt();
                    if (elemen.equals('/'))
                        if (num2 == 0) {
                            System.out.print("나눗셈 진행시 숫자2가 0이 될 수 없습니다\n숫자2: ");
                            num2 = -1;

                        }else {

                            if (num2 >= 0) {
                                break;

                            } else {
                                System.out.print("숫자가 너무 작습니다.(0 이상 가능)\n숫자2: ");
                            }
                        }
                } catch (Exception e) {
                    System.out.print("지원되지 않는 기능입니다.\n숫자2: ");
                    input.nextLine();
                    num2 = -1;

                }
            }

            if (elemen.equals('+'))

                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

            else if (elemen.equals ('-'))
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

            else if (elemen.equals ('*'))
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

            else if (elemen.equals('+') && (num2 != 0)) {
                System.out.println(num1 + " / " + num2 + " = " + (float) num1 / num2);
            }
            System.out.print("계산을 끝마치려면 'exit' 계속하려면 엔터: ");
            input.nextLine();
            exit = input.nextLine();
        }
    }
}
