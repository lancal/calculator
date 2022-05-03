package com.company;

public class Addition extends Operation{
    int add;

    public Addition(int number1, int number2){

        super( number1, number2, '+');
        this.add = number1 + number2;
        super.result = this.add;

    }
}
