package org.example.infra;

import org.example.application.Translator;

public class DefaultTranslator implements Translator {
    private final String FIZZ = "FIZZ";
    private final String BUZZ = "BUZZ";
    private final String FIZZBUZZ = "FIZZBUZZ";


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
