package org.example.application;

import org.example.domain.FizzBuzz;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzzServiceImpl implements FizzBuzzService {
       private List<FizzBuzz> fizzBuzzList = new ArrayList<FizzBuzz>();
       private DataView dataAdapter;
       private InputRetriever inputRetriever;


       public FizzBuzzServiceImpl(DataView dataAdapter, InputRetriever inputRetriever)
       {
           this.dataAdapter = dataAdapter;
           this.inputRetriever = inputRetriever;
       }
       public void runService()
       {
           getResult();
           showResult();
       }

        @Override
        public int retrieveMaxNumToFizzBuzz() {
                return inputRetriever.getMaxNumberToFizzBuzz();
        }

        @Override
        public void showResult() {
                for(FizzBuzz fizzbuzz: this.fizzBuzzList)
                {
                        switch (fizzbuzz.getState())
                        {
                            case FIZZ -> {
                                this.dataAdapter.viewFizz(fizzbuzz.getNumber());
                                break;
                            }
                            case BUZZ -> {
                                this.dataAdapter.viewBuzz(fizzbuzz.getNumber());
                                break;
                            }
                            case FIZZBUZZ -> {
                                this.dataAdapter.viewFizzBuzz(fizzbuzz.getNumber());
                                break;
                            }
                            case NUMBER -> {
                                this.dataAdapter.viewNumber(fizzbuzz.getNumber());
                                break;
                            }

                        }
                }

        }

        @Override
        public void getResult() {
                int maxNumFizzBuzz = retrieveMaxNumToFizzBuzz();
                for (int iteratorFizzBuzz = 1; iteratorFizzBuzz <= maxNumFizzBuzz; iteratorFizzBuzz++)
                {
                        this.fizzBuzzList.add(new FizzBuzz(iteratorFizzBuzz));
                }

        }
}
