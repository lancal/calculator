package com.company;

public class Division extends Operation{
    int div;

    public Division(int number1, int number2){

        super( number1, number2, '/');
        if(number2 == 0) System.out.println("Can't be Zero !");
        else this.div = number1 / number2;

    }
}
