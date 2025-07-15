package org.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    //속성

    private int num1;
    private char elemen;
    private int num2;

    private List<Integer> results = new ArrayList<>();
    //생성자

    Calculator(int num1, char elemen, int num2) {
        this.num1 = num1;
        this.elemen = elemen;
        this.num2 = num2;
    }

    //기능
    public int calculate () {
        int result = 0;

        switch (elemen) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num1 / num2; break;
            default: System.out.print("지원되지 않는 연산자입니다.");
            return -1;
        }

        results.add(result);
        return result;
    }

    public List<Integer> getResult() {
        return results;
    }

    public void removeResult () {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }
}
