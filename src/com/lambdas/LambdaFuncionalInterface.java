package com.lambdas;


@FunctionalInterface
interface AddFunction {
    int add(int a);

}

public class LambdaFuncionalInterface {
    public static void main(String[] args) {
  //Using anonymous class
//        AddFunction addFunction = new AddFunction() {
//            @Override
//            public int add(int a) {
//                return 0;
//            }
//        };

        AddFunction add = (a)->a+5;
        System.out.println(add.add(10));    }
}

//Using Sepratre class
class AddFunctionImpl implements AddFunction {

    @Override
    public int add(int a) {
        return 0;
    }
}

