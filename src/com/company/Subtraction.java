package com.company;

public class Subtraction extends Operation{
    double sub;

    public Subtraction(double number1, double number2){

        super( number1, number2, '-');
        this.sub = number1 - number2;
        super.result = this.sub;

    }
}
