package org.example.infra;

import org.example.application.Translator;

public class DingDongTranslator implements Translator {
    private final String FIZZ = "Ding";
    private final String BUZZ = "Dong";
    private final String FIZZBUZZ = "DingDong";


    @Override
    public String translateFizz() {
        return FIZZ;
    }

    @Override
    public String translateBuzz() {
        return  BUZZ;
    }

    @Override
    public String translateFizzBuzz() {
        return  FIZZBUZZ;
    }

    @Override
    public String translateNumber(int number) {
        return Integer.toString(number);
    }
}
