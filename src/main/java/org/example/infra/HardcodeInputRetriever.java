package org.example.infra;

import org.example.application.InputRetriever;

public class HardcodeInputRetriever implements InputRetriever {
    @Override
    public int getMaxNumberToFizzBuzz() {
        return 16;
    }
}
