package org.example.domain;

public class FizzBuzz {
    private int number;
    private FizzBuzzStates state;

    public FizzBuzz(int number)
    {
        this.number = number;
        setFizzBuzzStates();
    }

    public int getNumber() {
        return number;
    }

    public FizzBuzzStates getState() {
        return state;
    }

    private void setFizzBuzzStates()
    {
        if(isFizzBuzz())
        {
            this.state = FizzBuzzStates.FIZZBUZZ;
        }
        else if(isFizz())
        {
            this.state = FizzBuzzStates.FIZZ;
        }
        else if(isBuzz())
        {
            this.state = FizzBuzzStates.BUZZ;
        }
        else {
            this.state = FizzBuzzStates.NUMBER;
        }

    }

    private boolean isBuzz() {
        return this.number % 5 == 0;
    }

    private boolean isFizz() {
        return this.number % 3 == 0;
    }

    private boolean isFizzBuzz() {
        return this.number % 15 == 0;
    }
}
