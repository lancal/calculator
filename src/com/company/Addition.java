package com.company;

public class Addition extends Operation{
    double add;

    public Addition(double number1, double number2){

        super( number1, number2, '+');
        this.add = number1 + number2;
        super.result = this.add;

    }
}
