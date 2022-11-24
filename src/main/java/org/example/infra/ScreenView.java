package org.example.infra;

import org.example.application.DataView;
import org.example.application.Translator;
import org.example.domain.FizzBuzz;

import java.util.List;

public class ScreenView implements DataView {

    private Translator translator;

    public ScreenView(Translator translator)
    {
        this.translator = translator;
    }


    @Override
    public void viewFizz(int number) {
        System.out.println(number + this.translator.translateFizz());
    }

    @Override
    public void viewFizzBuzz(int number) {
        System.out.println(number + this.translator.translateFizzBuzz());
    }

    @Override
    public void viewBuzz(int number) {
        System.out.println(number + this.translator.translateBuzz());
    }

    @Override
    public void viewNumber(int number) {
        System.out.println(number + this.translator.translateNumber(number));
    }
}
