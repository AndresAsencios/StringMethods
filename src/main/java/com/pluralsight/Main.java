package com.pluralsight;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
//    public static void main(String[] args) {
//
//        String message = "Java Fundamentals            ";
//        message = message.toUpperCase();
//        message.length();
//        System.out.println(message.length());
//        message = message.trim();
//
//        System.out.println(message.length());
//
//
//
//        String enteredPincode = "1234";
//
//        if (enteredPincode.length() < 4) {
//            System.out.println("Not enough characters/numbers in the pincode");
//        }
//    }

    public static void main(String[] args) {

        String name = "Will";

        int indexNumber = name.indexOf("W");
        System.out.println(indexNumber);


        String bankAccountNumber = "35324445359";
        String firstThreeDigits = bankAccountNumber.substring(0,2);

        System.out.println(firstThreeDigits);
        String lastFourDigits = bankAccountNumber.substring(bankAccountNumber.length() - 4);

        System.out.println(lastFourDigits);
    }



    }
//}