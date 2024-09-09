package com.lambdas;

import java.util.function.Function;

@FunctionalInterface
interface StringUpperCase{
    String operate(String input);
}

public class FunctionalVSFunctionImplementation {
    public static void main(String[] args) {

        StringUpperCase str = new StringUpperCase() {
            @Override
            public String operate(String input) {
                return input.toUpperCase();
            }
        };

        System.out.println(str.operate("Hdddlloo"));


        Function<String,String> UpperCase = a -> a.toUpperCase();
        System.out.println(UpperCase.apply("dsfsdfsdfsdf"));
    }



}
