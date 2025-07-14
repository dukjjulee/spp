package org.example.calculator;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int num1, num2;
        char elemen;

        Scanner input = new Scanner(System.in);
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
            elemen = input.next().charAt(0);

            while (elemen != '+' && elemen != '-' && elemen != '*' && elemen != '/') {
                System.out.print("프로그램에서 사용되는 연산기호가 아닙니다( '+' '-' '*' '/' ): ");
                elemen = input.next().charAt(0);
            }

            System.out.print("숫자2: ");
            while (true) {
                try {
                    num2 = input.nextInt();
                    if (elemen == '/')
                        if (num2 == 0) {
                            System.out.print("\n숫자2: ");
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

            Calculator calculator = new Calculator(num1, elemen, num2);
            int result = calculator.calculate();
            System.out.println("=" + result);

            System.out.print("계산을 끝마치려면 'exit' 계속하려면 엔터: ");
            input.nextLine();
            exit = input.nextLine();
        }
    }
}
