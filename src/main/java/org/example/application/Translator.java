package org.example.application;

import org.example.domain.FizzBuzz;

import java.util.List;

public interface Translator {
    String translateFizz();
    String translateBuzz();
    String translateFizzBuzz();
    String translateNumber(int number);

}
