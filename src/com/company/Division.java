package com.company;

public class Division extends Operation{
    double div;

    public Division(double number1, double number2){

        super( number1, number2, '/');

        if(number2 == 0) System.out.println("Can't be Zero !");
        else
            if(number1 == 0 || (number1 > 0 && number2 > 0)){
                this.div = number1 / (number2 * -1);
            }else {
                this.div = number1 / number2;
            }
        super.result = this.div;

    }
}
