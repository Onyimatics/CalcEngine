package com.turnquest.calcengine;

public class Main {

    public static void main(String[] args) {
        double val1 = 100.0d;
        double val2 = 50.0d;
        double result;
        char opCode = 'd';

        if (opCode == 'a')
            result = val1 + val2;
        else if (opCode == 's')
            result = val1 - val2;
        else if (opCode == 'd') {
            result = val2 != 0.0d ? val1 / val2 : 0.0d;
//            if (val2 != 0.0d)
//                result = val1 / val2;
//            else
//                result = 0.0d;
        }
        else if (opCode == 'm')
            result = val1 * val2;
        else {
            System.out.println("Error - Invalid opCode");
            result = 0.0d;
        }
        System.out.println(result);

//        While loop
        int kVal = 5;
        int factorial = 1;

//        while (kVal > 1) {
//            factorial *= kVal;
//            kVal -= 1;
//        }

        while (kVal > 1)
            factorial *= kVal--;
        System.out.println(factorial);

//        Do-While Loop
        int iVal = 5;
        do {
            System.out.print(iVal);
            System.out.print(" * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        } while (iVal < 100);

//        For Loop
        for(int pVal = 1; pVal < 100; pVal *= 2) {
            System.out.println(pVal);
        }

    }
}
