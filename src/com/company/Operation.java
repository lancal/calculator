package com.company;

public class Operation {
    int number1;
    int number2;

    int result;
    char operation;

    public Operation(int number1, int number2,  char operation){

        this.number1 = number1;
        this.number2 = number2;
        this.operation = operation;

    }

    public void show (){

        System.out.println(this.number1 + " " + this.operation + " " + this.number2 + " = " + this.result);

    }
}
