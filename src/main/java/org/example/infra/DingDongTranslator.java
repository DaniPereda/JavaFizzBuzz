package org.example.infra;

import org.example.application.Translator;

public class DingDongTranslator implements Translator {
    @Override
    public String translateFizz() {
        return " --> Ding";
    }

    @Override
    public String translateBuzz() {
        return  " --> Dong";
    }

    @Override
    public String translateFizzBuzz() {
        return  " --> DingDong";
    }

    @Override
    public String translateNumber(int number) {
        return  " --> " + number;
    }
}
