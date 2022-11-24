package org.example.application;

import org.example.domain.FizzBuzz;

import java.util.List;

public interface DataView {
    void viewFizz(int number);
    void viewFizzBuzz(int number);
    void viewBuzz(int number);
    void viewNumber(int number);
}
