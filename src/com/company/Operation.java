package com.company;

public class Operation {
    double number1;
    double number2;

    double result;
    char operation;

    public Operation(double number1, double number2,  char operation){

        this.number1 = number1;
        this.number2 = number2;
        this.operation = operation;

    }

    public void show (){

        System.out.println(this.number1 + " " + this.operation + " " + this.number2 + " = " + this.result);

    }
}
