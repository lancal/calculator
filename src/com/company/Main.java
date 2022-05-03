package com.company;
import java.util.Scanner;
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

    public static int number(String number){

        Scanner scan = new Scanner(System.in);

        System.out.print("Number " + number + ": ");
        return scan.nextInt();
    }
    public static void main(String[] args) {

        boolean flag = true;

        while (flag){

            int option = menuOption();
            int optionValidate = optionValidated(option);

            if (optionValidate == 1) {

                int number1 = number("a");
                int number2 = number("b");
                Addition add = new Addition(number1,number2);
                add.show();
            }

            if (optionValidate == 2) {

                int number1 = number("a");
                int number2 = number("b");
                Subtraction sub = new Subtraction(number1,number2);
                sub.show();
            }

            if(optionValidate == 6 ) {
                flag = false;
            }

        }
    }
}
