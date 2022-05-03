package com.company;

public class Subtraction extends Operation{
    int sub;

    public Subtraction(int number1, int number2){

        super( number1, number2, '-');
        this.sub = number1 - number2;
        super.result = this.sub;

    }
}
