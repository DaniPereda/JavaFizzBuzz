package org.example;

import org.example.application.FizzBuzzService;
import org.example.application.FizzBuzzServiceImpl;
import org.example.infra.DingDongTranslator;
import org.example.infra.HardcodeInputRetriever;
import org.example.infra.ScreenView;

public class Main {
    public static void main(String[] args) {
        FizzBuzzService service = new FizzBuzzServiceImpl(new ScreenView(new DingDongTranslator()), new HardcodeInputRetriever());
        service.runService();


    }
}