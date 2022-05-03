package com.company;
import java.util.Scanner;
import java.lang.Math;
import java.util.regex.Pattern;

public class Main {

    public static void Menu(){
        System.out.println();
        System.out.println("****************************");
        System.out.println("      Welcome to Menu       ");
        System.out.println("   Please choose a Option   ");
        System.out.println("****************************");
        System.out.println("  1)  Addition              ");
        System.out.println("  2)  Subtraction           ");
        System.out.println("  3)  Multiplication        ");
        System.out.println("  4)  Division              ");
        System.out.println("  5)  Equation              ");
        System.out.println("  6)  Exit                  ");
        System.out.println("****************************");

    }

//    private static Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
//
//    public static boolean isNumeric(String strNum) {
//        if (strNum == null) {
//            return false;
//        }
//        return pattern.matcher(strNum).matches();
//    }

    public static int optionValidated(int option){

        if (option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6){

            System.out.println("Please, give a Valid Option");

            return menuOption();

        }

        return option;
    }
    public static int menuOption(){
        Menu();
        Scanner scan = new Scanner(System.in);

        System.out.print("Option: ");
        return scan.nextInt();
    }

    public static double number(String number){

        Scanner scan = new Scanner(System.in);

        System.out.print("Number " + number + ": ");
        return scan.nextDouble();
    }
    public static void main(String[] args) {

        boolean flag = true;

        while (flag){

            int option = menuOption();
            int optionValidate = optionValidated(option);

            if (optionValidate == 1) {

                double number1 = number("a");
                double number2 = number("b");
                //Initialization object
                Addition add = new Addition(number1,number2);
                add.show();
            }

            if (optionValidate == 2) {

                double number1 = number("a");
                double number2 = number("b");
                Subtraction sub = new Subtraction(number1,number2);
                sub.show();
            }

            if (optionValidate == 3) {

                double number1 = number("a");
                double number2 = number("b");
                Multiplication mul = new Multiplication(number1,number2);
                mul.show();
            }

            if (optionValidate == 4) {

                double number1 = number("a");
                double number2 = number("b");
                Division div = new Division(number1,number2);
                div.show();
            }

            if (optionValidate == 5) {

                // number A
                double number1 = number("a");

                // number B
                double number2 = number("b");

                // number C
                double number3 = number("c");

                // -B
                double numberBMinus = number2 * -1;

                // 2A
                double denominator = number1 * 2;

                // AC
                Multiplication mulAC = new Multiplication(number1,number3);

                //4AC
                Multiplication mul4AC = new Multiplication(4,mulAC.result);

                // B * B
                Multiplication numberBB = new Multiplication(number2,number2);

                // B * B - 4AC
                Subtraction numberBB4AC = new Subtraction(numberBB.result,mul4AC.result);

                // square root
                double squareRoot = Math.sqrt( numberBB4AC.result);

                // -B + squareRoot
                Addition numeratorPositive = new Addition(numberBMinus,squareRoot);

                // -B - squareRoot
                Subtraction numeratorNegative = new Subtraction(numberBMinus,squareRoot);

                // ( -B + squareRoot ) / 2A
                Division numberX = new Division(numeratorPositive.result,denominator);

                // ( -B - squareRoot ) / 2A
                Division numberX2 = new Division(numeratorNegative.result,denominator);

                System.out.println("X1: " + numberX.result);
                System.out.println("X2: " + numberX2.result);



            }

            if(optionValidate == 6 ) {
                flag = false;
            }

        }
    }
}
