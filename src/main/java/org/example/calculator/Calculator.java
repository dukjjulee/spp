package org.example.calculator;

public class Calculator {
    //속성

    private int num1;
    private char elemen;
    private int num2;

    //생성자

    Calculator(int num1, char elemen, int num2) {
        this.num1 = num1;
        this.elemen = elemen;
        this.num2 = num2;
    }

    //기능
    public int calculate () {

        switch (elemen) {
            case '+':
                return (num1 + num2);
            case '-':
                return (num1 - num2);
            case '*':
                return (num1 * num2);
            case '/':
                return (num1 / num2);
        }return 0;
    }
}
