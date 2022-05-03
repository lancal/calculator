package com.company;

public class Multiplication extends  Operation{
    double mul;

    public Multiplication(double number1, double number2){

        super( number1, number2, '*');
        this.mul = number1 * number2;
        super.result = this.mul;

    }
}
