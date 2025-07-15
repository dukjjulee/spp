package org.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    //속성
    private List<Integer> results = new ArrayList<>();

    //생성자
    public int calculate (int num1, char elemen, int num2) {
        int result = 0;
    //기능

            switch (elemen) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
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
