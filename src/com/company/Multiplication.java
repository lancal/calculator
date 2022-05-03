package com.company;

public class Multiplication extends  Operation{
    int mul;

    public Multiplication(int number1, int number2){

        super( number1, number2, '*');
        this.mul = number1 * number2;

    }
}
