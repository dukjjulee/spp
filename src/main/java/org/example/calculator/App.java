package org.example.calculator;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int num1, num2;
        char elemen;

        Calculator calculator = new Calculator();

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
                    if (elemen == '/' && num2 == 0) {
                        System.out.print("0으로는 나눌 수 없습니다. \n숫자2: ");
                    }
                    else {
                        if (num2 >= 0) break;
                        else System.out.print("숫자가 너무 작습니다.(1 이상 가능)\n숫자2: ");
                    }

                } catch (Exception e) {
                    System.out.print("지원되지 않는 기능입니다.\n숫자2: ");
                    input.nextLine();
                }
            }

            input.nextLine();

            int result = calculator.calculate(num1, elemen, num2);
            System.out.println("=" + result);

            if (calculator.getResult().size() > 5) {
                calculator.removeResult();
                System.out.println("결과가 5개를 초과하여 오래된 결과를 삭제했습니다.");
            }

            System.out.print("계산을 시작하려면 엔터, 끝마치려면 'exit': ");
            exit = input.nextLine();

        }
        input.close();
        System.out.println("계산 종료");
    }
}
