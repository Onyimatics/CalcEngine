package com.turnquest.calcengine;

public class Main {

    public static void main(String[] args) {
//        double val1 = 100.0d;
//        double val2 = 50.0d;
//        double result;
//        char opCode = 'd';

        //        parallel arrays
        double[] leftVals = { 100.0d, 25.0d, 225.0d, 11.0d };
        double[] rightVals = { 50.0d, 92.0d, 17.0d, 3.0d };
        char[] opCodes = {'d', 'a', 's', 'm' };
        double[] results = new double[opCodes.length];

        for(int i = 0; i < opCodes.length; i++) {
            if (opCodes[i] == 'a')
                results[i] = leftVals[i] + rightVals[i];
            else if (opCodes[i] == 's')
                results[i] = leftVals[i] - rightVals[i];
            else if (opCodes[i] == 'd') {
//                if (rightVals != 0.0d)
//                    results[i] = leftVals[i] / rightVals[i];
//                else
//                    results[i] = 0.0d;
                results[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;
            }
            else if (opCodes[i] == 'm')
                results[i] = leftVals[i] * rightVals[i];
            else {
                System.out.println("Error - Invalid opCode");
                results[i] = 0.0d;
            }

//            Using switch
//
//            switch (opCodes[i]) {
//                case 'a':
//                    results[i] = leftVals[i] + rightVals[i];
//                    break;
//                case 's':
//                    results[i] = leftVals[i] - rightVals[i];
//                    break;
//                case 'd':
//                    results[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;
//                    break;
//                case 'm':
//                    results[i] = leftVals[i] * rightVals[i];
//                    break;
//                default:
//                System.out.println("Error - Invalid opCode");
//                results[i] = 0.0d;
//                break;
//            }
        }
        for(double theResult : results) {
            System.out.print("result is ");
            System.out.println(theResult);
        }


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

//        Array
//        float[] theVals = new float[3];
//        theVals[0] = 10.0f;
//        theVals[1] = 20.0f;
//        theVals[2] = 15.0f;
        float[] theVals = { 10.0f, 20.0f, 15.0f };

        float sum = 0.0f;

        for(int i = 0; i < theVals.length; i++)
            sum += theVals[i];
        System.out.println(sum);

//        For-each Loop
        float[] dVals = { 10.0f, 20.0f, 15.0f };
        float sum2 = 0.0f;

        for(float currentVal : dVals)
            sum2 += currentVal;
        System.out.println(sum2);

//        Switch
        int mVal = 10;
        switch(mVal % 2) {
            case 0:
                System.out.print(mVal);
                System.out.println(" is even");
                break;

            case 1:
                System.out.print(mVal);
                System.out.println(" is odd");
                break;

            default:
                System.out.println("oops it broke");
                break;
        }

    }
}
