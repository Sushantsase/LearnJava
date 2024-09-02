package com.wrapperclassexample;

public class MethodsInWrapper {
    public static void main(String[] args) {

        //valueOf

        Integer abc = Integer.valueOf(10);
        Boolean bl = Boolean.valueOf(true);
        System.out.println(abc);
        System.out.println(bl);

        //parseX

        int i = Integer.parseInt("35454");
        double dl = Double.parseDouble("4654.465");
        System.out.println(i);
        System.out.println(dl);

        //toString()

        String stre = abc.toString();
        System.out.println(stre);
        //compareTo
        Integer y=10;
        int result = abc.compareTo(y);
        System.out.println(result);

        Integer op = 35;
        System.out.println(op.floatValue());

        String str1 = abc.toString();
        String str2 = ""+ abc;

        Integer con = 50;
        Double dbh = Double.valueOf(con.intValue());
        System.out.println("ss"+dbh);
    }
}
